package edu.cpp.priceservice.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
// @Data bundles features of @ToString, @Getter, @Setter and @RequiredArgsConstructor.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private int priceId;
    private int productId;
    private double originalPrice;
    private double discountPrice;
}