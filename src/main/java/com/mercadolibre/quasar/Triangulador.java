package com.mercadolibre.quasar;

public class Triangulador {

    public Posicion triangularLocacion(Float dist1, Float dist2, Float dist3 ){

        //-1425 + (((3,5 * dist3^2) + (2,5 * dist2^2) - dist1^2) / 400)
        double y = -1425 + ((3.5 * Math.pow(dist3, 2)) + (2.5 * Math.pow(dist2,2)) - Math.pow(dist1,2) / 400);

        double x = (-0.5 * 1) - 300 + ((Math.pow(dist3, 2) - Math.pow(dist2, 2)) / 800);

        return new Posicion(x,y);
    }

}
