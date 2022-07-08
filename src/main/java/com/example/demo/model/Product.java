package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Indexed
@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    private Integer id;
    @FullTextField()
    @NaturalId()
    private String name;
    @FullTextField()
    @NaturalId()
    private String description;
    private BigDecimal price;

}
