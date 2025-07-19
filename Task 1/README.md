# Number Guessing Game

A simple console-based number guessing game written in Java as part of CodeSoft internship program.

## About The Game

This is a fun interactive game where the computer picks a random number between 1 and 100, and the player tries to guess it. The game provides hints after each guess to help the player find the correct number.

## How To Play

1. Run the program
2. The computer will pick a secret number between 1 and 100
3. You have 7 attempts to guess the correct number
4. After each guess, you'll get a hint:
   - "Too small" - your guess is lower than the secret number
   - "Too big" - your guess is higher than the secret number
   - "YES! You got it right!" - you found the correct number
5. Win points based on how quickly you guess correctly
6. Play multiple rounds and track your statistics

## Features

- Random number generation (1-100 range)
- Limited attempts per game (7 tries)
- Helpful hints for each guess
- Score calculation based on attempts used
- Multiple rounds gameplay
- Win/loss statistics tracking
- User-friendly console interface

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any text editor or Java IDE
- Command line/Terminal access

## How To Run

1. **Compile the program:**
   ```bash
   javac GuessTheNumber.java
   ```

2. **Run the program:**
   ```bash
   java GuessTheNumber
   ```

## Sample Gameplay

```
Welcome to Guess The Number Game!

--- Game 1 ---
I picked a number between 1 and 100
You have 7 tries to guess it!
Try 1: Enter your guess: 50
Too big! Try smaller number
You have 6 tries left
Try 2: Enter your guess: 25
Too small! Try bigger number
You have 5 tries left
Try 3: Enter your guess: 37
YES! You got it right!
The number was 37
You won in 3 tries!
Your score: 50 points
```

## Scoring System

- Points are awarded based on how few attempts you need
- Faster guesses = Higher scores
- Formula: (Maximum tries - Your tries + 1) × 10

## Project Structure

```
GuessTheNumber.java    # Main game file containing all game logic
README.md             # This documentation file
```

## Learning Objectives

This project demonstrates:
- Basic Java programming concepts
- User input handling with Scanner class
- Random number generation
- Conditional statements (if-else)
- Loops (while loops)
- Variables and data types
- Basic game logic implementation

## Technologies Used

- **Language:** Java
- **Input/Output:** Scanner class for console interaction
- **Random Generation:** java.util.Random class
