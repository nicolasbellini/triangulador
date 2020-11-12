package com.mercadolibre.quasar.service;

import com.mercadolibre.quasar.dto.ProcessedDataDTO;
import com.mercadolibre.quasar.dto.UnprocessedDataDTO;

public interface SateliteService {

    ProcessedDataDTO procesarDatos(UnprocessedDataDTO datos);

}
