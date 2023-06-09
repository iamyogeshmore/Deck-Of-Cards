package org.bridgelabz;

/*Java program to simulate a deck of playing cards.
The program should be able to initialize and shuffle the deck,
as well as display the shuffled cards on the console.*/
public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen"};
        for (int i = 0; i < deck.length; i++) {          // Initialize cards
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {          // Shuffle the cards
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        for (int i = 0; i < 52; i++) {          // Display the all the cards
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }
}