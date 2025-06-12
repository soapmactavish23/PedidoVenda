package com.hkprogrammer.controller;

import com.hkprogrammer.service.NegocioException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean {

    private List<Integer> itens;

    public CadastroPedidoBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }

    public List<Integer> getItens() {
        return itens;
    }

    public void salvar() {
        throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado.");
    }

}