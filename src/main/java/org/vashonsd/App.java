package org.vashonsd;

public class App {

    public static void main(String[] args) {
        Bot.playGames();
        {
            Bot.workBot();
        }
        {
            Bot.QuizBot();
        }
        Bot.bot();
    }
}
