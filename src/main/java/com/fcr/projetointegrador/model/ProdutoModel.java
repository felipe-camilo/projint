package com.fcr.projetointegrador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "produto")
public class ProdutoModel {

    @Id
    public Integer codigo;

    @Column(nullable = false, length = 40)
    public String nome;

    @Column(nullable = false, length = 400)
    public String descricao;

    @Column(nullable = false, length = 20)
    public String img;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
