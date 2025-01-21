package com.interview.java8.prodcut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
	
	public static void main(String[] args) {

		ProductBo hp = new ProductBo(1, "hp", 1000);
		ProductBo dell = new ProductBo(2, "dell", 2000);
		ProductBo lenova = new ProductBo(3, "lenova", 3000);
		
		List<ProductBo> listPrdBo = new ArrayList<>();
		
		List<ProductBo> listPrdBo1 = new ArrayList<>
		(Arrays.asList(new ProductBo(1, "hp", 1000),
				new ProductBo(3, "lenova", 3000),
				new ProductBo(2, "dell", 11000)
				 
		)) ;
		
		Double dellprice = listPrdBo1.stream()
		.filter(pr -> pr.getName().equalsIgnoreCase("dell"))
		.mapToDouble(ProductBo::getPrice)
		.findFirst()
		.orElse(0);
		System.out.println("dell price : "+dellprice);
//	
		
		String dellp = listPrdBo1.stream()
		.filter(pr -> pr.getName().equalsIgnoreCase("dell"))
		.map(pr -> String.valueOf(pr.getPrice()))
		.collect(Collectors.joining());
		
		System.out.println("dell : "+dellp);
		
		
	}

}
