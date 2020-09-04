package com.springboot.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.springboot.webflux.app.models.document.Producto;



public interface ProductoDao extends ReactiveMongoRepository<Producto, String>{

}
