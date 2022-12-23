package com.sampson.CervamaniaBackend.repositories;

import com.sampson.CervamaniaBackend.model.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CervejaRepository extends JpaRepository<Cerveja, String> {


    @Query(value = "SELECT c.NOME_CERVEJA FROM cerveja c WHERE c.CODIGO_TIPO_CERVEJA = ?1", nativeQuery = true)
    public List<String> getNomeCervejaByCodigoTipoCerveja(String codigoTipoCerveja);

    @Query(value = "SELECT c.NOME_CERVEJA FROM cerveja c WHERE c.CODIGO_PAIS_CERVEJA = ? ORDER BY c.NOME_CERVEJA;", nativeQuery = true)
    public List<String> getNomeCervejaByCodigoPais(String codigoPais);

    @Query(value = "SELECT c.NOME_CERVEJA FROM cerveja c WHERE c.NOME_CERVEJA LIKE ?", nativeQuery = true)
    public List<String> getNomeCervejaByPartOfName(String namePart);



}
