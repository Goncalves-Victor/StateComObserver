package org.example;

public class Entregue implements EstadoPedido{
    @Override
    public void avancar(Pedido pedido) {
        // O pedido permanece no estado Entregue.
    }

    @Override
    public String getNome() {
        return "Entregue";
    }
}
