package JijaLoqie.Launcher;


import JijaLoqie.Bots.MainBot;
import JijaLoqie.Bots.MotherBot;

import java.util.Scanner;

public class Launcher {
    public static MainBot bot;
    public static Scanner reader;

    public static void runBot() {
        if (bot == null) {
            bot = new MotherBot();
        }
        if (reader == null) {
            reader = new Scanner(System.in);
        }
        startBot();
    }

    private static void startBot() {
        System.out.println("Привет! Это Bot's Bots!");
        System.out.println("/help - перечислить все команды");
        System.out.println("/quit - выйти, стереть все данные");
        String command;
        do {
            command = reader.nextLine();
        }
        while (watchCommand(command));
    }

    private static boolean watchCommand(String command) {
        if (command.equals("/quit")) {
            System.out.println("Bye!");
            return false;
        } else if (command.startsWith("/setResponse ")) {
            System.out.println("Setting response!: " + command.substring(13) );
        } else if (command.equals("/save")) {
            System.out.println("Saving!!!!");
        } else if (command.equals("/help")) {
            showHelp();
        } else if (command.equals("/createBot")) {
            System.out.println("creating new Bot...");

        } else {
            System.out.println("Unknown command!");
        }
        return true;
    }

    private static void showHelp() {
        System.out.println("/createBot                     - создать нового бота");
        System.out.println("/setResponse [Name] [in] [out] - задать поведение ботов");
        System.out.println("/save                          - сохранить всех созданных ботов");
        System.out.println("/help                          - перечислить все команды");
        System.out.println("/quit                          - выйти, несохранённые данные будут потеряны");
    }
}
