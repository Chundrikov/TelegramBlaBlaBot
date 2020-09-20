package example.TelegramBot;

import org.telegram.abilitybots.api.sender.MessageSender;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MessageFactory {
    private final MessageSender sender; //используется для отправки сообщений обратно пользователю

    public MessageFactory(MessageSender sender) {
        this.sender = sender;
    }

    public void start (long chatId) {
        try {
            sender.execute(new SendMessage()
                    .setText(Constants.START_REPLY)
                    .setChatId(chatId));

            sender.execute(new SendMessage()
                    .setText(Constants.CHOOSE_OPTION)
                    .setChatId(chatId)
                    .setReplyMarkup(KeyboardFactory.startButtons()));


        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}

