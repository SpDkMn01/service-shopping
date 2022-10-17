package com.nttdata.bootcamp.project.Shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingDtoRequest
{
    private String customerProductActiveId;
    private double mount;
}
