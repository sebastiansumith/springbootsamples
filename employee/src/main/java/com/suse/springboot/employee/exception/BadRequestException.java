package com.suse.springboot.employee.exception;

import com.suse.springboot.employee.model.BadRequest;

public class BadRequestException extends Exception {


    public BadRequestException(final String message){
        super(message);
    }
}
