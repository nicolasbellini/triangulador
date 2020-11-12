package com.mercadolibre.quasar.dto;

import com.mercadolibre.quasar.model.Satelite;

import java.util.ArrayList;

public class UnprocessedDataDTO {

    ArrayList<Satelite> satellites;

    public ArrayList<Satelite> getSatellites() {
        return satellites;
    }

    public void setSatellites(ArrayList<Satelite> satellites) {
        this.satellites = satellites;
    }


}
