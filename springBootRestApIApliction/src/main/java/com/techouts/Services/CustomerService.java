package com.techouts.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.model.Customer;
import com.techouts.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> findAll(){
		List<Customer>customer=new ArrayList<Customer>();
		customerRepository.findAll().forEach(customers->customer.add(customers));
		return customer;
		}

//getting a specific record  
	public Customer getStudentById(int id) {
		return (Customer) customerRepository.findById(id).get();
	}

	public void saveOrUpdate(Customer customer) {
		customerRepository.save(customer);
	}

//deleting a specific record  
	public void delete(int id) {
		customerRepository.deleteById(id);
	}
}
	
	


