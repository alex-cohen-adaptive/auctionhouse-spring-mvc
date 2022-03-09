package com.example.auctionhousespringmvc.exception;

public class NotAllowedException extends RuntimeException{
  public NotAllowedException(String message) {
    super(message);
  }
}
