package ro.tm.siit.homework.w7d2.happyfamily;

/**
 * The HappyApp class implements an application to find if persons and families
 * are happy or not using inheritance, association, polymorphism
 * 
 * @author CIPF
 *
 */
public class HappyApp {
	/**
	 * the starting point in a java application; it demonstrates creation and
	 * polymorphic use of persons, families , and find out if they are happy or
	 * not
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		// creating the persons, men, women and child's
		Person[] persons = new Person[7];
		persons[0] = new Man("mike", 26, true, true);
		persons[1] = new Woman(25, "mary", true, true);
		persons[2] = new Kid("michael", 8);

		persons[3] = new Man("john", 38, true, false, true);
		persons[4] = new Woman("jane", true, true, 35);
		persons[5] = new Kid("jordan", 12);
		persons[6] = new Kid("jackson", 13);
		// checks out for each person if it is happy or not and prints the
		// result
		for (Person x : persons) {
			if (x.getAge() > 18) {
				x.isHappy();
				if (x.isHappy() == true) {
					System.out.println(x.getName() + " is a happy person.");
				} else {
					System.out.println(x.getName() + " is a sad person");
				}
			}
		}
		System.out.println("");
		// creating the families
		Family[] families = new Family[2];
		families[0] = new Family("Ionescu", persons[0], persons[1], persons[2]);
		families[1] = new Family("Popescu", persons[3], persons[4], persons[5], persons[6]);

		// checks out for each family if it is happy or not and prints out the
		// result
		for (Family x : families) {
			System.out.println(x.getName());
			x.isHappy();
			if (x.isHappy() == true) {
				System.out.println(x.getName() + " is a happy family");
			} else {
				System.out.println(x.getName() + " is a sad family");
			}
			System.out.println();
		}

	}
}
