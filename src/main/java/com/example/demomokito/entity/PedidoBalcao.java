package com.example.demomokito.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@ToString
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
public class PedidoBalcao extends Pedido {

    public PedidoBalcao(){
        super();
    }
    private String nomeCliente;

}
