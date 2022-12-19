package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.model.Cerveja;
import com.sampson.CervamaniaBackend.service.CervejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cervejas")
public class CervejaController {

    @Autowired
    private CervejaService cervejaService;

    @GetMapping
    public List<Cerveja> getAllCervejas(){
        return cervejaService.getAllCervejas();
    }


}
