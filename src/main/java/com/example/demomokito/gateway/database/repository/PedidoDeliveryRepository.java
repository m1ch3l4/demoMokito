package com.example.demomokito.gateway.database.repository;

import com.example.demomokito.gateway.database.PedidoDeliveryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDeliveryRepository extends JpaRepository<PedidoDeliveryData, Integer> {

}
