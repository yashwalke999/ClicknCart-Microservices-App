package com.yashw.app.helper;

import com.yashw.app.domain.OrderItem;
import com.yashw.app.dto.OrderDto;
import com.yashw.app.dto.OrderItemDto;
import com.yashw.app.dto.ProductDto;

public interface OrderItemMappingHelper {
	
	public static OrderItemDto map(final OrderItem orderItem) {
		return OrderItemDto.builder()
				.productId(orderItem.getProductId())
				.orderId(orderItem.getOrderId())
				.orderedQuantity(orderItem.getOrderedQuantity())
				.productDto(
						ProductDto.builder()
							.productId(orderItem.getProductId())
							.build())
				.orderDto(
						OrderDto.builder()
							.orderId(orderItem.getOrderId())
							.build())
				.build();
	}
	
	public static OrderItem map(final OrderItemDto orderItemDto) {
		return OrderItem.builder()
				.productId(orderItemDto.getProductId())
				.orderId(orderItemDto.getOrderId())
				.orderedQuantity(orderItemDto.getOrderedQuantity())
				.build();
	}
	
	
	
}










