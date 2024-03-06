# Playing Card Deck Java Program

## Overview
This Java program simulates a standard deck of playing cards and provides functionalities to manipulate and interact with the deck. It consists of two main classes: Deck and Card.

## Features
- Create a standard deck of 52 playing cards.
- Shuffle the deck.
- Print the entire deck of cards.
- Deal 5 random cards from the deck.
- Find a specific card in the deck.
- Check if two cards have the same suit.
- Check if two cards have the same rank or number.
- Print details of a specific card.

## Classes:

- Deck Class: Manages a collection of Card objects representing a standard deck of 52 playing cards.
Provides methods to create, shuffle, print, deal, and manipulate the deck of cards.

- Card Class: Represents a playing card with a suit and a value.
Provides methods to get and set the suit and value of the card.

## Detailed Explanation:

- Create Deck: Generates a standard deck of 52 playing cards with four suits (Spades, Clubs, Hearts, Diamonds) and thirteen values (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K).
- Shuffle Deck: Randomizes the order of cards in the deck using the Collections.shuffle() method.
- Print Deck: Displays the entire deck of cards, showing the suit and value of each card.
- Deal Cards: Deals 5 random cards from the deck after shuffling.
- Find Card: Searches for a specific card in the deck based on its suit and value. Returns the index of the card if found, or -1 if not found.
- Same Card: Checks if two cards in the deck are from the same suit. Returns true if both cards have the same suit, false otherwise.
- Compare Card: Checks if two cards in the deck have the same rank or number. Returns true if both cards have the same value, false otherwise.
- Print Card: Prints details of a specific card in the deck based on its position, showing the suit and value.







