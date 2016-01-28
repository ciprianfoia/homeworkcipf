package ro.tm.siit.homework.w7d2.happyfamily;

/**
 * the Person class models a person
 * 
 * @author CIPF
 *
 */
public class Person {

	private String name;
	private int age;
	protected boolean mood = false;

	/**
	 * Constructor for Person class that allows for setting a name and age
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * the getName method returns a String
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * the getAge method returns an int
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Not implemented. Normally it returns if a person is happy or not.
	 * Implemented in subclasses
	 * 
	 * @return always false
	 */
	public boolean isHappy() {
		return mood;
	}

}
