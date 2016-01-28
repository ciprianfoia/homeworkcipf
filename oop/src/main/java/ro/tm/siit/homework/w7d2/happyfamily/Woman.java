package ro.tm.siit.homework.w7d2.happyfamily;

/**
 * the Woman class extends Person class and models a woman
 * 
 * @author CIPF
 *
 */
public class Woman extends Person {

	private boolean goodGrades;
	private boolean hasGirlfriends;
	private boolean hasBoyfriend;
	private boolean hasACareer;
	private boolean isMaried;
	private boolean hasKids;

	/**
	 * Constructor for Woman class that allows for setting a name and age
	 * 
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 */
	public Woman(String name, int age) {
		super(name, age);
	}

	/**
	 * Constructor for Woman class that allows for setting a name, age, if she
	 * has good grades, girlfriends, or not;
	 * 
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 * @param goodGrades
	 *            if she has good grades or not
	 * @param hasGirlfriends
	 *            if she has girlfriends or not
	 */
	public Woman(String name, int age, boolean goodGrades, boolean hasGirlfriends) {
		super(name, age);
		this.goodGrades = goodGrades;
		this.hasGirlfriends = hasGirlfriends;
	}

	/**
	 * Constructor for Woman class that allows for setting an age,a name, if she
	 * has boyfriend, a career, or not;
	 * 
	 * @param age
	 *            the age
	 * @param name
	 *            the name
	 * @param hasBoyfriend
	 *            if she has boyfriend or not
	 * @param hasACareer
	 *            if she has a career or not
	 */
	public Woman(int age, String name, boolean hasBoyfriend, boolean hasACareer) {
		super(name, age);
		this.hasBoyfriend = hasBoyfriend;
		this.hasACareer = hasACareer;
	}

	/**
	 * Constructor for Woman class that allows for setting a name, if she is
	 * married, has kids, or not and an age;
	 * 
	 * @param name
	 *            the name
	 * @param isMaried
	 *            if she is married or not
	 * @param hasKids
	 *            if she has kids or not
	 * @param age
	 *            the age
	 */
	public Woman(String name, boolean isMaried, boolean hasKids, int age) {
		super(name, age);
		this.isMaried = isMaried;
		this.hasKids = hasKids;
	}

	/**
	 * the method isHappy returns us a boolean value if a Woman is happy or not
	 */
	public boolean isHappy() {
		if (this.getAge() < 18 && goodGrades == true && hasGirlfriends == true) {
			mood = true;
		} else if (this.getAge() > 17 && this.getAge() <= 30 && hasBoyfriend == true && hasACareer == true) {
			mood = true;
		} else if (this.getAge() > 30 && isMaried == true && hasKids == true) {
			mood = true;
		} else {
			mood = false;
		}
		return mood;
	}

}
