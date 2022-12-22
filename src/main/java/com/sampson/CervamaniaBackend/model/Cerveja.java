package com.sampson.CervamaniaBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cerveja")
public class Cerveja {

    @Id
    @Column(name = "CODIGO_CERVEJA")
    private String codigoCerveja;

    @Column(name = "NOME_CERVEJA")
    private String nomeCerveja;

    @Column(name = "DESCRICAO_CERVEJA")
    private String descricaoCerveja;

    @Column(name = "CERVEJARIA")
    private String nomeCervejaria;

    @Column(name = "CODIGO_TIPO_CERVEJA")
    private String codigoTipoCerveja;

    @Column(name = "TEOR")
    private String teorCerveja;

    @Column(name = "INGREDIENTES")
    private String ingredientesCeveja;

    @Column(name = "TEMPERATURA")
    private String temperaturaCerveja;

    @Column(name = "COR")
    private String corCerveja;

    @Column(name = "CODIGO_PAIS_CERVEJA")
    private String codigoPaisCerveja;

    public String getCodigoCerveja() {
        return codigoCerveja;
    }

    public void setCodigoCerveja(String codigoCerveja) {
        this.codigoCerveja = codigoCerveja;
    }

    public String getNomeCerveja() {
        return nomeCerveja;
    }

    public void setNomeCerveja(String nomeCerveja) {
        this.nomeCerveja = nomeCerveja;
    }

    public String getDescricaoCerveja() {
        return descricaoCerveja;
    }

    public void setDescricaoCerveja(String descricaoCerveja) {
        this.descricaoCerveja = descricaoCerveja;
    }

    public String getNomeCervejaria() {
        return nomeCervejaria;
    }

    public void setNomeCervejaria(String nomeCervejaria) {
        this.nomeCervejaria = nomeCervejaria;
    }

    public String getCodigoTipoCerveja() {
        return codigoTipoCerveja;
    }

    public void setCodigoTipoCerveja(String codigoTipoCerveja) {
        this.codigoTipoCerveja = codigoTipoCerveja;
    }

    public String getTeorCerveja() {
        return teorCerveja;
    }

    public void setTeorCerveja(String teorCerveja) {
        this.teorCerveja = teorCerveja;
    }

    public String getIngredientesCeveja() {
        return ingredientesCeveja;
    }

    public void setIngredientesCeveja(String ingredientesCeveja) {
        this.ingredientesCeveja = ingredientesCeveja;
    }

    public String getTemperaturaCerveja() {
        return temperaturaCerveja;
    }

    public void setTemperaturaCerveja(String temperaturaCerveja) {
        this.temperaturaCerveja = temperaturaCerveja;
    }

    public String getCorCerveja() {
        return corCerveja;
    }

    public void setCorCerveja(String corCerveja) {
        this.corCerveja = corCerveja;
    }

    public String getCodigoPaisCerveja() {
        return codigoPaisCerveja;
    }

    public void setCodigoPaisCerveja(String codigoPaisCerveja) {
        this.codigoPaisCerveja = codigoPaisCerveja;
    }
}
