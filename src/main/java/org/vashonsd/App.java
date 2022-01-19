package org.vashonsd;

public class App {

    public static void main(String[] args) {
        RandomBot.playGames();
        {
            RandomBot.workBot();
        }
        {
            RandomBot.quizBot();
        }
        RandomBot.bot();
    }
}
