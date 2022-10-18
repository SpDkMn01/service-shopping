package com.nttdata.bootcamp.project.Shopping.utils;

import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoRequest;
import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoResponse;
import com.nttdata.bootcamp.project.Shopping.entity.Shopping;
/**
 * <h1>IShopping Mapper</h1>
 * @Author Grupo06
 * @version 1.0
 * @since 2022-10-18
 */
public interface IShoppingMapper
{
    ShoppingDtoRequest toDtoRequest(Shopping shopping);
    Shopping toEntity(ShoppingDtoRequest customerDto);
    ShoppingDtoResponse toDtoResponse(Shopping shopping);
}
