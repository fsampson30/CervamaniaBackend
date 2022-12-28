package com.sampson.CervamaniaBackend.model;

import com.sampson.CervamaniaBackend.dto.ClassificacaoDto;

import javax.persistence.*;

@Entity
@SqlResultSetMapping(
        name = "ratingsMapping",
        classes = {
                @ConstructorResult(
                        targetClass = ClassificacaoDto.class,
                        columns = {
                                @ColumnResult(name = "nomeCerveja", type = String.class),
                                @ColumnResult(name = "nota", type = Double.class)
                        }
                )
        }
)
@NamedNativeQuery(
        name = "Classificacao.getClassificacaoDto",
        query = "SELECT c.NOME_CERVEJA as nomeCerveja , ROUND(SUM(cl.CLASSIFICACAO) / COUNT(cl.CODIGO_CERVEJA),2)  " +
                "as nota FROM classificacao cl JOIN cerveja c ON cl.CODIGO_CERVEJA = c.CODIGO_CERVEJA GROUP BY " +
                "cl.CODIGO_CERVEJA ORDER BY 2 DESC, c.NOME_CERVEJA",
        resultSetMapping = "ratingsMapping"
)
@Table(name = "classificacao")
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
