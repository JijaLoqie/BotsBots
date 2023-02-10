package JijaLoqie.Bots;

import JijaLoqie.Actions.BotActionPrint;

public class SimpleBot extends Bot {
    public SimpleBot() {
        addAction("/print", new BotActionPrint());
    }
    @Override
    public void setRule(String in, String out) {}
}
