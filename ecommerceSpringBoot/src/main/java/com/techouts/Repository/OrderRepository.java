package com.techouts.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techouts.model.OrderList;
@Repository
public interface OrderRepository extends JpaRepository<OrderList, Integer>{
	@Query("select p from OrderList p where p.username=:username")
	public List<OrderList> findByUserName(@Param("username")String username);
	
}
