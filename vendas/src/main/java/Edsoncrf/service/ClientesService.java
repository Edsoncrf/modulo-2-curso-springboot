package Edsoncrf.service;

import Edsoncrf.model.Cliente;
import Edsoncrf.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    //    injetando via construtor
    private  ClientesRepository repository;
    @Autowired
    public  ClientesService(ClientesRepository repository){
        this.repository = repository;
    }
    public void salvarClientes(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
//        aplica validações
    }
}
