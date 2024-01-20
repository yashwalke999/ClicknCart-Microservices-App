package com.yashw.app.helper;

import com.yashw.app.domain.Category;
import com.yashw.app.domain.Product;
import com.yashw.app.dto.CategoryDto;
import com.yashw.app.dto.ProductDto;

public interface ProductMappingHelper {
	
	public static ProductDto map(final Product product) {
		return ProductDto.builder()
				.productId(product.getProductId())
				.productTitle(product.getProductTitle())
				.imageUrl(product.getImageUrl())
				.sku(product.getSku())
				.priceUnit(product.getPriceUnit())
				.quantity(product.getQuantity())
				.categoryDto(
						CategoryDto.builder()
							.categoryId(product.getCategory().getCategoryId())
							.categoryTitle(product.getCategory().getCategoryTitle())
							.imageUrl(product.getCategory().getImageUrl())
							.build())
				.build();
	}
	
	public static Product map(final ProductDto productDto) {
		return Product.builder()
				.productId(productDto.getProductId())
				.productTitle(productDto.getProductTitle())
				.imageUrl(productDto.getImageUrl())
				.sku(productDto.getSku())
				.priceUnit(productDto.getPriceUnit())
				.quantity(productDto.getQuantity())
				.category(
						Category.builder()
							.categoryId(productDto.getCategoryDto().getCategoryId())
							.categoryTitle(productDto.getCategoryDto().getCategoryTitle())
							.imageUrl(productDto.getCategoryDto().getImageUrl())
							.build())
				.build();
	}
	
	
	
}










