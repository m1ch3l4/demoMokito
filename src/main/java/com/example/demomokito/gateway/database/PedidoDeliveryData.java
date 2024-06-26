package com.example.demomokito.gateway.database;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedido_delivery")
public class PedidoDeliveryData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToMany(fetch = FetchType.EAGER)
    @Column(name = "item")
    private List<ProdutoData> produtos;

    @Column(name = "total")
    private BigDecimal total;

    @OneToOne(fetch = FetchType.EAGER)
    private ClienteData cliente;

}
