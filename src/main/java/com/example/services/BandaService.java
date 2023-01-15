package com.example.services;

import com.example.models.BandaModel;
import com.example.repositories.BandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BandaService {

    @Autowired
    BandaRepository bandaRepository;

    public ArrayList<BandaModel> obtenerBandas(){
        return (ArrayList<BandaModel>) bandaRepository.findAll();
    }

    public Optional<BandaModel> obtenerBandaByID(Integer id){
        return bandaRepository.findById(id);
    }

    public BandaModel insertabanda(BandaModel banda){
        return  bandaRepository.save(banda);
    }

    public boolean eliminarBanda(Integer id){
        try{
            bandaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public BandaModel actualizaBanda(BandaModel banda){
        return bandaRepository.save(banda);
    }
}
