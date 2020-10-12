package com.codersbay;

import java.util.ArrayList;

public class IntQueue {

    public ArrayList<Integer> getIntQueues() {
        return intQueues;
    }

    private ArrayList<Integer> intQueues;

    public IntQueue() {
        intQueues = new ArrayList<>();
    }

    public void enqueue(int newElement) {
        intQueues.add(newElement);
    }

    public int getSize() {
        return intQueues.size();
    }

    public int dequeue() throws QueueTooSmallException {
        if (intQueues.isEmpty()) {
            throw new QueueTooSmallException();
        }
        int element = intQueues.get(0);
        intQueues.remove(intQueues.get(0));
        return element;
    }

    public int[] dequeue(int n) {
        if (!intQueues.isEmpty()) {
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = intQueues.get(i);
                intQueues.remove(intQueues.get(i));
            }
            return nums;
        } else throw new QueueTooSmallException();
    }


}
