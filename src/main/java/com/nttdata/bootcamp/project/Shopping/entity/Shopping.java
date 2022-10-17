package com.nttdata.bootcamp.project.Shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "shopping")
public class Shopping {
    @Id
    private String id;
    private String customerProductActiveId;
    private double mount;
}
