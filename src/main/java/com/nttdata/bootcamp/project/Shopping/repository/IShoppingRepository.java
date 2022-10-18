package com.nttdata.bootcamp.project.Shopping.repository;

import com.nttdata.bootcamp.project.Shopping.entity.Shopping;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
/**
 * <h1>IShopping Repository</h1>
 * @Author Grupo06
 * @version 1.0
 * @since 2022-10-18
 */
@Repository
public interface IShoppingRepository extends ReactiveMongoRepository<Shopping, String> {
}
