package org.akash.app.Controller;

import java.util.List;

import org.akash.app.model.dto.OrderRequest;
import org.akash.app.model.dto.OrderResponse;
import org.akash.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5174/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/orders/place")
	public ResponseEntity<OrderResponse>placeOrder(@RequestBody OrderRequest orderRequest){
		OrderResponse orderResponse=orderService.placeOrder(orderRequest);
		return new ResponseEntity<>(orderResponse,HttpStatus.CREATED);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<OrderResponse>> getAllOrders(){
		List<OrderResponse> responses=orderService.getAllOrderResponses();
		return new ResponseEntity<>(responses,HttpStatus.OK);
	}
}
