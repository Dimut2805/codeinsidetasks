package ru.tasks.two;

import java.util.ArrayList;

public class Supplier { //Поставщик
    private ArrayList<String> tasks;

    Supplier() {
        tasks = new ArrayList<>();
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}