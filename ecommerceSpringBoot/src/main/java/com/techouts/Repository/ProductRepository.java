package com.techouts.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techouts.model.OrderList;
import com.techouts.model.ProductList;
@Repository
public interface ProductRepository extends JpaRepository<ProductList, Integer>{
	/* @Query("Select p from ProductList p") */
//	public List<ProductList> findAll();

	@Query("select p from ProductList p where p.tablename=:tablename")
	public List<ProductList> findBytableName(@Param("tablename") String tables);
	
	@Query("select p from ProductList p where p.productId=:productId")
	ProductList findByProductId(@Param("productId") int productId);
	
	@Query("select p from ProductList p where p.productId=:productId")
	List<ProductList> findByProductIds(@Param("productId") int productId);
	
	@Query("select p from ProductList p where p.productId=:productId")
	List<OrderList> findProductIds(@Param("productId") int productId);
	
	
	
	
	
}

