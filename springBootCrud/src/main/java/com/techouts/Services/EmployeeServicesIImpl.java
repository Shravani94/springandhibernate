package com.techouts.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.Repository.EmployeeRepository;
import com.techouts.model.Employee;

@Service
public class EmployeeServicesIImpl
    implements EmployeeServices {
   
    @Autowired private EmployeeRepository empRepo;
 
    @Override public List<Employee> getAllEmployee()
    {
        return empRepo.findAll();
    }
 
    @Override public void save(Employee employee)
    {
        empRepo.save(employee);
    }
 
    @Override public Employee getById(Integer id)
    {
        Optional<Employee> optional = empRepo.findById(id);
        Employee employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return employee;
    }
 
    @Override public void deleteViaId(int id)
    {
        empRepo.deleteById((int) id);
    }

	
}