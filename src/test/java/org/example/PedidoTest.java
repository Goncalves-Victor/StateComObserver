package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void deveIniciarComoPendente() {

        Pedido pedido = new Pedido();

        assertEquals("Pendente", pedido.getEstado());
    }

    @Test
    public void deveMudarDePendenteParaEnviado() {

        Pedido pedido = new Pedido();

        pedido.avancarPedido();

        assertEquals("Enviado", pedido.getEstado());
    }

    @Test
    public void deveMudarDeEnviadoParaEntregue() {

        Pedido pedido = new Pedido();

        pedido.avancarPedido();
        pedido.avancarPedido();

        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    public void naoDeveMudarDepoisDeEntregue() {

        Pedido pedido = new Pedido();

        pedido.avancarPedido();
        pedido.avancarPedido();
        pedido.avancarPedido();

        assertEquals("Entregue", pedido.getEstado());
    }
}