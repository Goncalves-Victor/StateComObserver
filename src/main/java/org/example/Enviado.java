package org.example;

public class Enviado implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new Entregue());
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}