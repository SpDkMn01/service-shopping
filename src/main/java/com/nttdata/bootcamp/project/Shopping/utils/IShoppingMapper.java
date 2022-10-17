package com.nttdata.bootcamp.project.Shopping.utils;

import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoRequest;
import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoResponse;
import com.nttdata.bootcamp.project.Shopping.entity.Shopping;

public interface IShoppingMapper
{
    ShoppingDtoRequest toDtoRequest(Shopping shopping);
    Shopping toEntity(ShoppingDtoRequest customerDto);
    ShoppingDtoResponse toDtoResponse(Shopping shopping);
}
