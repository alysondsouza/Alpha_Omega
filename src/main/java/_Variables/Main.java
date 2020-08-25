package _Variables;

import java.util.Random;

public class Main {

    //random instantiate
    private static Random random = new Random();

    //deck size
    private final static int DECK_SIZE = 52;

    //random cards drawn
    private final static int CARDS = 4;

    //arrays with deck information
    private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static void main(String[] args) {
        cardGame();
    }

    public static void cardGame() {

        for (int i = 0; i < CARDS; i++) {

            //picks random deck number
            int deck = random.nextInt(DECK_SIZE);

            //picks random suit
            int suitsArray = random.nextInt(suits.length);

            //picks random rank
            int ranksArray = random.nextInt(ranks.length);

            //makes variables from random generated suit and rank
            String printSuit = suits[suitsArray];
            String printRank = ranks[ranksArray];

            System.out.printf("Kortnummer %d, %s %s\n", deck, printSuit, printRank);
        }
    }
}