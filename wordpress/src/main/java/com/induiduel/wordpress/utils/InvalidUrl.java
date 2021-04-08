package com.induiduel.wordpress.utils;

public class InvalidUrl extends Exception {

    String message;

    public InvalidUrl() {
        super();
    }

    public InvalidUrl(String message) {
        super(message);
        this.message = message;
    }

}
