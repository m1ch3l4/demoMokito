package com.example.demomokito.gateway.database.repository;

import com.example.demomokito.gateway.database.MercadoriaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoriaRepository extends JpaRepository<MercadoriaData, Integer> {

}
