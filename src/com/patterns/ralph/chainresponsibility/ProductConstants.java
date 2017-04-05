package com.patterns.ralph.chainresponsibility;

import java.math.BigDecimal;

public enum ProductConstants {

	TUNA(1L, "Tuna", BigDecimal.valueOf(30)),
	MAIS(2L, "Mais",BigDecimal.valueOf(10)),
	MAGI(3L, "Magi Savor",BigDecimal.valueOf(52.12)),
	RELO(4L,"Relo",BigDecimal.valueOf(20000)),
	VAPE(5L,"Vape",BigDecimal.valueOf(4300)),
	WALLET(6L,"Wallet",BigDecimal.valueOf(2100));
	
	private Long id;
	private String description;
	private BigDecimal price;
	
	private ProductConstants(Long id, String description, BigDecimal price){
		this.setId(id);
		this.setDescription(description);
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public static ProductConstants getProductById(Long id){
		for(ProductConstants productConst : ProductConstants.values()){
			if(productConst.getId().equals(id)){
				return productConst;
			}
		}
		return null;
	}

	
}
