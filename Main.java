// Name: Ramitha V
// PRN: 22070126082
// Batch: AIML B1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the Deck class
        Deck deck = new Deck();
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int choice; // Variable to store user's menu choice
        do {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Shuffle Deck");
            System.out.println("4. Deal Cards");
            System.out.println("5. Find Card");
            System.out.println("6. Same Card (Same Suit)");
            System.out.println("7. Compare Card (Same Rank/Number)");
            System.out.println("8. Print Card");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            // Read user's choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Option to create a new deck
                    deck.createDeck();
                    break;
                case 2:
                    // Option to print the deck
                    System.out.println("\nPrinting Deck:");
                    deck.printDeck();
                    break;
                case 3:
                    // Option to shuffle the deck
                    System.out.println("\nShuffling Deck:");
                    deck.shuffleDeck();
                    deck.printDeck();
                    break;
                case 4:
                    // Option to deal 5 cards from the deck
                    System.out.println("\nDealing 5 Cards:");
                    deck.dealCards();
                    break;
                case 5:
                    // Option to find a specific card in the deck
                    System.out.println("\nFind Card:");
                    System.out.print("Enter suit of the card: ");
                    String suit = scanner.next();
                    System.out.print("Enter value of the card: ");
                    String value = scanner.next();
                    int foundIndex = deck.findCard(suit, value);
                    if (foundIndex != -1) {
                        System.out.println("Card found at position: " + foundIndex);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 6:
                    // Option to check if two cards have the same suit
                    System.out.println("\nSame Card (Same Suit):");
                    System.out.print("Enter position of the first card: ");
                    int pos1 = scanner.nextInt();
                    System.out.print("Enter position of the second card: ");
                    int pos2 = scanner.nextInt();
                    boolean sameSuitResult = deck.sameCard(pos1, pos2);
                    if (sameSuitResult) {
                        System.out.println("The cards at the entered positions are of the same suit");
                    } else {
                        System.out.println("The cards at the entered positions are not of the same suit");
                    }
                    break;
                case 7:
                    // Option to check if two cards have the same rank/number
                    System.out.println("\nCompare Card (Same Rank/Number):");
                    System.out.print("Enter position of the first card: ");
                    int compPos1 = scanner.nextInt();
                    System.out.print("Enter position of the second card: ");
                    int compPos2 = scanner.nextInt();
                    boolean compareResult = deck.compareCard(compPos1, compPos2);
                    if (compareResult) {
                        System.out.println("The cards at the entered positions are of the same value");
                    } else {
                        System.out.println("The cards at the entered positions are not of the same value");
                    }
                    break;
                case 8:
                    // Option to print details of a specific card
                    System.out.println("\nPrint Card:");
                    System.out.print("Enter position of the card: ");
                    int printPos = scanner.nextInt();
                    deck.printCard(printPos);
                    break;
                case 9:
                    // Option to exit the program
                    System.out.println("\nExiting...");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 9.");
            }
        } while (choice != 9); // Continue the loop until user chooses to exit

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
