package com.example.demomokito.gateway.database.converter;

import com.example.demomokito.entity.Endereco;
import com.example.demomokito.gateway.database.EnderecoData;
import org.springframework.stereotype.Component;

@Component
public class EnderecoDataConverter {

    public EnderecoData convert(Endereco endereco){

        EnderecoData enderecoData = new EnderecoData();

        if(endereco.getCodigo() > 0) {
            enderecoData.setId(endereco.getCodigo());
        }
        enderecoData.setBairro(endereco.getBairro());
        enderecoData.setComplemento(endereco.getComplemento());
        enderecoData.setRua(endereco.getRua());
        enderecoData.setNumero(endereco.getNumero());

        return enderecoData;

    }

}
