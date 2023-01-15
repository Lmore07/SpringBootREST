package com.example.controllers;

import com.example.models.BandaModel;
import com.example.services.BandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/banda")
public class BandaController {

    @Autowired
    BandaService bandaService;

    @GetMapping
    public ArrayList<BandaModel> obtenerBandas(){
        return bandaService.obtenerBandas();
    }

    @GetMapping(path = "/{id}")
    public Optional<BandaModel> obtenerBandaByID(@PathVariable("id") Integer id){
        return bandaService.obtenerBandaByID(id);
    }

    @PostMapping
    public BandaModel insertaBanda(@RequestBody BandaModel banda){
        return bandaService.insertabanda(banda);
    }

    @PutMapping
    public BandaModel actualizaBanda(@RequestBody BandaModel banda){
        return bandaService.actualizaBanda(banda);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarBanda(@PathVariable("id") Integer id){
        boolean ok = bandaService.eliminarBanda(id);
        if (ok)
            return "Se eliminó correctamente";
        return "No pudo eliminar";
    }
}
