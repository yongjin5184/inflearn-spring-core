package com.example.inflearnspring.core.domain.order.service;

import com.example.inflearnspring.core.domain.order.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
