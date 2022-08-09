/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Java5.Java5.serviceImp;

import com.Java5.Java5.domain.Product;
import com.Java5.Java5.repository.ProductRepository;
import com.Java5.Java5.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    public <S extends Product> List<S> findAll(Example<S> example) {

        return productRepository.findAll(example);
    }

    public List<Product> findAlla() {
        return productRepository.findAll();
    }

    public List<Product> searchProducts(String name) {
        return productRepository.searchProducts(name);
    }

    public <S extends Product> S save(S entity) {
        return productRepository.save(entity);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public void delete(Product entity) {
        productRepository.delete(entity);
    }

}
