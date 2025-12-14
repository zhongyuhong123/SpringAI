package org.example.intelligentchatbot.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.intelligentchatbot.entity.ChatInfo;
import org.example.intelligentchatbot.entity.MessageVO;
import org.example.intelligentchatbot.repository.MemoryChatHistoryRepository;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.AbstractChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.messages.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatClient chatClient;

    @Autowired
    private MemoryChatHistoryRepository memoryChatHistoryRepository;
    @Autowired
    private ChatMemory chatMemory;

    public ChatController(ChatClient DSChatClient){
        this.chatClient = DSChatClient;
    }

    @RequestMapping(value = "/stream", produces = "text/html;charset=utf-8")
    public Flux<String> stream(String prompt, String chatId){
        log.info("chatId:{}, prompt={}", chatId, prompt);
        memoryChatHistoryRepository.save(chatId, prompt);
        return this.chatClient.prompt()
                .user(prompt)
                .advisors(spec -> spec.param(AbstractChatMemoryAdvisor.CHAT_MEMORY_CONVERSATION_ID_KEY, chatId))
                .stream()
                .content();
    }

    @RequestMapping("/getChatIds")
    public List<ChatInfo> getChatIds(){
        return memoryChatHistoryRepository.getChats();
    }

    @RequestMapping("/getChatHistory")
    public List<MessageVO> getChatHistory(String chatId){
        log.info("获取会话记录，chatId:{}", chatId);
        List<Message> messages = chatMemory.get(chatId, 20);
        return messages.stream().map(MessageVO::new).collect(Collectors.toList());
    }

    @RequestMapping("/deleteChat")
    public Boolean deleteChat(String chatId){
        log.info("删除会话, chatId:{}", chatId);
        try {
            memoryChatHistoryRepository.clearByChatId(chatId);
            chatMemory.clear(chatId);
        }catch (Exception e){
            log.error("删除会话失败, chatId:{}", chatId);
            return false;
        }
        return true;
    }
}
