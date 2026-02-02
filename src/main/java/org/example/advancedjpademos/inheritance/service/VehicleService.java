package org.example.advancedjpademos.inheritance.service;

import org.example.advancedjpademos.inheritance.model.Bike;
import org.example.advancedjpademos.inheritance.model.Car;
import org.example.advancedjpademos.inheritance.repository.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class VehicleService implements CommandLineRunner {

    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... args) throws Exception {

        Car car = new Car();
        car.setBrand("Maruti");
        car.setSeatCount(5);

        Bike bike = new Bike();
        bike.setBrand("Hero");
        bike.setHasCarrier(false);

        repository.save(car);
        repository.save(bike);

    }
}
