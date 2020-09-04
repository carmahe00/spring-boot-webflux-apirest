package com.springboot.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.springboot.webflux.app.models.document.Categoria;



public interface CategoriaDao  extends ReactiveMongoRepository<Categoria, String>{

}
