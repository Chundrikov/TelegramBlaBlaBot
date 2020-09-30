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
                    .setText(Constants.CHOOSE_OPTION)
                    .setChatId(chatId)
                    .setReplyMarkup(KeyboardFactory.startButtons()));


        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void replyToButtons1(long chatId, String buttonId) {
        try {
            switch (buttonId) {
                case Constants.DISCUSSION:
                    replyToDiscussion(chatId);
                    one(chatId);
                    break;
                case Constants.SMALL_TALK:
                    replyToSmallTalk(chatId);
                    two(chatId);
                    break;
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Chat state for user " + chatId + " is " );
    }

    private void replyToDiscussion(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.TALK)
                .setChatId(chatId));

    }


    private void replyToSmallTalk(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.TALK)
                .setChatId(chatId));

    }
//Пользователь выбрал вариант "Обсуждение"

    public void one (long chatId) {
        try {
            sender.execute(new SendMessage()
                    .setText(Constants.CHOOSE_OPTION)
                    .setChatId(chatId)
                    .setReplyMarkup(KeyboardFactory.oneButtons()));


        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
//Создаем второй набор клавиатуры

    public void replyToButtons2(long chatId, String buttonId) {
        try {
            switch (buttonId) {
                case Constants.LIKE:
                    replyToONELIKE(chatId);
                    replyToONELIKE2(chatId);
                    replyToONELIKE3(chatId);
                    replyToONELIKE4(chatId);
                    break;
                case Constants.NOLIKE:
                    replyToONENOLIKE(chatId);
                    replyToONENOLIKE2(chatId);
                    break;
                case Constants.NOUNDERSTAND:
                    replyToONENOUNDERSTAND(chatId);
                    break;
                case Constants.SOSO:
                    replyToONESOSO(chatId);
                    break;
            }

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Chat state for user " + chatId + " is " );
    }

    private void replyToONELIKE(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_LIKE)
                .setChatId(chatId));
    }

    private void replyToONELIKE2(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_LIKE2)
                .setChatId(chatId));
    }

    private void replyToONELIKE3(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_LIKE3)
                .setChatId(chatId));
    }

    private void replyToONELIKE4(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_LIKE4)
                .setChatId(chatId));
    }

    private void replyToONENOLIKE(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_NOLIKE)
                .setChatId(chatId));
    }

    private void replyToONENOLIKE2(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_NOLIKE2)
                .setChatId(chatId));
    }

    private void replyToONENOUNDERSTAND(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_NOUNDERSTAND)
                .setChatId(chatId));
    }

    private void replyToONESOSO(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.ONE_SOSO)
                .setChatId(chatId));
    }

//Пользователь выбрал вариант "Небольшой разговор"

    public void two (long chatId) {
        try {
            sender.execute(new SendMessage()
                    .setText(Constants.CHOOSE_OPTION)
                    .setChatId(chatId)
                    .setReplyMarkup(KeyboardFactory.twoButtons()));


        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    //Создаем третий вариант набора клавиатуры

    public void replyToButtons3(long chatId, String buttonId) {
        try {
            switch (buttonId) {
                case Constants.TWO_GOOD:
                    replyToTWOGOOD(chatId);
                    break;
                case Constants.TWO_BAD:
                    replyToTWOBAD(chatId);
                    break;
            }

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Chat state for user " + chatId + " is " );
    }

    private void replyToTWOGOOD(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.TWO_GOOD)
                .setChatId(chatId));
    }
    private void replyToTWOBAD(long chatId) throws TelegramApiException {
        sender.execute(new SendMessage()
                .setText(Constants.TWO_BAD2)
                .setChatId(chatId));
    }
}

