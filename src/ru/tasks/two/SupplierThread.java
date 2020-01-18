package ru.tasks.two;

public class SupplierThread extends Thread {
    private static final String[] TASKS = {"Задание 1", "Задание 2", "Задание 3", "Задние 4", "Задание 5", "Задание 6", "Задание 7"};
    public Supplier supplier;

    SupplierThread(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(((int) (Math.random() * 4) * 1000));
                supplier.addTask(TASKS[(int) (Math.random() * 6)]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}