package ru.tasks.two;

import java.util.ArrayList;

public class ConsumerThread extends Thread {
    private ArrayList<String> tasks;

    ConsumerThread(ArrayList<String> tasks) {
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