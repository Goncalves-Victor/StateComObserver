package org.example;

public class Pendente implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new Enviado());
    }

    @Override
    public String getNome() {
        return "Pendente";
    }
}