package com.sampson.CervamaniaBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classificacao {

    @Id
    @Column(name = "CODIGO_CLASSIFICACAO")
    private int id;

    @Column(name = "CODIGO_CERVEJA")
    private String codigoCerveja;

    @Column(name = "CLASSIFICACAO")
    private double classiicacao;

    @Column(name = "COMENTARIOS")
    private String comentarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoCerveja() {
        return codigoCerveja;
    }

    public void setCodigoCerveja(String codigoCerveja) {
        this.codigoCerveja = codigoCerveja;
    }

    public double getClassiicacao() {
        return classiicacao;
    }

    public void setClassiicacao(double classiicacao) {
        this.classiicacao = classiicacao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
