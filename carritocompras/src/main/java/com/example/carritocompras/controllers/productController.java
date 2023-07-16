package com.example.carritocompras.controllers;

import com.example.carritocompras.entity.product;
import com.example.carritocompras.repositories.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class productController {


    @Autowired
    private productRepository productRepository;

    @GetMapping
    public List<product> getAllProduct(){
        return productRepository.findAll();
    }

/*    @GetMapping("List")
    public ResponseEntity<List<product>> getListProduct(){
        return ResponseEntity.ok (productService.getListProduct());
    }
 */

    /*
    @GetMapping("{id}")
    public ResponseEntity<product> getProductById(@PathVariable  int id){
        Optional<product> product = productRepository.findById(id);

        return ResponseEntity.ok(product);
    }

*/

  //@GetMapping()
   // public String index(){
     //   return "Conectado";
   // }

    //@Autowired
    //private productServiceImp impl;

   // @GetMapping()
    //@RequestMapping(value = "consultar poducto"method = RequestMethod.GET)
    //public ResponseEntity<?> ConsultarProducto

}
