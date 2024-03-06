import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Deck {
    // ArrayList to store cards in the deck
    private ArrayList<Card> cards = new ArrayList<>();

    // Constructor that also creates the deck by calling createDeck() method
    public Deck() {
        createDeck();
    }

    // Method to create a standard deck of 52 playing cards
    public void createDeck() {
        // Array containing possible values of cards
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        // Array containing possible suits of cards
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};

        // Loop through each suit and value to create each card
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value)); // Add a new card to the deck
            }
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards); // Shuffle the cards using Collections.shuffle() method
    }

    // Method to print all the cards in the deck
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card); // Print each card in the deck
        }
    }

    // Method to deal 5 random cards from the deck
    public void dealCards() {
        shuffleDeck(); // Shuffle the deck before dealing
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i)); // Print each dealt card
        }
    }

    // Method to check if two cards in the deck are from the same suit
    public boolean sameCard(int pos1, int pos2) {
        if (pos1 < 0 || pos1 >= cards.size() || pos2 < 0 || pos2 >= cards.size()) {
            System.out.println("Invalid positions."); // Display error message for invalid positions
            return false;
        }

        Card card1 = cards.get(pos1);
        Card card2 = cards.get(pos2);

        // Return true if both cards have the same suit, false otherwise
        return Objects.equals(card1.getSuit(), card2.getSuit());
    }

    // Method to check if two cards in the deck have the same rank or number
    public boolean compareCard(int pos1, int pos2) {
        if (pos1 < 0 || pos1 >= cards.size() || pos2 < 0 || pos2 >= cards.size()) {
            System.out.println("Invalid positions."); // Display error message for invalid positions
            return false;
        }

        Card card1 = cards.get(pos1);
        Card card2 = cards.get(pos2);

        // Return true if both cards have the same value, false otherwise
        return Objects.equals(card1.getValue(), card2.getValue());
    }

    // Method to find the index of a specific card in the deck based on its suit and value
    public int findCard(String suit, String value) {
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            // Check if the current card has the specified suit and value
            if (card.getSuit().equalsIgnoreCase(suit) && card.getValue().equalsIgnoreCase(value)) {
                return i; // Return the index of the card if found
            }
        }
        return -1; // Return -1 if the card is not found in the deck
    }

    // Method to print details of a specific card in the deck based on its position
    public void printCard(int position) {
        if (position >= 0 && position < cards.size()) {
            Card card = cards.get(position);
            System.out.println(card); // Print details of the card at the specified position
        } else {
            System.out.println("Invalid position."); // Display error message for invalid position
        }
    }
}
