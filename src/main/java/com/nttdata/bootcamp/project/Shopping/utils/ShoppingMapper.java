package com.nttdata.bootcamp.project.Shopping.utils;

import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoRequest;
import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoResponse;
import com.nttdata.bootcamp.project.Shopping.entity.Shopping;
import org.springframework.beans.BeanUtils;

public class ShoppingMapper implements IShoppingMapper {
    @Override
    public ShoppingDtoRequest toDtoRequest(Shopping shopping)
    {
        ShoppingDtoRequest shoppingDtoRequest = new ShoppingDtoRequest();
        BeanUtils.copyProperties(shopping, shoppingDtoRequest);
        return shoppingDtoRequest;
    }
    @Override
    public Shopping toEntity(ShoppingDtoRequest shoppingDtoRequest)
    {
        Shopping shopping = new Shopping();
        BeanUtils.copyProperties(shoppingDtoRequest, shopping);
        return shopping;
    }
    @Override
    public ShoppingDtoResponse toDtoResponse(Shopping shopping)
    {
        ShoppingDtoResponse shoppingDtoResponse = new ShoppingDtoResponse();
        BeanUtils.copyProperties(shopping, shoppingDtoResponse);
        shoppingDtoResponse.setCustomerProductActiveUrl ("/api/v1/customerTypes/" + shopping.getCustomerProductActiveId());
        return shoppingDtoResponse;
    }
}
