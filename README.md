# 🎮Snap-Game

## 🚀Project Overview and How to Play
This is a classic, terminal based, Snap card game. Two players take turns to draw cards until we have 2 cards that consecutively match by number or value i.e two Queens (Q), two 7's. When this match occurs, the player will have 2 seconds to type 'SNAP' for a chance to win. If the timer runs out before you've typed 'snap', the game will continue until another match occurs, to which you will have another chance to win. If a player 'snap's in time or the deck is empty the game ends.

## 📥 Installation and SetUp

If you would like the download the game and play locally please follow the below steps:

1. From your terminal you will want to move/cd to the folder you would like to clone the game to.
2. To clone the repo enter:
    ```
    git clone https://github.com/Cogger101/snap-game.git
    ```
3. Move into the project folder/directory:
    ```
   cd snap-game
   ```
4. Use an IDE (Intellij) to open and run your cloned game
5. You will want to run the game from the Main class - src -> main -> java -> Main
6. - Right click on main and scroll until you find 'Run Main.main()' -> click to run application. </br>
   - You can alternatively click on the <img src=img.png alt="play button img" width="10" height="10"> to run the game in the terminal.

## ♠️ How to play ♥️

- Once in the terminal each player will be prompted for their names
- Player iput your name and press enter
- Player two input your name and press enter
- Game will start
- You will be ask if you'd like to shuffle your deck - for best game player input yes and press enter
- Once your deck is shuffled, each player will press enter to draw a new card
- When 2 cards match you will have 2 seconds to type snap. 
- If you type snap in time you WIN the game otherwise the game will continue until another opportunity arises to type 'Snap'
- If the 52 card deck runs out or a player wins, you will be asked if you would like to play again (yes/no)

## 🛠️Prerequisites

- Java JDK 8 or higher
- Maven (for dependency management)
- Git (for cloning the repository)
- Intellij (for development - recommended)

## 🛠️Project Breakdown and stages

### Stage 1
Using classes, ArrayLists and methods, create a deck of Cards.
You should use the following classes:
CardGame
- [x] Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards. This is created and populated when the game is constructed.</br>
- [x] Has a name which is also defined in the constructor.</br>
- [x] Has a getDeck method that lists out the cards in the deck.
Card</br>
- [x] Has a String suit. Use the unicode characters of heart, club, diamond and spade.</br>
- [x] Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)</br>
- [x] Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)</br>
- [x] Has a toString method that describes the class

### Stage 2
Let's get some core functionality to our CardGame by implementing the following methods:
- [x] Card dealCard() - Takes the card from the top of the deck and returns it.</br>
- [x] ArrayList<Card> sortDeckInNumberOrder() - Sorts the deck in number order (e.g. 2222333344445555 etc) and stores the new shuffled deck back into the deckOfCards attribute.</br>
- [x] ArrayList<Card> sortDeckIntoSuits() - Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and stores the new shuffled deck back into the deckOfCards attribute.</br>
- [x] ArrayList<Card> shuffleDeck() - Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute.</br>

### Stage 3
Create a class for Snap that extends CardGame. This class should use the methods defined above, as well as some new ones, to enable the user to play the game snap according to the following rules:</br>
- [x] By pressing enter in the command line, the user takes their turn.</br>
- [x] Each turn, a new card is dealt from the deck.</br>
- [x] The game continues until two cards in a row have the same symbol, at which point the “player” wins and the game ends.</br>

### Stage 4
Create a Player class and enable the snap game to be two players, with the users taking it in turns to go. If the snap occurs on the user's turn, they win. Add a timer so that when there is a snap opportunity, the player has 2 seconds to submit the word “snap” in order to win. If they don’t type it in time, they lose.



