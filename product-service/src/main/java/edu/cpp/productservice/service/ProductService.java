package edu.cpp.productservice.service;
import edu.cpp.productservice.model.ProductBasic;
import org.springframework.stereotype.Service;
import java.util.*;
// @Service marks a class as service provider that provides business functionalities
@Service
public class ProductService {
    List <ProductBasic> listProductBasic = new ArrayList<ProductBasic>();
    // from a product ID to return a ProductBasic object
    public ProductBasic getProductBasic(int productId) {
        populateProductBasicList();
        ProductBasic pb = null;
        for (ProductBasic item : listProductBasic) {
            if (productId == item.getId()) {
                pb = item;
                break;
            }
        }
        return pb;
    } // end of getProductBasic()
    // For simplicity we don't use database, but hard code data for id, name, and description
    private void populateProductBasicList() {
        listProductBasic.add(new ProductBasic(101, "IdeaPad Flex 3", "Lenovo IdeaPad Flex 3 11\" 64GB"));
        listProductBasic.add(new ProductBasic(102, "Yoga 9i", "Lenovo Yoga 9i 2-in-1 14\" i5 256GB"));
        listProductBasic.add(new ProductBasic(103, "ThinkPad T14s", "Lenovo Think Pad T14s 14\" i5 512GB"));
    } // end of populateProductBasicList()
}