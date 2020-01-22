package ru.supplier;

import java.util.PriorityQueue;

public class Supplier { //Поставщик
    private PriorityQueue<String> tasks;

    public Supplier() {
        tasks = new PriorityQueue<>();
    }

    public PriorityQueue<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}