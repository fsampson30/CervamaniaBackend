package com.sampson.CervamaniaBackend.service;

import com.sampson.CervamaniaBackend.model.PaisCerveja;
import com.sampson.CervamaniaBackend.repositories.PaisCervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisCervejaService {

    @Autowired
    private PaisCervejaRepository paisCervejaRepository;

    public List<PaisCerveja> getAllPaisCerveja(){
        return paisCervejaRepository.findAll();
    }
}
