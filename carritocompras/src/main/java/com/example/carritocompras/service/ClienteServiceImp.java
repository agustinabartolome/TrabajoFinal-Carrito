package com.example.carritocompras.service;

import com.example.carritocompras.entity.Cliente;
import com.example.carritocompras.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImp implements ClienteService{


    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> consultarCliente() {
        return (List<Cliente>) this.repo.findAll();
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        /*Cliente.setEmail(Cliente.getEmail());
        return this.repo.save(cliente);*/
       return cliente;
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        return this.repo.save(cliente);
    }

    @Override
    public Cliente buscarCliente(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarCliente(int id) {
        this.repo.deleteById(id);
    }


}
