package com.sampson.CervamaniaBackend.service;

import com.sampson.CervamaniaBackend.dto.ClassificacaoDto;
import com.sampson.CervamaniaBackend.model.Classificacao;
import com.sampson.CervamaniaBackend.repositories.ClassificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificacaoService {

    @Autowired
    private ClassificacaoRepository classificacaoRepository;

    public List<Classificacao> getAllClassificacao(){
        return classificacaoRepository.findAll();
    }

    public List<Double> getAllClassificacaoNotas(){
        return classificacaoRepository.getAllClassificacaoNotas();
    }
}
