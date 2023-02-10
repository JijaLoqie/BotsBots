package JijaLoqie.Bots;

public abstract class Bot {
    protected String name;
    abstract public void setRule(String in, String out);
    public String getName() {
        return name;
    }
}
