package edu.cpp.inventoryservice.controller;
import edu.cpp.inventoryservice.model.Inventory;
import edu.cpp. inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// @RestController annotation allows the class to handle the requests made by the client.
@RestController
public class InventoryController {
    // @Autowired allows Spring to resolve and inject dependency into bean
    // dependency injection by field and no need to use constructor to inject dependency
    @Autowired
    private InventoryService inventoryService; // field, attribute, property
    @GetMapping("/inventory/{productId}")
    public Inventory getInventory(@PathVariable int productId) {
    // get stock availability form inventory-service
        Inventory inv = inventoryService.getInventory(productId);
        return inv;
    }
} // end of InventoryController
