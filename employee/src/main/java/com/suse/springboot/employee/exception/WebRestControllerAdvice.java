package com.suse.springboot.employee.exception;

import com.suse.springboot.employee.model.BadRequest;
import com.suse.springboot.employee.model.Notification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice()
public class WebRestControllerAdvice {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> handleNotFoundException(BadRequestException ex) {
        BadRequest request = new BadRequest();
        List<Notification> notifications = new ArrayList();
        Notification notification = new Notification();
        notification.setCode(101);
        notification.setMessage("Invalid Request");
        request.setErrorCode(400);
        notifications.add(notification);
        request.setNotifications(notifications);
        ResponseEntity responseEntity = new ResponseEntity(request, HttpStatus.BAD_REQUEST);
        return responseEntity;
    }


}
