package com.example.Proba_1.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect
public class Car implements Serializable {

    private long id;
    private String make;
    private String model;
    private String plateNr;

    public Car(long id, String make, String model, String plateNr) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.plateNr = plateNr;

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
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNr() {
        return plateNr;
    }

    public void setPlateNr(String plateNr) {
        this.plateNr = plateNr;
    }


}
