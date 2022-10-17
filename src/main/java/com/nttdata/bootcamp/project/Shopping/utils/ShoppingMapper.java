package com.nttdata.bootcamp.project.Shopping.utils;

import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoRequest;
import com.nttdata.bootcamp.project.Shopping.dto.ShoppingDtoResponse;
import com.nttdata.bootcamp.project.Shopping.entity.Shopping;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
@AllArgsConstructor
public class ShoppingMapper implements IShoppingMapper {
    private String uri;
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
        shoppingDtoResponse.setCustomerProductActiveUrl (uri + shopping.getCustomerProductActiveId());
        return shoppingDtoResponse;
    }
}
