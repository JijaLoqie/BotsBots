package JijaLoqie.Actions;

public class BotActionPrint extends BotAction {
    public BotActionPrint(String value) {
        this.value = value;
    }
    @Override
    public void execute() {
        System.out.println(value);
    }
}
