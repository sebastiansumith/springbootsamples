package com.suse.springboot.employee.config;

import com.suse.springboot.employee.mapper.EmployeeMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class Config {

    @Bean()
    public EmployeeMapper employeeMapper(){
        return Mappers.getMapper(EmployeeMapper.class);
    }
}
