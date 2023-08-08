package com.element.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.element.entity.OrderHeader;
import com.element.entity.ProductInfo;
import com.element.service.OrderService;

@RestController
public class MainController {
	@Autowired
	public OrderService service;
	
    @PostMapping("/save")
	public OrderHeader saveorder(@RequestBody OrderHeader order) {
		
		OrderHeader addOrder = service.AddOrder(order);
		return addOrder;
		
	}
    @PostMapping("/saveProduct")
    public ProductInfo saveProduct(@RequestBody ProductInfo product) {
    	ProductInfo addProduct = service.AddProduct(product);
    	
    	return addProduct;
    }
}
