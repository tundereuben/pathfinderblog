package com.pathfinderbookclub.com.pathfinderblog.exception;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message){
        super(message);
    }
}
