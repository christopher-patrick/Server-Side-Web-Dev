package edu.cpp.allservice.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
//@Data bundles features of @ToString, @Getter, @Setter and @RequiredArgsConstructor.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail {
    // this class contains fields from three classes, ProductBasic, Price, and Inventory
    private int productId;
    private String name;
    private String description;
    private double originalPrice;
    private double discountPrice;
    private boolean inStock;
}