package com.element.service;


import com.element.entity.OrderHeader;
import com.element.entity.ProductInfo;

public interface OrderService {
	public OrderHeader AddOrder(OrderHeader orderheader);  
		
	public ProductInfo AddProduct(ProductInfo product);
}