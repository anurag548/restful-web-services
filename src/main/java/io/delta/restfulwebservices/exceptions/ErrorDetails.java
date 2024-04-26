package io.delta.restfulwebservices.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;



@Getter
@Setter
public class ErrorDetails {

    ErrorDetails(LocalDateTime timestamp, String errorCode, String errorMessage){
        this.timeStamp = timestamp;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private LocalDateTime timeStamp;

    private String errorCode;

    private String errorMessage;

}
