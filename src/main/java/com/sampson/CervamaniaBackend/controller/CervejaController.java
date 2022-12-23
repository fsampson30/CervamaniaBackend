package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.model.Cerveja;
import com.sampson.CervamaniaBackend.service.CervejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<String>> getNomeCervejaByCodigoTipoCerveja(@PathVariable String id) {
        List<String> result = cervejaService.getNomeCervejaByCodigoTipoCerveja(id);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/codigopais/{id}")
    public ResponseEntity<List<String>> getNomeCervejaByCodigoPais(@PathVariable String id){
        List<String> result = cervejaService.getNomeCervejaByCodigoPais(id);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/pesquisa/{namepart}")
    public ResponseEntity<List<String>> getNomeCervejaByNamePart(@PathVariable String namepart){
        List<String> result = cervejaService.getNomeCervejaByNamePart("%"+namepart+"%");
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }


}
