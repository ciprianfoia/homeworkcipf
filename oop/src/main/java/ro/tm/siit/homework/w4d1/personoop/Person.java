package ro.tm.siit.homework.w4d1.personoop;

import java.util.Scanner;

/**
 * This program implement an application about a person's actions and behavior.
 * 
 * @author Ciprian_Foia
 * @since 2015.12.14
 */
public class Person {
	static Scanner input = new Scanner(System.in);
	private static int drinkLevel = 0;
	private static int eatLevel = 0;

	public static void main(String[] args) {

	}

	/**
	 * When sleep method is called the Person gets to sleep mode. While sleeping
	 * its eatLevel variable decrements. When its eatLevel variable gets to zero
	 * it calls the wakeUp method.
	 */
	public static void sleep() {
		System.out.println("zZZzzZzzZZz");
		eatLevel--;
		if (eatLevel == 0) {
			Person.wakeUp();
		}
	}

	/**
	 * When wakeUp method is called the Person wakes up and salutes his dog.
	 * Then this method calls the goToKitchen method.
	 */
	public static void wakeUp() {
		System.out.println("good morning");
		Person.goToKitchen();

	}

	/**
	 * The goToKitchen method allows the person to choose to eat or to drink by
	 * input command. Then it calls the eat or drink method according to its
	 * decision.
	 */
	public static void goToKitchen() {
		String operation = input.nextLine();
		if (operation.equals("eat")) {
			Person.eat();
		}
		if (operation.equals("drink")) {
			Person.drink();
		}
	}

	/**
	 * when the eat method is called the eatLevel variable increases. when it
	 * reaches a value of 7 units it calls the drink method.
	 */
	public static void eat() {
		eatLevel++;
		if (eatLevel > 6) {
			Person.drink();
		}
	}

	/**
	 * when the drink method is called the Persons drinkLevel variable
	 * increases. when it reaches 10 units it calls the goBathroom method.
	 */
	public static void drink() {
		drinkLevel++;
		if (drinkLevel == 10) {
			Person.goBathroom();
		}
	}

	/**
	 * this method decreases the drinkLevel variable.
	 */
	public static void goBathroom() {
		drinkLevel--;
	}
}
