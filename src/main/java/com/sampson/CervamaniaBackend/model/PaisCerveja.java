package com.sampson.CervamaniaBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaisCerveja {

    @Id
    @Column(name = "CODIGO_PAIS_CERVEJA")
    private String codigoPaisCerveja;

    @Column(name = "NOME_PAIS_CERVEJA")
    private String nomePaisCerveja;

    public String getCodigoPaisCerveja() {
        return codigoPaisCerveja;
    }

    public void setCodigoPaisCerveja(String codigoPaisCerveja) {
        this.codigoPaisCerveja = codigoPaisCerveja;
    }

    public String getNomePaisCerveja() {
        return nomePaisCerveja;
    }

    public void setNomePaisCerveja(String nomePaisCerveja) {
        this.nomePaisCerveja = nomePaisCerveja;
    }
}
