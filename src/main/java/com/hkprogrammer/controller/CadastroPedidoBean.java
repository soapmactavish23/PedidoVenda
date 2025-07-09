package com.hkprogrammer.controller;

import com.hkprogrammer.model.EnderecoEntrega;
import com.hkprogrammer.model.Pedido;
import com.hkprogrammer.service.NegocioException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Pedido pedido;

    private List<Integer> itens;

    public CadastroPedidoBean() {
        pedido = new Pedido();
        pedido.setEnderecoEntrega(new EnderecoEntrega());
        itens = new ArrayList<>();
        itens.add(1);
    }

    public void salvar() {
    }

    public List<Integer> getItens() {
        return itens;
    }

    public Pedido getPedido() {
        return pedido;
    }

}