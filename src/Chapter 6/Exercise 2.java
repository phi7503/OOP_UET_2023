package javaapplication9;

import java.util.ArrayList;
import java.util.Collections;

class Card {

    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class CardSet {

    private ArrayList<Card> cards;

    public CardSet() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void display() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}

public class CardTestDrive {

    public static void main(String[] args) {
        CardSet deck = new CardSet();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.addCard(new Card(suit, rank));
            }
        }

        System.out.println("Deck before shuffling:");
        deck.display();

        deck.shuffle();

        System.out.println("\nDeck after shuffling:");
        deck.display();
    }
}
