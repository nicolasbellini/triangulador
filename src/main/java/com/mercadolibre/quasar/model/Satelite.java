package com.mercadolibre.quasar.model;

import java.util.ArrayList;

public class Satelite {

    String name;
    Float distance;
    String[] message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public String[] getMessage() {
        return message;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }
}
