package com.example.demomokito.controller.converter;


import com.example.demomokito.entity.Mercadoria;
import com.example.demomokito.gateway.database.MercadoriaData;
import org.springframework.stereotype.Component;


@Component
public class MercadoriaConverter {

    public Mercadoria convert(MercadoriaData mercadoriaData){

        Mercadoria mercadoria = new Mercadoria();

        mercadoria.setCodigo(mercadoriaData.getId());
        mercadoria.setNome(mercadoriaData.getNome());
        mercadoria.setQuantidade(mercadoriaData.getQuantidade());
        mercadoria.setTipoQuantidade(mercadoriaData.getTipoQuantidade());

        return mercadoria;

    }

}
