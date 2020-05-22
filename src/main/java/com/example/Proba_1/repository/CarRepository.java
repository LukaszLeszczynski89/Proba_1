package com.example.Proba_1.repository;

import com.example.Proba_1.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    private List<Car> carList = new ArrayList<>();

    public CarRepository(){

        carList.add(new Car(1,"Ford","Mondeo","AVX5 5XPE"));
        carList.add(new Car(2,"Ford","Mondeo","BVX5 6SA"));
        carList.add(new Car(3,"Ford","Mondeo","CVX5 5X"));
        carList.add(new Car(4,"Ford","Mondeo","DVX5 5XC"));
        carList.add(new Car(5,"Ford","Mondeo","EVX5 5XPA"));
        carList.add(new Car(6,"Ford","Mondeo","FVC2 SD43"));
        carList.add(new Car(7,"Ford","Mondeo","ZVX5 4X"));
    }

    public List<Car> getAll(){
        return carList;
    }
}
