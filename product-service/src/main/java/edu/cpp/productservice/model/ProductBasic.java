package edu.cpp.productservice.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBasic {
    private int id;
    private String name;
    private String description;
}