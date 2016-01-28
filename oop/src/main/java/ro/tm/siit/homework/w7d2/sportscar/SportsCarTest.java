package ro.tm.siit.homework.w7d2.sportscar;

/**
 * The SportsCarTest class implements an application that compares two cars to
 * see how many parts do they have in common;
 * 
 * @author CIPF
 *
 */
public class SportsCarTest {

	/**
	 * the starting point of the application. it creates 3 cars and compares
	 * them to see if they have parts in common. If they have at least 3 parts
	 * in common it prints out the car; if not it prints that are no equal car
	 * parts in this lot.
	 * 
	 * @param args
	 *            not used this time.
	 */
	public static void main(String[] args) {

		SportsCar[] cars = new SportsCar[4];
		cars[0] = new SportsCar("ferrari", "459_Italia", (byte) 8, (short) 710, (byte) 2, (byte) 12, (short) 290,
				(float) 3.9, true);
		cars[1] = new SportsCar("bugatti", "veyron", (byte) 8, (short) 1040, (byte) 2, (byte) 12, (short) 330,
				(float) 3.1, true);
		cars[2] = new SportsCar("chevrolet", "corvette", (byte) 7, (short) 710, (byte) 3, (byte) 12, (short) 300,
				(float) 3.9, false);
		cars[3] = new SportsCar("mercedes", "sls", (byte) 7, (short) 690, (byte) 3, (byte) 6, (short) 300,
				(float) 3.7, false);

		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {

				if (cars[i].isEqual(cars[j])) {
					System.out.println(cars[i].toString());
				} else {
					System.out.println("there are no equal cars in this lot");
					System.out.println();
				}
			}
		}
	}

}
