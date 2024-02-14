package edu.cpp.priceservice.service;
import edu.cpp.priceservice.model.Price;
import org.springframework.stereotype.Service;
import java.util.*;
// @Service marks a class as service provider that provides business functionalities
@Service
public class PriceService {
    List <Price> priceList= new ArrayList<Price> ();
    // returns a Price object from a productId
    public Price getPrice(int productId) {
        populatePriceList();
        for (Price price : priceList) {
            if (productId == price.getProductId()) {
                return price;
            }
        }
        return null;
    } // end of getPrice()
    // we don't use database, but hard code data – priceId, productid, price, discount price
    private void populatePriceList() {
        priceList.add(new Price(11, 101, 300, 270)); // priceId, productId, price, discount price
        priceList.add(new Price(12, 102, 1100, 900));
        priceList.add(new Price(13, 103, 1300, 1060));
    }
} // end of PriceService