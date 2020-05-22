package com.example.Proba_1.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect
public class Car implements Serializable {

    private long id;
    private String Make;
    private String Model;
    private String PlateNr;

    public Car(long id, String Make, String Model, String PlateNr) {
        this.id = id;
        this.Make = Make;
        this.Model = Model;
        this.PlateNr = PlateNr;

    }

    public Car() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getPlateNr() {
        return PlateNr;
    }

    public void setPlateNr(String plateNr) {
        PlateNr = plateNr;
    }


}
