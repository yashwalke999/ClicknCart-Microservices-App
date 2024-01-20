package com.yashw.app.helper;

import com.yashw.app.domain.Cart;
import com.yashw.app.dto.CartDto;
import com.yashw.app.dto.UserDto;

public interface CartMappingHelper {
	
	public static CartDto map(final Cart cart) {
		return CartDto.builder()
				.cartId(cart.getCartId())
				.userId(cart.getUserId())
				.userDto(
						UserDto.builder()
							.userId(cart.getUserId())
							.build())
				.build();
	}
	
	public static Cart map(final CartDto cartDto) {
		return Cart.builder()
				.cartId(cartDto.getCartId())
				.userId(cartDto.getUserId())
				.build();
	}
	
	
	
}










