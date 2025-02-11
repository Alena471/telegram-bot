package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "kffkemkebot"; // Имя бота, которое вы задали в BotFather
    }

    @Override
    public String getBotToken() {
        return "7955780291:AAGOkwIawTexxf6hBF5ljHlK_4faq1bK4SE"; // Токен из BotFather
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Проверяем, есть ли сообщение от пользователя
        if (update.hasMessage() && update.getMessage().hasText()) {
            String chatId = update.getMessage().getChatId().toString();
            String receivedText = update.getMessage().getText();

            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText("Вы сказали: " + receivedText);

            try {
                execute(message); // Отправка сообщения пользователю
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
