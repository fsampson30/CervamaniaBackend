package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.model.TipoCerveja;
import com.sampson.CervamaniaBackend.service.TipoCervejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposcervejas")
public class TipoCervejaController {

    @Autowired
    private TipoCervejaService tipoCervejaService;

    @GetMapping
    public List<TipoCerveja> getAllTipoCerveja(){
        return tipoCervejaService.getAllTipoCerveja();
    }
}
