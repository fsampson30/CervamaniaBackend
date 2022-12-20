package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.model.PaisCerveja;
import com.sampson.CervamaniaBackend.service.PaisCervejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paisescervejas")
public class PaisCervejaController {

    @Autowired
    private PaisCervejaService paisCervejaService;

    @GetMapping
    public List<PaisCerveja> getAllPaises(){
        return paisCervejaService.getAllPaisCerveja();
    }
}
