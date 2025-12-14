package org.example.intelligentchatbot.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder) {
        return chatClientBuilder
                //设置系统提示词
                .defaultSystem("你叫小特, 是一款智能AI助手, 你擅长Java和C++, 主要负责日常答疑, 请以友好的态度来回答问题")
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .build();
    }
}
