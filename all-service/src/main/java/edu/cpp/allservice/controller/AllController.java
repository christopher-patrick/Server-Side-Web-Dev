package edu.cpp.allservice.controller;

import edu.cpp.allservice.model.ProductDetail;
import edu.cpp.allservice.model.ProductBasic;
import edu.cpp.allservice.model.Price;
import edu.cpp.allservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

// @RestController annotation allows the class to handle the requests made by the client.
@RestController
public class AllController {
    // inject dependency for RestTemplate
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/detail/{productId}")
    public ProductDetail getProductDetail(@PathVariable int productId) {
// get a ProductBasic object from product-service at the given URL
        ProductBasic productBasic=
                restTemplate.getForObject("http://localhost:8001/products/" + productId,
                        ProductBasic.class);
// get a Price object from price-service at the given URL
        Price price = restTemplate.getForObject("http://localhost:8002/price/" + productId,
                Price.class);
// get an Inventory object form inventory-service at the given URL
        Inventory inventory = restTemplate.getForObject("http://localhost:8003/inventory/" +
                productId, Inventory.class);
        return new ProductDetail(productId, productBasic.getName(),
                productBasic.getDescription(), price.getOriginalPrice(), price.getDiscountPrice(),
                inventory.isInStock());
    } // end of getProductDetail()
} // end of AllController
