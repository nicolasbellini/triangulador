package com.mercadolibre.quasar.model;

import java.util.ArrayList;

public class Interpretador {

    public ArrayList<String> interpretarMensajes(Mensajes mensajes) {

        ArrayList<String> mensajeCompleto = new ArrayList<>();

        for (int i = 0; i < mensajes.mensaje1.length; i++) {
            String palabra = mensajes.mensaje1[i];
            if(palabra.equals("")){
                mensajeCompleto.add(this.interpretarPalabra(getPalabra(mensajes.mensaje2, i), getPalabra(mensajes.mensaje3, i)));
            }
            else {
                mensajeCompleto.add(palabra);
            }
        }

        return limpiarMensaje(mensajeCompleto);
    }

    private ArrayList<String> limpiarMensaje(ArrayList<String> mensajeCompleto) {
        int n = mensajeCompleto.size();
        if (n < 2) {
            return mensajeCompleto;
        }
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (mensajeCompleto.get(j) != mensajeCompleto.get(i)) {
                j++;
                mensajeCompleto.set(j, mensajeCompleto.get(i));
            }
        }

        if (mensajeCompleto.get(n - 1) == mensajeCompleto.get(n - 2)) {
            mensajeCompleto.remove(n-1);
        }

        return mensajeCompleto;
    }

    private String getPalabra(String[] mensaje, int i) {
        try{
            return mensaje[i];
        } catch(Exception e) {
            return "";
        }
    }

    private String interpretarPalabra(String s2, String s3) {
        if (s2.equals("")){
            return s3;
        }
        return s2;
    }
}
