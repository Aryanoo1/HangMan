package HangmanProject;

//  The hangman star drawing is left
import java.util.*;

public class HangmanGame {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Do You Want to Play ?????? ");
		System.out.println("Enter (YES or NO)" + "\t\t\t(The field is not case sensitive)");
		String initialize = scn.next();
		if (initialize.equalsIgnoreCase("yes")) {
			String[] array = { "apple", "banana", "orange", "watermelon", "plane", "refrigerator", "atmosphere", "sky",
					"table", "chair", "cloud", "television", "wall", "advertisement", "movie", "actor", "window", "car",
					"bicycle", "spray", "bottle", "remote", "book", "pencil", "tubelight", "blackboard", "potato",
					"onion", "grapes", "scissor", "painting", "statue", };
			String word = array[new Random().nextInt(array.length)];
			StringBuilder word1 = new StringBuilder(word);
			int spaces = word.length();
			ArrayList<Character> list = new ArrayList<>();
			for (int i = 0; i < spaces; i++) {
				list.add('*');
			}
			Game(list, word1, 3, spaces);
		} else {
			System.out.println("Thanks For Coming !!!!!!!!!!!!!!!!! ");
		}
	}

	public static void Game(ArrayList<Character> list, StringBuilder word1, int life, int currSpaces) {
		if (life == 0) {
			System.out.println("Sorry Game Over !!!!!!!!!!!!!!!!!!!");
			System.out.println("The word was -->> " + word1);
			Man(life);
			System.out.println();
			return;
		}
		if (currSpaces == 0) {
			System.out.println("Congratulations you have guesssed the word !!!!!!!!!!!!!!!!!!");
			System.out.print("=============>>>>>>>>>>      ");
			display(list);
			System.out.print("      <<<<<<<<<==============");
			System.out.println();
			System.out.println();
			return;
		}
		System.out.print("=============>>>>>>>>>>      ");
		display(list);
		System.out.print("      <<<<<<<<<==============");
		System.out.println();
		System.out.print("Guess the word ????   ==>>   ");
		char guess = scn.next().charAt(0);
		if (Character.isUpperCase(guess)) {
			guess = Character.toLowerCase(guess);
		}
		int count = 0;
		for (int i = 0; i < word1.length(); i++) {
			if (guess == word1.charAt(i)) {
				list.set(i, guess);
				count++;
				currSpaces--;
			}
		}
		if (count == 0) {
			life--;
			if (life != 0) {
				System.out.println("Sorry Wrong Guess !!!!!!!!!!!!!!");
				System.out.println("Try Again");
				System.out.println("You have " + life + " lives left");
				Man(life);
				System.out.println();
				Game(list, word1, life, currSpaces);
			} else {
				Game(list, word1, life, currSpaces);
			}
		} else {
			System.out.println("Correct Guess !!!!!!!!!!!!!!!");
			System.out.println("You have " + life + " lives left");
			System.out.println();
			Game(list, word1, life, currSpaces);
		}
	}

	public static void display(ArrayList<Character> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	public static void Man(int life) {
		if(life == 2) {
			System.out.println(" ------------ ");
		}else if(life == 1) {
			System.out.println(" ------------ ");
			System.out.println("      |      ");
			System.out.println("      |      ");
			System.out.println("      O       ");
		}else if(life == 0) {
			System.out.println(" ------------ ");
			System.out.println("      |      ");
			System.out.println("      |      ");
			System.out.println("      O       ");
			System.out.println("      |      ");
			System.out.println("     /|\\      ");
			System.out.println("      |       ");
			System.out.println("     / \\      ");
//			System.out.println("             ");
		}
	}
}
