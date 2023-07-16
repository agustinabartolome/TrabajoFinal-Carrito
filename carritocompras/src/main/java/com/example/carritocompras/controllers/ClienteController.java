package com.example.carritocompras.controllers;

import com.example.carritocompras.entity.Cliente;
import com.example.carritocompras.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/cliente") //URL DE LA API api/carritocompras1/Cliente
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

  /*  @GetMapping
    public List<Cliente> getAllCliente(){
        return ClienteRepository.findAll();
    }
*/
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        //return ClienteRepository.save(cliente);
    return cliente;
    }

    @GetMapping("{id}")
    public ResponseEntity getClienteById(@PathVariable  int id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("cliente")
    public ResponseEntity<Cliente> updateCliente(@PathVariable int id,@RequestBody Cliente clienteDetails) {

        Cliente updateCliente = new Cliente();

        updateCliente.setNombre(clienteDetails.getNombre());
        updateCliente.setApellido(clienteDetails.getApellido());
        updateCliente.setUsername(clienteDetails.getUsername());
        updateCliente.setEmail(clienteDetails.getEmail());
        updateCliente.setDireccion(clienteDetails.getDireccion());
        updateCliente.setTelefono(clienteDetails.getTelefono());
        updateCliente.setPassword(clienteDetails.getPassword());

        clienteRepository.save(updateCliente);

        return ResponseEntity.ok(updateCliente);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteCliente(@PathVariable int id){

        Optional<Cliente> cliente = clienteRepository.findById(id);

        clienteRepository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}

