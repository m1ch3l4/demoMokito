package com.example.demomokito.gateway.database.repository;

import com.example.demomokito.gateway.database.ProdutoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoData, Integer> {

}
