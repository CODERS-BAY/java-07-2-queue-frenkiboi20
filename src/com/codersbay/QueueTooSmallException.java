package com.codersbay;

public class QueueTooSmallException extends Throwable {

    public QueueTooSmallException() {
        System.err.println("Queue is too small !");
    }
}
