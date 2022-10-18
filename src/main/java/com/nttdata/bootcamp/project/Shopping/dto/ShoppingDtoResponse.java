package com.nttdata.bootcamp.project.Shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
/**
 * <h1>ShoppingDtoResponse</h1>
 * @Author Grupo06
 * @version 1.0
 * @since 2022-10-18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingDtoResponse
{
    private String id;
    private String customerProductActiveUrl;
    private double amount;
    private Date shoppingDate;
}
