package com.techouts.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techouts.model.CartList;
@Repository
public interface CartRepository extends JpaRepository<CartList, Integer>{
	@Query("select p from CartList p where p.username=:username")
	public List<CartList> findByUserName(@Param("username") String orders);
	}
