package com.microservicesExample.inventoryService.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesExample.inventoryService.inventory.model.InventoryEntity;

public interface InventoryRepository extends JpaRepository<InventoryEntity, String> {

}
