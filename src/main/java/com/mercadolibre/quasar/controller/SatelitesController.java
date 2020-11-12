package com.mercadolibre.quasar.controller;

import com.mercadolibre.quasar.dto.ProcessedDataDTO;
import com.mercadolibre.quasar.dto.UnprocessedDataDTO;
import com.mercadolibre.quasar.service.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topsecret")
public class SatelitesController {

    @Autowired
    SateliteService sateliteService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ProcessedDataDTO procesarDatos(@RequestBody UnprocessedDataDTO unprocessedDataDTO){
        return sateliteService.procesarDatos(unprocessedDataDTO);
    }

}
