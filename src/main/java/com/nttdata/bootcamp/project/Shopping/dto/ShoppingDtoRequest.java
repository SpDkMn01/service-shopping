package com.nttdata.bootcamp.project.Shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * <h1>ShoppingDtoRequest</h1>
 * @Author Grupo06
 * @version 1.0
 * @since 2022-10-18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingDtoRequest
{
    private String customerProductActiveId;
    private double amount;
}
