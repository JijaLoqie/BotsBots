package JijaLoqie.Bots;

import java.util.ArrayList;

public class MotherBot extends SimpleBot implements MainBot {
    ArrayList<Bot> bots;

    @Override
    public Bot createNewBot(BotConfig bc) {
        return new SimpleBot();
    }

    @Override
    public ArrayList<Bot> getAllBots() {
        return bots;
    }

    @Override
    public Bot getBotByName(String name) {
        for (Bot bot : bots) {
            if (bot.getName().equals(name)) {
                return bot;
            }
        }
        return null;
    }

    @Override
    public void setRule(String in, String out) {

    }
}
