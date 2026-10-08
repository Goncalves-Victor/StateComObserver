package org.example;

import java.util.Observable;

public class Pedido extends Observable {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new Pendente();
    }

    public void avancarPedido() {
        estado.avancar(this);
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        setChanged();
        notifyObservers("Status do pedido alterado para: "+ estado.getNome());
    }
    public String getEstado() {
        return estado.getNome();
    }
}