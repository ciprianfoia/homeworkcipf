package ro.tm.siit.homework.w7d2.sportscar;

/**
 * The SportsCar class represent an abstract way of modeling a sport car.
 * 
 * @author CIPF
 *
 */
public class SportsCar {
	/**
	 * the name of the manufacturer
	 */
	private String manufacturer;
	/**
	 * the name of the model of the car
	 */
	private String model;
	/**
	 * the number of gears
	 */
	private byte gears;
	/**
	 * the number of horsePower
	 */
	private short horsePower;
	/**
	 * the number of exaustMufflers
	 */
	private byte exhaustMufflers;
	/**
	 * the number of adjustable directions that front seats can have
	 */
	private byte directionsAdjustableSeats;
	/**
	 * the speed set for the speed limit
	 */
	private short speedLimiterAt;
	/**
	 * the number of seconds that take to reach first 100km
	 */
	private float acceleration0_100In;
	/**
	 * the fact that the car has paddle shifters or not
	 */
	private boolean paddleShifters = true;

	/**
	 * Constructor for SportsCar class that allows setting a manufacturer, a
	 * model, number of gears, horsepower, exhaust mufflers, adjustable seat
	 * directions, the speed limit, the seconds necessary to reach 100km/h and
	 * if it has paddle shifters or not
	 * 
	 * @param manufacturer
	 *            manufacturer name
	 * @param model
	 *            model name
	 * @param gears
	 *            nr of gears
	 * @param horsePower
	 *            nr of horsepower
	 * @param exaustMufflers
	 *            nr of exhaust mufflers
	 * @param directionsAdjustableSeats
	 *            nr of adjustable seat directions
	 * @param speedLimiterAt
	 *            the speed set for the speed limit
	 * @param acceleration0_100In
	 *            the time to reach 100km/h
	 * @param paddleShifters
	 *            the fact that has or not paddle shifters
	 */
	public SportsCar(String manufacturer, String model, byte gears, short horsePower, byte exaustMufflers,
			byte directionsAdjustableSeats, short speedLimiterAt, float acceleration0_100In, boolean paddleShifters) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.gears = gears;
		this.horsePower = horsePower;
		this.exhaustMufflers = exaustMufflers;
		this.directionsAdjustableSeats = directionsAdjustableSeats;
		this.speedLimiterAt = speedLimiterAt;
		this.acceleration0_100In = acceleration0_100In;
		this.paddleShifters = paddleShifters;
	}

	/**
	 * the method toString returns a String containing relevant information
	 * about the car like manufacturer, model, nr of gears, horsepower, exhaust
	 * mufflers,directions adjustable seats, the speed set of speed limit, the
	 * seconds to reach 100km/h, the fact that has paddle shifters or not
	 */
	public String toString() {
		return "manufacturer: " + manufacturer + "\t model: " + model + "\ngears: " + gears + "\nhorsePower: "
				+ horsePower + "\nexaustMufflers: " + exhaustMufflers + "\ndirectionsAdjustableSeats: "
				+ directionsAdjustableSeats + "\nspeedLimiterAt: " + speedLimiterAt + "\nacceleration0_100In: "
				+ acceleration0_100In + "\npaddleShifters: " + paddleShifters + "\n\n";
	}

	/**
	 * the equals method compares two objects of type SportsCar and returns true
	 * if the 2 cars have at least 3 equal components, otherwise return false;
	 * 
	 * @param another
	 *            Object of SportsCar type
	 * 
	 */
	public boolean isEqual(SportsCar another) {
		int temp = 0;
		if (another.getManufacturer() == this.getManufacturer()) {
			temp++;
		}
		if (another.getModel() == this.getModel()) {
			temp++;
		}
		if (another.getGears() == this.getGears()) {
			temp++;
		}
		if (another.getHorsePower() == this.getHorsePower()) {
			temp++;
		}
		if (another.getExaustMufflers() == this.getExaustMufflers()) {
			temp++;
		}
		if (another.getDirectionsAdjustableSeats() == this.getDirectionsAdjustableSeats()) {
			temp++;
		}
		if (another.getSpeedLimiterAt() == this.getSpeedLimiterAt()) {
			temp++;
		}
		if (another.getAcceleration0_100In() == this.getAcceleration0_100In()) {
			temp++;
		}
		if (another.isPaddleShifters() == this.isPaddleShifters()) {
			temp++;
		}
		if (temp > 3) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the manufacturer of the car
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @return the model of the car
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the number of gears
	 */
	public byte getGears() {
		return gears;
	}

	/**
	 * @return the number of horsepower
	 */
	public short getHorsePower() {
		return horsePower;
	}

	/**
	 * @return the number of exhaust mufflers
	 */
	public byte getExaustMufflers() {
		return exhaustMufflers;
	}

	/**
	 * @return the adjustable seat directions of front seats
	 */
	public byte getDirectionsAdjustableSeats() {
		return directionsAdjustableSeats;
	}

	/**
	 * @return the speed set for the speed limit
	 */
	public short getSpeedLimiterAt() {
		return speedLimiterAt;
	}

	/**
	 * @return the seconds to reach from 0 to 100km/h
	 */
	public float getAcceleration0_100In() {
		return acceleration0_100In;
	}

	/**
	 * @return the fact that has paddle shifters or not
	 */
	public boolean isPaddleShifters() {
		return paddleShifters;
	}

}
