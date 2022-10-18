package com.nttdata.bootcamp.project.Shopping.service;

import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoRequest;
import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoResponse;
import com.nttdata.bootcamp.project.Shopping.repository.IShoppingRepository;
import com.nttdata.bootcamp.project.Shopping.utils.IShoppingMapper;
import com.nttdata.bootcamp.project.Shopping.utils.ShoppingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * <h1>Shopping Service</h1>
 * @Author Grupo06
 * @version 1.0
 * @since 2022-10-18
 */
@Service
@RequiredArgsConstructor
public class ShoppingService implements IShoppingService<ShoppingDtoRequest, ShoppingDtoResponse> {
    @Autowired
    private final IShoppingRepository repository;
    @Autowired
    private final IShoppingMapper mapper;
    @Override
    public Flux<ShoppingDtoResponse> getAll() {
        return repository.findAll()
                .map(mapper::toDtoResponse);
    }
    @Override
    public Mono<ShoppingDtoResponse> getById(String id)
    {
        return repository.findById(id)
                .map(mapper::toDtoResponse);
    }
    @Override
    public Mono<ShoppingDtoResponse> save(Mono<ShoppingDtoRequest> object)
    {
        return object.map(mapper::toEntity)
                .flatMap(repository::insert)
                .map(mapper::toDtoResponse);
    }
    @Override
    public Mono<ShoppingDtoResponse> update(Mono<ShoppingDtoRequest> object, String id)
    {
        return repository.findById(id)
                .flatMap(
                        p -> object.map(mapper::toEntity)
                                .doOnNext(e -> e.setId(id))
                )
                .flatMap(repository::save)
                .map(mapper::toDtoResponse);
    }
    @Override
    public Mono<Void> delete(String id)
    {
        return repository.deleteById(id);
    }
}