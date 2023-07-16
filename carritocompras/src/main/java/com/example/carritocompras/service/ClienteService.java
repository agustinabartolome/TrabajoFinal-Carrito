package com.example.carritocompras.service;

import com.example.carritocompras.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {


    public List<Cliente> consultarCliente();

    public Cliente crearCliente(Cliente cliente);

    public Cliente modificarCliente(Cliente cliente);

    public Cliente buscarCliente(int id);

    public void eliminarCliente(int id);




    /*
    @Override
    public List<Cliente> getAllCliente() {
        return ClienteRepository.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return ClienteRepository.save(cliente);
    }

    @Override
    public Cliente getClienteById(int id) {
        return ClienteRepository.findById(id).get();
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return ClienteRepository.save(cliente);
    }

    @Override
    public void deleteClienteById(Long id) {
        ClienteRepository.deleteById(id);
    }

    */

    /*
    public List<Cliente> consultarCliente();

    public Cliente crearCliente(Cliente cliente);

    public Cliente modificarCliente(Cliente cliente);

    public Cliente buscarCliente(int id);

    public void eliminarCliente(int id);

     */
}

