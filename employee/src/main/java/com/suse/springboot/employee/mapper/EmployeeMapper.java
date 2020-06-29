package com.suse.springboot.employee.mapper;

import com.suse.springboot.employee.entity.EmployeeEntity;
import com.suse.springboot.employee.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper()
public interface EmployeeMapper {

    Iterable<Employee> toEmployeeList(Iterable<EmployeeEntity> entity);

    Employee toEmployee(EmployeeEntity employeeEntity);
}
