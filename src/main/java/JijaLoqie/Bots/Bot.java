package JijaLoqie.Bots;

import JijaLoqie.Actions.BotAction;

import java.util.HashMap;
import java.util.Map;

public abstract class Bot {
    protected String name;

    protected Map<String, BotAction> botActions = new HashMap<>();
    abstract public void setRule(String in, String out);

    /**
     * Добавляет новый функционал боту, с уже заданными в newAction параметрами //todo: добавить возможность указать параметры
     * @param in - название-ключ события
     * @param newAction - само событие, с заданными параметрами
     */
    public void addAction(String in, BotAction newAction) {
        botActions.put(in, newAction);
    }

    /**
     * Вызывает функционал по команде-ключу
     * @param command - комманда-ключ
     * @param args - параметры
     */
    public void invokeAction(String command, String[] args) {
        botActions.get(command).execute(args);
    }

    public String getName() {
        return name;
    }
}
