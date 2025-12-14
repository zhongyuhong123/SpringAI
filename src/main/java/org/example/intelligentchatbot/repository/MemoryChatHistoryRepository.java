package org.example.intelligentchatbot.repository;

import org.example.intelligentchatbot.entity.ChatInfo;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MemoryChatHistoryRepository implements ChatMemoryRepository{

    private Map<String, String> chatInfos = new LinkedHashMap<>();

    @Override
    public void save(String chatId, String title) {
        chatInfos.put(chatId, title);
    }

    @Override
    public void clearByChatId(String chatId) {
        chatInfos.remove(chatId);
    }

    @Override
    public List<ChatInfo> getChats() {
        return chatInfos.entrySet().stream()
                .map(entry -> new ChatInfo(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
}
