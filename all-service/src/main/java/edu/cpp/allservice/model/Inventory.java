package edu.cpp.allservice.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
// @Data bundles features of @ToString, @Getter, @Setter and @RequiredArgsConstructor.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    private int inventoryId;
    private int productId;
    private boolean inStock;
}