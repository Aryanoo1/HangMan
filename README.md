# HangMan Project
A simple user controlled HangMan Game coded in JAVA.

## Hangman Game in Java - Text Editor Based

The Hangman Game implemented in Java is a console-based version of the classic word-guessing game. Developed to be played within a text editor, this project provides an engaging and interactive experience for players to challenge their vocabulary and word-guessing skills. Players attempt to guess a secret word by inputting individual letters, while the game provides feedback and progressively displays a hangman figure for each incorrect guess.

# Key Features:

Word Selection: The game randomly selects a word from a predefined list of words for the player to guess. This ensures variety and unpredictability in each playthrough.

Console Interface: The game is played entirely within a text editor or console window, with prompts and messages displayed as text output.

Guessing Mechanism: Players input a letter through the console, and the game checks whether the letter is present in the secret word. If correct, the letter is revealed; if incorrect, a part of the hangman figure is drawn.

Hangman Drawing: As incorrect guesses accumulate, a stick figure representation of a hangman is gradually drawn, adding suspense and challenge to the game.

Word Display: The secret word is initially displayed as a series of asterisks, with each correct letter guess revealing the corresponding positions.

Win and Lose Conditions: The game includes conditions for winning by successfully guessing the entire word and for losing by completing the hangman figure before the word is fully guessed.

# How to Play

To play the game, compile and run the `HangmanGame.java` file in your Java environment.

```bash
javac HangmanGame.java
java HangmanGame
