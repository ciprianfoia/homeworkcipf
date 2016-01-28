package ro.tm.siit.homework.w7d2.happyfamily;

/**
 * the Man class extends Person class and models a man
 * 
 * @author CIPF
 *
 */
public class Man extends Person {

	private boolean goodGrades;
	private boolean playStation;
	private boolean coolestGadgets;
	private boolean hasGirlfriend;
	private boolean isMaried;

	/**
	 * Constructor for Man class that allows for setting a name and age
	 * 
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 */
	public Man(String name, int age) {
		super(name, age);
	}

	/**
	 * Constructor for Woman class that allows for setting a name, age, if he
	 * has good grades, play station, or not;
	 * 
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 * @param goodGrades
	 *            if he has good grades or not
	 * @param playStation
	 *            if he has play station or not
	 */
	public Man(String name, int age, boolean goodGrades, boolean playStation) {
		super(name, age);
		this.goodGrades = goodGrades;
		this.playStation = playStation;

	}

	/**
	 * Constructor for Woman class that allows for setting a name, age, if he
	 * has a girlfriend or not, is married or not, has coolest gadgets or not;
	 * 
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 * @param hasGirlfriend
	 *            if he has girlfriend or not
	 * @param isMaried
	 *            if he is married or not
	 * @param coolestGadgets
	 *            if he has the coolest gadgets or not
	 */
	public Man(String name, int age, boolean hasGirlfriend, boolean isMaried, boolean coolestGadgets) {
		super(name, age);
		this.coolestGadgets = coolestGadgets;
		this.hasGirlfriend = hasGirlfriend;
		this.isMaried = isMaried;
	}

	/**
	 * the method isHappy returns us a boolean value if a Man is happy or not
	 */
	public boolean isHappy() {
		if (this.getAge() < 18 && goodGrades == true && playStation == true) {
			mood = true;
		} else if (this.getAge() > 18 && hasGirlfriend == true && coolestGadgets == true
				|| this.getAge() > 18 && isMaried == true && coolestGadgets == true) {
			mood = true;
		} else {
			mood = false;
		}
		return mood;
	}

}
