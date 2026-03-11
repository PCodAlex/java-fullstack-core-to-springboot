package org.akash.app.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.akash.app.model.Order;
import org.akash.app.model.OrderItem;
import org.akash.app.model.Product;
import org.akash.app.model.dto.OrderItemRequest;
import org.akash.app.model.dto.OrderItemResponse;
import org.akash.app.model.dto.OrderRequest;
import org.akash.app.model.dto.OrderResponse;
import org.akash.app.repo.OrderRepo;
import org.akash.app.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
	
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private OrderRepo orderRepo;

	public OrderResponse placeOrder(OrderRequest request) {
		Order order=new Order();
		String orderId="ORD"+UUID.randomUUID().toString().substring(0,8).toUpperCase();
		order.setOrderId(orderId);
		order.setCustomerName(request.customerName());
		order.setEmail(request.email());
		order.setStatus("PLACED");
		order.setOrderDate(LocalDate.now());
		
		
		List<OrderItem> orderItems=new ArrayList();
		for(OrderItemRequest itemRequest :request.items()){
			Product product=productRepo.findById(itemRequest.productId())
					.orElseThrow(()-> new RuntimeException("Product Not Found"));
			product.setStockQuantity(product.getStockQuantity()-itemRequest.quantity());
			productRepo.save(product);
			
			OrderItem orderItem=OrderItem.builder()
					.product(product)
					.quantity(itemRequest.quantity())
					.totalPrice(product.getPrice().multiply(BigDecimal.valueOf(itemRequest.quantity())))
					.order(order)
					.build();
			
			orderItems.add(orderItem);
		}
		
		order.setOrderItems(orderItems);
		Order saveOrder=orderRepo.save(order);
		
		List<OrderItemResponse>itemResponses=new ArrayList<>();
		for(OrderItem item:order.getOrderItems()) {
			OrderItemResponse orderItemResponse=new OrderItemResponse(
					item.getProduct().getName(),
					item.getQuantity(),
					item.getTotalPrice()
					);
			itemResponses.add(orderItemResponse);
		};
		
		
		OrderResponse orderResponse=new OrderResponse(
				saveOrder.getOrderId(),
				saveOrder.getCustomerName(),
				saveOrder.getEmail(),
				saveOrder.getStatus(),
				saveOrder.getOrderDate(),
				itemResponses);
		
		return orderResponse;
	}
	@Transactional
	public List<OrderResponse> getAllOrderResponses() {
		List<Order> orders=orderRepo.findAll();
		List<OrderResponse> orderResponses =new ArrayList<>();
		for(Order order :orders) {
			
			List<OrderItemResponse> itemResponses=new ArrayList<>();
			
			for(OrderItem item : order.getOrderItems()) {
				OrderItemResponse orderItemResponses=new OrderItemResponse(
						item.getProduct().getName(),
						item.getQuantity(),
						item.getTotalPrice()
				);
				itemResponses.add(orderItemResponses);
					
			}
			
			OrderResponse orderResponse=new OrderResponse(
					order.getOrderId(),
					order.getCustomerName(),
					order.getEmail(),
					order.getStatus(),
					order.getOrderDate(),
					itemResponses);
			orderResponses.add(orderResponse);
		}
		return orderResponses;
	}

}
