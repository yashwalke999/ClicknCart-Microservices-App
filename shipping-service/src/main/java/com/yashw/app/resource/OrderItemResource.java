package com.yashw.app.resource;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yashw.app.domain.id.OrderItemId;
import com.yashw.app.dto.OrderItemDto;
import com.yashw.app.dto.response.collection.DtoCollectionResponse;
import com.yashw.app.service.OrderItemService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/shippings")
@Slf4j
@RequiredArgsConstructor
public class OrderItemResource {
	
	private final OrderItemService orderItemService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<OrderItemDto>> findAll() {
		log.info("*** OrderItemDto List, controller; fetch all orderItems *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.orderItemService.findAll()));
	}
	
	@GetMapping("/{orderId}/{productId}")
	public ResponseEntity<OrderItemDto> findById(
			@PathVariable("orderId") final String orderId, 
			@PathVariable("productId") final String productId) {
		log.info("*** OrderItemDto, resource; fetch orderItem by id *");
		return ResponseEntity.ok(this.orderItemService.findById(
				new OrderItemId(Integer.parseInt(orderId), Integer.parseInt(productId))));
	}
	
	@GetMapping("/find")
	public ResponseEntity<OrderItemDto> findById(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemId orderItemId) {
		log.info("*** OrderItemDto, resource; fetch orderItem by id *");
		return ResponseEntity.ok(this.orderItemService.findById(orderItemId));
	}
	
	@PostMapping
	public ResponseEntity<OrderItemDto> save(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemDto orderItemDto) {
		log.info("*** OrderItemDto, resource; save orderItem *");
		return ResponseEntity.ok(this.orderItemService.save(orderItemDto));
	}
	
	@PutMapping
	public ResponseEntity<OrderItemDto> update(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemDto orderItemDto) {
		log.info("*** OrderItemDto, resource; update orderItem *");
		return ResponseEntity.ok(this.orderItemService.update(orderItemDto));
	}
	
	@DeleteMapping("/{orderId}/{productId}")
	public ResponseEntity<Boolean> deleteById(
			@PathVariable("orderId") final String orderId, 
			@PathVariable("productId") final String productId) {
		log.info("*** Boolean, resource; delete orderItem by id *");
		this.orderItemService.deleteById(new OrderItemId(Integer.parseInt(orderId), Integer.parseInt(productId)));
		return ResponseEntity.ok(true);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Boolean> deleteById(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final OrderItemId orderItemId) {
		log.info("*** Boolean, resource; delete orderItem by id *");
		this.orderItemService.deleteById(orderItemId);
		return ResponseEntity.ok(true);
	}
	
	
	
}










