package com.nttdata.bootcamp.project.Shopping.controller;

import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoRequest;
import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoResponse;
import com.nttdata.bootcamp.project.Shopping.service.IShoppingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("${message.path-shopping}")
@RefreshScope
public class ShoppingController
{
    @Autowired
    private IShoppingService service;
    @GetMapping
    public Flux<ShoppingDtoResponse> getAll()
    {
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Mono<ShoppingDtoResponse> getById(@PathVariable String id)
    {
        return service.getById(id);
    }
    @PostMapping
    public Mono<ShoppingDtoResponse> save(@RequestBody Mono<ShoppingDtoRequest> requestMono)
    {
        return service.save(requestMono);
    }
    @PutMapping("/update/{id}")
    public Mono<ShoppingDtoResponse> update(@RequestBody Mono<ShoppingDtoRequest> requestMono, @PathVariable String id)
    {
        return service.update(requestMono,id);
    }
    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable String id)
    {
        return service.delete(id);
    }
}
