package com.techouts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.Services.CustomerService;
import com.techouts.model.Customer;

@RestController

public class CustomerController {
	@Autowired
	CustomerService customerService;
	public String welcome() {
		return "index";
	}
	@GetMapping("/show")
	public List<Customer> showAllCustomers(){
		return customerService.findAll();
		
	}
	@PostMapping("/insert")
	public void insert(@RequestBody Customer customer) {
		customerService.saveOrUpdate(customer);
	}
	@PutMapping("/getCustomerById/id")
	public void updateCustomer(@RequestBody @PathVariable("id") int id) {
		customerService.getStudentById(id);
		
	}
	@DeleteMapping("/deleteCutomer/id")
	public void deleteCustomer(@PathVariable("id") int id) {
		customerService.delete(id);
	}

}
