package com.microservicesExample.orderService.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicesExample.orderService.order.model.OrderEntity;
import com.microservicesExample.orderService.order.model.ProductDto;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderEntity getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public OrderEntity addOrder(OrderEntity order) {
        ProductDto product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
