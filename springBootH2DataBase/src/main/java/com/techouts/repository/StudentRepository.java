package com.techouts.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techouts.model.Students; 
@Repository
public interface StudentRepository extends CrudRepository<Students, Integer>  
{  
}  