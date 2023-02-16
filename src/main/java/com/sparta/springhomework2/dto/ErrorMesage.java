package com.sparta.springhomework2.dto;

import lombok.Data;

@Data
public class ErrorMesage {
    private String statusCode;
    private String msg;

    public ErrorMesage(String error, String msg) {
        this.statusCode = error;
        this.msg = msg;
    }
}
