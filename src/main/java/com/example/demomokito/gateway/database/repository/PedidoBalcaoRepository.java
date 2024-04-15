package com.example.demomokito.gateway.database.repository;


import com.example.demomokito.gateway.database.PedidoBalcaoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoBalcaoRepository extends JpaRepository<PedidoBalcaoData, Integer> {

}
