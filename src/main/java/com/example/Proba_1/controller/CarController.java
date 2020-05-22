package com.example.Proba_1.controller;


import com.example.Proba_1.model.Car;
import com.example.Proba_1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    CarService service;

    @Autowired
    public CarController(CarService carService) {
        this.service = carService;
    }

    @GetMapping
    public List<Car> showTheList(){
    return service.getAll();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable long id){
        return service.getById(id);
    }
    @PostMapping
    public void putThat(@RequestBody Car car){
        service.addCar(car);
    }
}
