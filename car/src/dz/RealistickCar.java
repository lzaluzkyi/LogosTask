package dz;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class RealistickCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.extent = 40;
		car.consumption = 5;
		car.fuelmax = 55;
		car.km = 600;
		car.fuelVolume = 60;
		car.calculation();
		car.calculation();
		car.calculation();
		car.reFuel();
		car.calculation();
		car.calculation();
		car.reFuel();
		car.calculation();
		car.distance();

	}

}
