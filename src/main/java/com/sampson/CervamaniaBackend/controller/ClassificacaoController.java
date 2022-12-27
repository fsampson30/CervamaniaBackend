package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.dto.ClassificacaoDto;
import com.sampson.CervamaniaBackend.model.Classificacao;
import com.sampson.CervamaniaBackend.service.ClassificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classificacoes")
public class ClassificacaoController {

    @Autowired
    private ClassificacaoService classificacaoService;

    @GetMapping
    public List<Classificacao> getAllCLassificacao(){
        return classificacaoService.getAllClassificacao();
    }

    @GetMapping("/notas")
    public List<Double> getAllClassificaoNotas(){
        return classificacaoService.getAllClassificacaoNotas();
    }
}
