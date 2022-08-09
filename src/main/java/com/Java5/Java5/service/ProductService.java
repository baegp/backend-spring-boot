/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Java5.Java5.service;

import com.Java5.Java5.domain.Category;
import com.Java5.Java5.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    void delete(Product entity);

    <S extends Product> List<S> findAll(Example<S> example);

    List<Product> findAlla();

    Optional<Product> findById(Long id);

    <S extends Product> S save(S entity);

    List<Product> searchProducts(String name);

}
