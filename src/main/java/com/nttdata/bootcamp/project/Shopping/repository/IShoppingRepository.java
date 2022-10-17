package com.nttdata.bootcamp.project.Shopping.repository;

import com.nttdata.bootcamp.project.Shopping.entity.Shopping;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShoppingRepository extends ReactiveMongoRepository<Shopping, String> {
}
