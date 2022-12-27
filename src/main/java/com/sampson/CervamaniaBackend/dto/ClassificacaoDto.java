package com.sampson.CervamaniaBackend.dto;


public class ClassificacaoDto {

    private String nomeCerveja;
    private double nota;

    public ClassificacaoDto(String nomeCerveja, double nota) {
        this.nomeCerveja = nomeCerveja;
        this.nota = nota;
    }

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
