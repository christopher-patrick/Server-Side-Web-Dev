package edu.cpp.productservice.controller;
import edu.cpp.productservice.model.ProductBasic;
import edu.cpp.productservice.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// @RestController allows the class to handle the HTTP requests made by the client.
@RestController
public class ProductController {
    private ProductService productService;
    // inject dependency for ProductService into this class
    public ProductController(ProductService ps) {
        productService = ps;
    }
    @GetMapping("/products/{productId}")
    public ProductBasic getProductBasic(@PathVariable int productId) {
// from a product ID to get a ProductBasic object from productService
        ProductBasic productBasic = productService.getProductBasic(productId);
        return productBasic;
    }
}