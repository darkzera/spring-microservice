package example.microservice.quickstart.controller;

import example.microservice.quickstart.model.Product;
import example.microservice.quickstart.repository.ProductRepository;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.StreamSupport;

import com.carrotsearch.hppc.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product productAdd){
        return productRepository.save(productAdd);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }


   // @RequestMapping(method = RequestMethod.GET)
   // ArrayList<Product> listAllProducts(){
   //     //ArrayList<Product> productsReturned = new ArrayList<Product>();
   //     ArrayList<Product> productsReturned = StreamSupport
   //         .stream(productRepository
   //                 .findAll().spliterator(), false)
   //         .collect(Collectors.toList());

   //     return productsReturned;
   // }



}
