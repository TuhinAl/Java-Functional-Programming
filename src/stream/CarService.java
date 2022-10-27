package stream;

import java.util.Optional;

public class CarService {

	public String getSpeed(Optional<Car>car) {
		String speed = car
				.flatMap(Car::getEngine)
				.flatMap(Engine::getCc)
				.map(SpeedCC::getCc).orElse("");
		System.out.println(speed);
		return speed;
	}
}
