package com.nttdata.bootcamp.project.Shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingDtoResponse
{
    private String id;
    private String customerProductActiveUrl;
    private double mount;
}
