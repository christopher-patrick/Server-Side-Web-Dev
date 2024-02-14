package edu.cpp.priceservice.controller;
import edu.cpp.priceservice.model.Price;
import edu.cpp. priceservice.service.PriceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// @RestController annotation allows the class to handle the requests made by the client.
@RestController
public class PriceController {
    private PriceService priceService;
    // inject dependency for PriceService into this class
    public PriceController(PriceService ps) {
        this.priceService = ps;
    }
    @GetMapping("/price/{productId}")
    public Price getPrice(@PathVariable int productId) {
// get price from price-service
        Price price = priceService.getPrice(productId);
        return price;
    } // end of getPrice()
} // end of PriceController