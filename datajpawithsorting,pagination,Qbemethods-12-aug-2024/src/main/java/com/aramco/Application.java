package com.aramco;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aramco.entity.Product;
import com.aramco.entity.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductService productService = context.getBean(ProductService.class);
		Product p=new Product();
		p.setProductId(107);
		/*p.setProductName("iphone");
		p.setProductPrice(56000.00);
		p.setProductMfgCompany("Apple");
		productService.save(p);*/
	    productService.getAllProducts(p,101).forEach(System.out::println);
	    /*System.out.println("-----------------------------------------");
	    productService.getAllProductWithMfgCompanyName("Boat").forEach(System.out::println);
	    System.out.println("-----------------------------------------");
	    productService.getProductsMoreThan1000();
	    productService.updateCompanyName("Havells","Jbs");*/
	   // productService.deleteByProductName("iphone");
	}

}