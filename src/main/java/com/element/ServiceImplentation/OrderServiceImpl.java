package com.element.ServiceImplentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.entity.OrderHeader;
import com.element.entity.ProductInfo;
import com.element.repository.OrderHeaderRepository;
import com.element.repository.ProductInfoRepository;
import com.element.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
	private OrderHeaderRepository OrderRepo;
    @Autowired
    private ProductInfoRepository ProductRepo;
	@Override
	public OrderHeader AddOrder(OrderHeader orderheader) {
		// TODO Auto-generated method stub
		
		OrderRepo.save(orderheader);
		return null;
	}
	@Override
	public ProductInfo AddProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		 ProductInfo save = ProductRepo.save(product);
		
		return save;
	}

}
