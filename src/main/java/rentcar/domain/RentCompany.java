package rentcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RentCompany {

    private final List<Car> cars;

    private RentCompany() {
        this.cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> cars() { return Collections.unmodifiableList(cars); }


}
