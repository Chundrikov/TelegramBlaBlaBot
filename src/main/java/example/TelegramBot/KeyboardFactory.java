package example.TelegramBot;

import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class KeyboardFactory {
    public static ReplyKeyboard startButtons() {
        InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();

        rowInline.add(new InlineKeyboardButton().setText("DISCUSSION").setCallbackData(Constants.DISCUSSION));
        rowInline.add(new InlineKeyboardButton().setText("SMALL TALK").setCallbackData(Constants.SMALL_TALK));

        rowsInline.add(rowInline);
        inlineKeyboard.setKeyboard(rowsInline);
        return inlineKeyboard;
    }

    public static ReplyKeyboard oneButtons() {
        InlineKeyboardMarkup inlineKeyboard2 = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline2 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();

        rowInline2.add(new InlineKeyboardButton().setText("Like").setCallbackData(Constants.LIKE));
        rowInline2.add(new InlineKeyboardButton().setText("Dislike").setCallbackData(Constants.NOLIKE));
        rowInline2.add(new InlineKeyboardButton().setText("Misunderstanding").setCallbackData(Constants.NOUNDERSTAND));
        rowInline2.add(new InlineKeyboardButton().setText("So-so").setCallbackData(Constants.SOSO));

        rowsInline2.add(rowInline2);
        inlineKeyboard2.setKeyboard(rowsInline2);
        return inlineKeyboard2;
    }

    public static ReplyKeyboard twoButtons() {
        InlineKeyboardMarkup inlineKeyboard3 = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline3 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();

        rowInline3.add(new InlineKeyboardButton().setText("GOOD").setCallbackData(Constants.TWO_GOOD));
        rowInline3.add(new InlineKeyboardButton().setText("BAD").setCallbackData(Constants.TWO_BAD));

        rowsInline3.add(rowInline3);
        inlineKeyboard3.setKeyboard(rowsInline3);
        return inlineKeyboard3;
    }
}
