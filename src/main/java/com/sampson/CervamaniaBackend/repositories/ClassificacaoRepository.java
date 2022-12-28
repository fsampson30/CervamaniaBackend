package com.sampson.CervamaniaBackend.repositories;

import com.sampson.CervamaniaBackend.dto.ClassificacaoDto;
import com.sampson.CervamaniaBackend.model.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.ColumnResult;
import java.util.List;

public interface ClassificacaoRepository extends JpaRepository<Classificacao, Integer> {

    @Query(nativeQuery = true)
    public List<ClassificacaoDto> getClassificacaoDto();

    @Query(value = "SELECT cl.COMENTARIOS from classificacao cl where cl.CODIGO_CERVEJA = ? and cl.COMENTARIOS <> ''" ,nativeQuery = true)
    public List<String> getComentariosByCodigoCerveja(String codigoCerveja);
}
