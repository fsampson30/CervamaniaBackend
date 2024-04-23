package com.sampson.CervamaniaBackend.controller;

import com.sampson.CervamaniaBackend.dto.ClassificacaoDto;
import com.sampson.CervamaniaBackend.model.Cerveja;
import com.sampson.CervamaniaBackend.model.Classificacao;
import com.sampson.CervamaniaBackend.service.CervejaService;
import com.sampson.CervamaniaBackend.service.ClassificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classificacoes")
public class ClassificacaoController {

    @Autowired
    private ClassificacaoService classificacaoService;

    @Autowired
    CervejaService cervejaService;

    @GetMapping
    public List<Classificacao> getAllRatings() {
        return classificacaoService.getAllClassificacao();
    }

    @GetMapping("/notas")
    public List<ClassificacaoDto> getAllRatingNotes() {
        return classificacaoService.getAllClassificacaoNotas();
    }

    @GetMapping("/comentarios/{id}")
    public ResponseEntity<List<String>> getComentariosByCodigoCerveja(@PathVariable String id) {
        List<String> comentarios = new ArrayList<>();
        Optional<Cerveja> buscaCodigo = cervejaService.getCervejaById(id);
        if (buscaCodigo.isPresent()) {
            comentarios = classificacaoService.getComentariosByCodigoCerveja(id);
        } else {
            return ResponseEntity.notFound().build();
        }
        if (comentarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(comentarios);
    }
}
