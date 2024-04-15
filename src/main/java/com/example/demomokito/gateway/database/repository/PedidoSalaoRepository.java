package com.example.demomokito.gateway.database.repository;

import com.example.demomokito.gateway.database.PedidoSalaoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PedidoSalaoRepository extends JpaRepository<PedidoSalaoData, Integer> {

    Optional<PedidoSalaoData> getByNumeroMesa(Integer numeroMesa);

}
