package edu.cpp.inventoryservice.service;
import edu.cpp.inventoryservice.model.Inventory;
import org.springframework.stereotype.Service;
import java.util.*;
// @Service marks a class as service provider - providing business functionalities
@Service
public class InventoryService {
    List <Inventory> inventoryList= new ArrayList<Inventory> ();
    public Inventory getInventory(int productId) {
        populateInventoryList();
        for (Inventory inv : inventoryList) {
            if (productId == inv.getProductId()) {
                return inv;
            }
        }
        return null;
    }
    // here we don't use database, but hard code data – inventoryId, productId, inStock
    private void populateInventoryList() {
        inventoryList.add(new Inventory(701, 101, true));
        inventoryList.add(new Inventory(702, 102, true));
        inventoryList.add(new Inventory(703, 103, false));
    }
} // end of InventoryService