package com.suse.springboot.employee.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data()
@Entity()
@Table(name="employee")
public class EmployeeEntity {
    @Column(name = "employeename")
    private String employeeName;
    @Column(name = "employeeid")
    @Id()
    private String employeeId;
    @Column(name = "employeeaddress")
    private String employeeAddress;
    @Column(name = "employeeemail")
    private String employeeEmail;
}