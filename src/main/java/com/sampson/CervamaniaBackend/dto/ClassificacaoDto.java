package com.sampson.CervamaniaBackend.dto;


import javax.persistence.Column;


public class ClassificacaoDto {

    @Column(name = "NOME_CERVEJA")
    private String nomeCerveja;
    @Column(name = "NOTA")
    private double nota;

    public String getNomeCerveja() {
        return nomeCerveja;
    }

    public void setNomeCerveja(String nomeCerveja) {
        this.nomeCerveja = nomeCerveja;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
