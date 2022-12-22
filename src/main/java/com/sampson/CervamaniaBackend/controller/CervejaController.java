package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.model.Cerveja;
import com.sampson.CervamaniaBackend.service.CervejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cervejas")
public class CervejaController {

    @Autowired
    private CervejaService cervejaService;

    @GetMapping
    public List<Cerveja> getAllCervejas() {
        return cervejaService.getAllCervejas();
    }

    @GetMapping("/{id}")
    public Optional<Cerveja> getCervejaById(@PathVariable String id) {
        return cervejaService.getCervejaById(id);
    }

    @GetMapping("/tipocerveja/{id}")
    public List<String> getNomeCervejaByCodigoTipoCerveja(@PathVariable String id) {
        return cervejaService.getNomeCervejaByCodigoTipoCerveja(id);
    }


}
