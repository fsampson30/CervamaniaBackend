package com.sampson.CervamaniaBackend.service;

import com.sampson.CervamaniaBackend.model.Cerveja;
import com.sampson.CervamaniaBackend.repositories.CervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CervejaService {

    @Autowired
    private CervejaRepository cervejaRepository;

    public List<Cerveja> getAllCervejas(){
        return cervejaRepository.findAll();
    }
}
