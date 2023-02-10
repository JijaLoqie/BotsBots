package JijaLoqie.Bots;

import JijaLoqie.Actions.BotAction;
import JijaLoqie.Actions.BotActionPrint;

import java.util.HashMap;
import java.util.Map;

public abstract class Bot {
    protected String name;

    protected Map<String, BotAction> botActions = new HashMap<>();

    /**
     * Указывает, что надо вызывать при заданном сообщении.
     * @param in - Заданное сообщение
     * @param out - Что надо вызывать. Может быть как команда, так и просто сообщение
     */
    public void setRule(String in, String out) {
        if (botActions.containsKey(out)) {
            addAction(in, botActions.get(out));
        } else {
            addAction(in, new BotActionPrint(out));
        }
    }

    /**
     * Добавляет новый функционал боту.
     * @param in - название-ключ события
     * @param newAction - само событие, с заданными параметрами.
     */
    public void addAction(String in, BotAction newAction) {
        botActions.put(in, newAction);
    }

    /**
     * Вызывает функционал по команде-ключу.
     * @param command - комманда-ключ
     */
    public void invokeAction(String command) {
        botActions.get(command).execute();
    }

    public String getName() {
        return name;
    }
}
