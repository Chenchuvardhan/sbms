package com.aramco.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.aramco.entity.Product;
@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("from Product")
	public List<Product> getAllProducts();
    @Query("from Product where productMfgCompany=:productName")
    		public List<Product> getAllAppleProducts(String productName);
    @Query(value="select * from Product_details where product_Price>1000",nativeQuery=true)
    public List<Product> getProductsMoreThan1000();
    
    /*@Modifying
    @Query("UPDATE Product p SET p.productMfgCompany = ?1 WHERE p.productMfgCompany = ?2")
    public void updateCompanyName(String newName,String oldName); 
    */
    @Modifying
    @Query("UPDATE Product p SET p.productMfgCompany = :newName WHERE p.productMfgCompany = :oldName")
    public void updateCompanyName(@Param("newName")String newName,@Param("oldName")String oldName); 
    @Modifying
    @Query("delete from Product where productName=:productName")
    public void deleteByProductName(@Param("productName")String productName);
	public List<Product> findByProductId(Integer id);
}
