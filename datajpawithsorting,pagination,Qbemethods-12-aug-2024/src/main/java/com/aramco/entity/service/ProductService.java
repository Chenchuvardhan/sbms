package com.aramco.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.aramco.entity.Product;
import com.aramco.entity.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	//private static int pageSize=3;
	@Autowired
	private ProductRepository prodRepos;
		/*public List<Product> getAllProducts(){
	    return prodRepos.findAll(Sort.by("productName").descending());   
	}
	public void getAllProducts(int pageNum){
	    Pageable pgb= PageRequest.of(pageNum-1, pageSize);
	    Page<Product> all = prodRepos.findAll(pgb);
		all.get().forEach(System.out::println);  
	}
	public void getAllProducts(Product p){
		Example<Product> example = Example.of(p);
	    prodRepos.findAll(example).forEach(System.out::println);
	}*/
	public List<Product> getAllProducts(Product p,Integer id){
	    return prodRepos.findByProductId(id);
		
	}
		public void save(Product p) {
			prodRepos.save(p);
		}
		public List<Product> getAllProductWithMfgCompanyName(String companyName){
					return prodRepos.getAllAppleProducts(companyName);
					
		}
			public List<Product> getProductsMoreThan1000(){
				
				return prodRepos.getProductsMoreThan1000();
			}
			public void updateCompanyName(String newName,String oldName) {
				prodRepos.updateCompanyName(newName, oldName);
			}
			public void deleteByProductName(String productName) {
				prodRepos.deleteByProductName(productName);
			}
}
