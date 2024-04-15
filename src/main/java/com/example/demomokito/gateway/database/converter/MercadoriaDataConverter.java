package com.example.demomokito.gateway.database.converter;


import com.example.demomokito.entity.Mercadoria;
import com.example.demomokito.gateway.database.MercadoriaData;
import org.springframework.stereotype.Component;


@Component
public class MercadoriaDataConverter {

    public MercadoriaData convert(Mercadoria mercadoria){

        MercadoriaData mercadoriaData = new MercadoriaData();

        if(mercadoria.getCodigo() > 0) {
            mercadoriaData.setId(mercadoria.getCodigo());
        }
        mercadoriaData.setNome(mercadoria.getNome());
        mercadoriaData.setQuantidade(mercadoria.getQuantidade());
        mercadoriaData.setTipoQuantidade(mercadoria.getTipoQuantidade());

        return mercadoriaData;

    }

}
