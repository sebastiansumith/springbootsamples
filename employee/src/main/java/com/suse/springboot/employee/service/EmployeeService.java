package com.suse.springboot.employee.service;

import com.suse.springboot.employee.mapper.EmployeeMapper;
import com.suse.springboot.employee.model.Employee;
import com.suse.springboot.employee.repository.EmployeeRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service()
public class EmployeeService {

    @Autowired()
    private EmployeeRepository employeeRepository;

    @Autowired()
    private EmployeeMapper mapper;

    public Iterable<Employee> getEmployees(){
       return mapper.toEmployeeList(employeeRepository.findAll());
    }

}
