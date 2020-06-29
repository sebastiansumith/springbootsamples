package com.suse.springboot.employee.repository;

import com.suse.springboot.employee.entity.EmployeeEntity;
import com.suse.springboot.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String> {

}
