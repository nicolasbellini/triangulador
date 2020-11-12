package com.mercadolibre.quasar.dto;

import com.mercadolibre.quasar.model.Posicion;
import java.util.ArrayList;

public class ProcessedDataDTO {
    private final Posicion posicion;
    private final ArrayList<String> mensaje;

    public ProcessedDataDTO(Posicion posicion, ArrayList<String> mensaje) {
        this.posicion = posicion;
        this.mensaje = mensaje;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public ArrayList<String> getMensaje() {
        return mensaje;
    }
}
