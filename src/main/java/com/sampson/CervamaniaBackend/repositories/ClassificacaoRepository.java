package com.sampson.CervamaniaBackend.repositories;

import com.sampson.CervamaniaBackend.dto.ClassificacaoDto;
import com.sampson.CervamaniaBackend.model.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClassificacaoRepository extends JpaRepository<Classificacao, Integer> {

    @Query(value = "SELECT ROUND( SUM(cl.CLASSIFICACAO) / COUNT(cl.CODIGO_CERVEJA),2)  NOTA FROM classificacao cl JOIN cerveja c ON cl.CODIGO_CERVEJA = c.CODIGO_CERVEJA GROUP BY c.NOME_CERVEJA ORDER BY 1 DESC, c.NOME_CERVEJA", nativeQuery = true)
    public List<Double> getAllClassificacaoNotas();
}
