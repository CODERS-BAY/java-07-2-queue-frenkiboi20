package com.codersbay;

public class QueueTooSmallException extends RuntimeException {

    public QueueTooSmallException() {
        System.err.println("Queue is too small !");
    }
}
