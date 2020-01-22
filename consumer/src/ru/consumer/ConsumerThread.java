package ru.consumer;

import java.util.PriorityQueue;

public class ConsumerThread extends Thread {
    private PriorityQueue<String> tasks;

    public ConsumerThread(PriorityQueue<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                Consumer.performTask(tasks);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}