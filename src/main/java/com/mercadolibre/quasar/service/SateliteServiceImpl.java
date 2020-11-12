package com.mercadolibre.quasar.service;

import com.mercadolibre.quasar.dto.ProcessedDataDTO;
import com.mercadolibre.quasar.dto.UnprocessedDataDTO;
import com.mercadolibre.quasar.model.Distancias;
import com.mercadolibre.quasar.model.Interpretador;
import com.mercadolibre.quasar.model.Mensajes;
import com.mercadolibre.quasar.model.Triangulador;
import org.springframework.stereotype.Service;

@Service
public class SateliteServiceImpl implements SateliteService {

    @Override
    public ProcessedDataDTO procesarDatos(UnprocessedDataDTO datos) {
        return new ProcessedDataDTO(Triangulador.triangularLocacion(new Distancias(datos.getSatellites())), Interpretador.interpretarMensajes(new Mensajes(datos.getSatellites())));
    }
}
