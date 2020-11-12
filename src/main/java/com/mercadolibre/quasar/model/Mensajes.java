package com.mercadolibre.quasar.model;

public class Mensajes {

    String[] mensaje1;
    String[] mensaje2;
    String[] mensaje3;

    public Mensajes(String[] mensaje1, String[] mensaje2, String[] mensaje3) {
        int length1 = mensaje1.length;
        int length2 = mensaje2.length;
        int length3 = mensaje3.length;

        if (length1 > length2 && length1 > length3){
            this.mensaje1 = mensaje1;
            this.mensaje2 = mensaje2;
            this.mensaje3 = mensaje3;
        } else if (length2 > length1 && length2 > length3){
            this.mensaje1 = mensaje2;
            this.mensaje2 = mensaje1;
            this.mensaje3 = mensaje3;
        }
        else {
            this.mensaje1 = mensaje3;
            this.mensaje2 = mensaje1;
            this.mensaje3 = mensaje2;
        }
    }

}
