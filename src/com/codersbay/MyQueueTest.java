package com.codersbay;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyQueueTest {

    @Test
    public void testPushAndSizing() {

        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(1);
        assertEquals(myQueue.getSize(), 1);

        myQueue.enqueue(23);
        assertEquals(myQueue.getSize(), 2);

    }

    @Test
    public void testPop() throws QueueTooSmallException {

        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);

        int queue = myQueue.dequeue();
        assertEquals(queue, 10);

    }

    @Test
    public void testQueueWithSpecificIndex() {

        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);

        int queue = myQueue.getIntQueues().get(1);
        assertEquals(queue, 20);

    }

    @Test
    public void testQueueTooSmallException() {

        IntQueue myQueue = new IntQueue();

        assertThrows(QueueTooSmallException.class, myQueue::dequeue);
        assertThrows(QueueTooSmallException.class, () -> {
            myQueue.dequeue(1);
        });
    }

}

