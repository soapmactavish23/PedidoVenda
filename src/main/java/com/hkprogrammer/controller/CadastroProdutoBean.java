package com.hkprogrammer.controller;

import com.hkprogrammer.model.Produto;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Produto produto;

    public CadastroProdutoBean() {
        produto = new Produto();
    }

    public void salvar() {
    }

    public Produto getProduto() {
        return produto;
    }

}