package com.suse.springboot.employee.model;

import lombok.Data;

import java.util.List;

@Data()
public class BadRequest {

    private Integer errorCode;

    private List<Notification> notifications;
}
