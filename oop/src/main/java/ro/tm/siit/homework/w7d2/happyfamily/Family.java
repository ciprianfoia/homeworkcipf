package ro.tm.siit.homework.w7d2.happyfamily;

/**
 * the Family class models a family
 * 
 * @author CIPF
 *
 */
public class Family {
	private String name;
	private Person aMan;
	private Person aWoman;
	private Person firstKid;
	private Person secondKid;

	/**
	 * Constructor for Family class that allows for setting a family name, that
	 * has a man, a woman and a kid.
	 * 
	 * @param name
	 *            the name
	 * @param aMan
	 *            a man
	 * @param aWoman
	 *            a woman
	 * @param firstKid
	 *            a kid
	 */
	public Family(String name, Person aMan, Person aWoman, Person firstKid) {
		this.name = name;
		this.aMan = aMan;
		this.aWoman = aWoman;
		this.firstKid = firstKid;
	}

	/**
	 * Constructor for family class that allows for setting a family name, that
	 * has a man, a woman, and two children
	 * 
	 * @param name
	 *            the name
	 * @param aMan
	 *            a man
	 * @param aWoman
	 *            a woman
	 * @param firstKid
	 *            a kid
	 * @param secondKid
	 *            another kid
	 */
	public Family(String name, Person aMan, Person aWoman, Person firstKid, Person secondKid) {
		this.name = name;
		this.aMan = aMan;
		this.aWoman = aWoman;
		this.firstKid = firstKid;
		this.secondKid = secondKid;
	}

	/**
	 * the getName method returns a String
	 * 
	 * @return name of the family
	 */
	public String getName() {
		return name;
	}

	/**
	 * the method isHappy returns a boolean value if the family is happy or not
	 * 
	 * @return true or false
	 */
	public boolean isHappy() {
		if (aMan.isHappy() && aWoman.isHappy()) {
			return true;
		} else {
			return false;
		}
	}

}
