package com.example.Proba_1.service;

import com.example.Proba_1.model.Car;
import com.example.Proba_1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

@Service
public class CarService {

    CarRepository repository;
    private Arrays carList;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.repository = carRepository;
    }

    public List<Car> getAll() {
        return repository.getAll();
    }

    public Car getById(long id) {
        return repository.getById(id);
    }

    public void addCar(Car car) {
        repository.addCar(car);
    }
}
