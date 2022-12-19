package com.sampson.CervamaniaBackend.service;

import com.sampson.CervamaniaBackend.model.TipoCerveja;
import com.sampson.CervamaniaBackend.repositories.TipoCervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCervejaService {

    @Autowired
    private TipoCervejaRepository tipoCervejaRepository;

    public List<TipoCerveja> getAllTipoCerveja(){
        return tipoCervejaRepository.findAll();
    }
}
