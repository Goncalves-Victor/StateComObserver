package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveReceberNotificacaoQuandoPedidoForEnviado() {

        Pedido pedido = new Pedido();

        Cliente cliente = new Cliente("Gustavo");

        cliente.acompanharPedido(pedido);

        pedido.avancarPedido();

        assertEquals(
                "Gustavo: Status do pedido alterado para: Enviado",
                cliente.getUltimaNotificacao()
        );
    }

    @Test
    public void deveReceberNotificacaoQuandoPedidoForEntregue() {

        Pedido pedido = new Pedido();

        Cliente cliente = new Cliente("Gustavo");

        cliente.acompanharPedido(pedido);

        pedido.avancarPedido();
        pedido.avancarPedido();

        assertEquals(
                "Gustavo: Status do pedido alterado para: Entregue",
                cliente.getUltimaNotificacao()
        );
    }

    @Test
    public void deveNotificarClienteQuandoEstadoDoPedidoMudar() {

        Pedido pedido = new Pedido();

        Cliente cliente = new Cliente("Joao");

        cliente.acompanharPedido(pedido);

        assertEquals("Pendente", pedido.getEstado());

        pedido.avancarPedido();

        assertEquals("Enviado", pedido.getEstado());

        assertEquals(
                "Joao: Status do pedido alterado para: Enviado",
                cliente.getUltimaNotificacao()
        );
    }

}