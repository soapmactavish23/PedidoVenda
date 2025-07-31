package com.hkprogrammer.controller;

import com.hkprogrammer.model.Categoria;
import com.hkprogrammer.model.Produto;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    private Produto produto;

    private List<Categoria> categoriasRaizes;

    public CadastroProdutoBean() {
        produto = new Produto();
    }

    public void inicializar() {
        System.out.println("Inicializando...");

        categoriasRaizes = manager.createQuery("from Categoria", Categoria.class).getResultList();
    }

    public void salvar() {
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Categoria> getCategoriasRaizes() {
        return categoriasRaizes;
    }

}