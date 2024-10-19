package com.microservicesExample.inventoryService.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InventoryEntity {

    @Id
    private String productId;
    private int quantity;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}