package org.example.intelligentchatbot.repository;

import org.example.intelligentchatbot.entity.ChatInfo;

import java.util.List;

public interface ChatMemoryRepository {
    void save(String chatId, String title);
    void clearByChatId(String chatId);
    List<ChatInfo> getChats();
}
