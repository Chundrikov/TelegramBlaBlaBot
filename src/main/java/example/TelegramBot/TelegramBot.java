package example.TelegramBot;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Flag;
import org.telegram.abilitybots.api.objects.Reply;
import org.telegram.telegrambots.api.objects.Update;

import java.util.function.Consumer;

import static org.telegram.abilitybots.api.objects.Locality.ALL;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;
import static org.telegram.abilitybots.api.util.AbilityUtils.getChatId;

public class TelegramBot extends AbilityBot {

    MessageFactory messageFactory;

    @Override
    public int creatorId() {
        return Constants.CREATOR_ID;
    }

    public TelegramBot() {
        this(Constants.BOT_TOKEN, Constants.BOT_USERNAME);
    }

    private TelegramBot(String botToken, String botUsername) {
        super(botToken, botUsername);
        messageFactory = new MessageFactory(sender);
    }

    public Ability replyToStart() {
        return Ability
                .builder()
                .name("start")
                .info(Constants.START_DESCRIPTION)
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx ->  messageFactory.start(ctx.chatId()))
                .build();
    }

    public Reply replyToButtons1() {
        Consumer<Update> action = upd -> messageFactory.replyToButtons1(getChatId(upd), upd.getCallbackQuery().getData());
        return Reply.of(action, Flag.CALLBACK_QUERY);
    }

    public Reply replyToButtons2() {
        Consumer<Update> action = upd -> messageFactory.replyToButtons2(getChatId(upd), upd.getCallbackQuery().getData());
        return Reply.of(action, Flag.CALLBACK_QUERY);
    }

    public Reply replyToButtons3() {
        Consumer<Update> action = upd -> messageFactory.replyToButtons3(getChatId(upd), upd.getCallbackQuery().getData());
        return Reply.of(action, Flag.CALLBACK_QUERY);
    }

}
