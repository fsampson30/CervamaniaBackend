package com.sampson.CervamaniaBackend.service;

import com.sampson.CervamaniaBackend.model.Cerveja;
import com.sampson.CervamaniaBackend.repositories.CervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CervejaService {

    @Autowired
    private CervejaRepository cervejaRepository;

    public List<Cerveja> getAllCervejas(){
        return cervejaRepository.findAll();
    }

    public Optional<Cerveja> getCervejaById(String id){
        return cervejaRepository.findById(id);
    }

    public List<String> getNomeCervejaByCodigoTipoCerveja(String codigoTipoCerveja){
        return cervejaRepository.getNomeCervejaByCodigoTipoCerveja(codigoTipoCerveja);
    }

    public List<String> getNomeCervejaByCodigoPais(String codigoPais){
        return cervejaRepository.getNomeCervejaByCodigoPais(codigoPais);
    }

    public List<String> getNomeCervejaByNamePart(String namePart){
        return cervejaRepository.getNomeCervejaByPartOfName(namePart);
    }


}
