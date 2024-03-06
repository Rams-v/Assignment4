public class Card {
    // Private variables to store the suit and value of the card
    private String suit;
    private String value;

    // Constructor to initialize the card with a given suit and value
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    // Getter method to retrieve the suit of the card
    public String getSuit() {
        return suit;
    }

    // Setter method to set the suit of the card
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getter method to retrieve the value of the card
    public String getValue() {
        return value;
    }

    // Setter method to set the value of the card
    public void setValue(String value) {
        this.value = value;
    }

    // Method to represent the card as a string
    @Override
    public String toString() {
        return "\n " + value + " of " + suit;
    }
}
