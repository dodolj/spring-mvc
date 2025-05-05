package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarService() {
    }

    @PostConstruct
    public void init() {
        cars.add(new Car("Ford", 2018, "Red"));
        cars.add(new Car("BMW", 2021, "Blue"));
        cars.add(new Car("Audi", 2017, "Gray"));
        cars.add(new Car("Mazda", 2000, "White"));
        cars.add(new Car("Toyota", 2025, "Black"));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}