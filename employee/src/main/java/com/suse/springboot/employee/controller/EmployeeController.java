package com.suse.springboot.employee.controller;

import com.suse.springboot.employee.exception.BadRequestException;
import com.suse.springboot.employee.model.Employee;
import com.suse.springboot.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController()
@Slf4j()
public class EmployeeController {


    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired()
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> employees() {
        LOGGER.info("Received the request for get employees");
        return (List<Employee>) employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public List<Employee> employeeById(@PathVariable(value = "id") String id) throws BadRequestException {
        LOGGER.info("Received the request for get of employee id", id);
        throw new BadRequestException("Test Exception");
    }
}
