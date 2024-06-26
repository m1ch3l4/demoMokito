package com.example.demomokito.app.controller;


import com.example.demomokito.controller.PedidoController;
import com.example.demomokito.controller.converter.PedidoConverter;
import com.example.demomokito.entity.PedidoSalao;
import com.example.demomokito.entity.Produto;
import com.example.demomokito.gateway.PedidoGateway;
import com.example.demomokito.gateway.database.converter.PedidoDataConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

public class PedidoControllerTests {

    private PedidoController pedidoController;

    private PedidoGateway pedidoGateway;
    private PedidoDataConverter pedidoDataConverter;
    private PedidoConverter pedidoConverter;

    @BeforeEach
    public void init(){
        pedidoGateway = mock(PedidoGateway.class);
        pedidoDataConverter = mock(PedidoDataConverter.class);
        pedidoConverter = mock(PedidoConverter.class);
        pedidoController = new PedidoController(pedidoGateway, pedidoDataConverter, pedidoConverter);
    }

    @Test
    public void testCreatePedidoSalao(){

        Produto produto = new Produto();
        produto.setCodigo(1);
        produto.setCaminhoImagem("/imgs/imagem1.jpg");
        produto.setDescricao("Descricao produto 1");
        produto.setNome("Produto 1");
        produto.setPreco(new BigDecimal(200));

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);

        PedidoSalao pedidoSalao = new PedidoSalao();
        pedidoSalao.setStatus(1);
        pedidoSalao.setCodigo(2);
        pedidoSalao.setNumeroMesa(14);
        pedidoSalao.setProdutos(produtos);
        pedidoSalao.setTotal(new BigDecimal(200));

        pedidoController.createPedidoSalao(pedidoSalao);
    }


    @Test
    public void testCreatePedidoSalaoException() throws Exception {
        Produto produto = new Produto();
        produto.setCodigo(1);
        produto.setCaminhoImagem("/imgs/imagem1.jpg");
        produto.setDescricao("Descricao produto 1");
        produto.setNome("Produto 1");
        produto.setPreco(new BigDecimal(200));

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);

        PedidoSalao pedidoSalao = new PedidoSalao();
        pedidoSalao.setStatus(1);
        pedidoSalao.setCodigo(2);
        pedidoSalao.setNumeroMesa(14);
        pedidoSalao.setProdutos(produtos);
        pedidoSalao.setTotal(new BigDecimal(200));

        doThrow(Exception.class).when(pedidoGateway).savePedidoSalao(any());

        pedidoController.createPedidoSalao(pedidoSalao);

    }

}
