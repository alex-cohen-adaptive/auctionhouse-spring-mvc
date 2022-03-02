package com.example.auctionhousespringmvc.exception;

//RunTimeExcpetion
public class BusinessException extends RuntimeException{


    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }
}
