package com.mercadolibre.quasar.model;

public class Triangulador {

    public static Posicion triangularLocacion(Distancias distancias){


        double y = -1425 + ((3.5 * Math.pow(distancias.dist3, 2)) + (2.5 * Math.pow(distancias.dist2,2)) - Math.pow(distancias.dist1,2) / 400);

        double x = (-0.5 * 1) - 300 + ((Math.pow(distancias.dist3, 2) - Math.pow(distancias.dist2, 2)) / 800);

        return new Posicion(x,y);
    }

}
