package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2019, "White"));
        cars.add(new Car("Honda", 2020, "Black"));
        cars.add(new Car("Ford", 2018, "Red"));
        cars.add(new Car("BMW", 2021, "Blue"));
        cars.add(new Car("Audi", 2017, "Gray"));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}