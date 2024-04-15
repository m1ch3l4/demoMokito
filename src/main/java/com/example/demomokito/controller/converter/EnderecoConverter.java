package com.example.demomokito.controller.converter;


import com.example.demomokito.entity.Endereco;
import com.example.demomokito.gateway.database.EnderecoData;
import org.springframework.stereotype.Component;

@Component
public class EnderecoConverter {

    public Endereco convert(EnderecoData enderecoData){

        Endereco endereco = new Endereco();

        endereco.setCodigo(enderecoData.getId());
        endereco.setBairro(enderecoData.getBairro());
        endereco.setComplemento(enderecoData.getComplemento());
        endereco.setRua(enderecoData.getRua());
        endereco.setNumero(enderecoData.getNumero());

        return endereco;

    }

}
