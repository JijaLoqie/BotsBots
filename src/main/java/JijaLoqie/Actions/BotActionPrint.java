package JijaLoqie.Actions;

public class BotActionPrint extends BotAction {
    @Override
    public void execute(String[] args) {
        System.out.println(args[0]);
    }
}
