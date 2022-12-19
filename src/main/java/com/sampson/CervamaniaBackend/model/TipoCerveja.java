package com.sampson.CervamaniaBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoCerveja {

    @Id
    @Column(name = "CODIGO_TIPO_CERVEJA")
    private String codigoTipoCerveja;

    @Column(name = "NOME_TIPO_CERVEJA")
    private String nomeTipoCerveja;

    @Column(name = "DESCRICAO_TIPO_CERVEJA")
    private String descricaoTipoCerveja;

    public String getCodigoTipoCerveja() {
        return codigoTipoCerveja;
    }

    public void setCodigoTipoCerveja(String codigoTipoCerveja) {
        this.codigoTipoCerveja = codigoTipoCerveja;
    }

    public String getNomeTipoCerveja() {
        return nomeTipoCerveja;
    }

    public void setNomeTipoCerveja(String nomeTipoCerveja) {
        this.nomeTipoCerveja = nomeTipoCerveja;
    }

    public String getDescricaoTipoCerveja() {
        return descricaoTipoCerveja;
    }

    public void setDescricaoTipoCerveja(String descricaoTipoCerveja) {
        this.descricaoTipoCerveja = descricaoTipoCerveja;
    }
}
