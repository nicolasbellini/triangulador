package com.mercadolibre.quasar.model;

public class Triangulador {

    public static Posicion triangularLocacion(Float dist1, Float dist2, Float dist3 ){

        double y = -1425 + ((3.5 * Math.pow(dist3, 2)) + (2.5 * Math.pow(dist2,2)) - Math.pow(dist1,2) / 400);

        double x = (-0.5 * 1) - 300 + ((Math.pow(dist3, 2) - Math.pow(dist2, 2)) / 800);

        return new Posicion(x,y);
    }

}
