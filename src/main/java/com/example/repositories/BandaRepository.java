package com.example.repositories;

import com.example.models.BandaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandaRepository extends CrudRepository<BandaModel, Integer> {

}
