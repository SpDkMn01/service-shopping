package com.nttdata.bootcamp.project.Shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
/**
 * <h1>Shopping Entity</h1>
 * @Author Grupo06
 * @version 1.0
 * @since 2022-10-18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "shopping")
public class Shopping {
    @Id
    private String id;
    private String customerProductActiveId;
    private double amount;
    private Date shoppingDate;
}
