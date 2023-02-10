package JijaLoqie.Bots;


import java.util.ArrayList;

public interface MainBot {
    Bot createNewBot(BotConfig bc);
    ArrayList<Bot> getAllBots();
    Bot getBotByName(String name);
}
