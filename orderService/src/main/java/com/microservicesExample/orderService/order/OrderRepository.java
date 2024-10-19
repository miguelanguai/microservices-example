package com.microservicesExample.orderService.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesExample.orderService.order.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, String> {

}
