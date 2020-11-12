package com.mercadolibre.quasar.model;

import java.util.ArrayList;

public class Distancias {
    public final Float dist1;
    public final Float dist2;
    public final Float dist3;

    public Distancias(ArrayList<Satelite> satelites) {
        this.dist1 = satelites.get(0).distance;
        this.dist2 = satelites.get(1).distance;
        this.dist3 = satelites.get(2).distance;
    }

    public Distancias(float v, float v1, float v2) {
        this.dist1 = v;
        this.dist2 = v1;
        this.dist3 = v2;
    }
}
