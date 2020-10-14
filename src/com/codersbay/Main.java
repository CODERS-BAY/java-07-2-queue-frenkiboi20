package com.codersbay;

public class Main {

    public static void main(String[] args) throws QueueTooSmallException {

        IntQueue intQueue = new IntQueue();

        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);

        System.out.println(intQueue.getSize());

        intQueue.dequeue();
        System.out.println(intQueue.getSize());

        intQueue.dequeue(2);

        System.out.println(intQueue.getSize());
    }

}
