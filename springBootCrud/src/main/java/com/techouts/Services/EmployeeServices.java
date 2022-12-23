package com.techouts.Services;

import java.util.List;

import com.techouts.model.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Integer id);
    void deleteViaId(int id);
}