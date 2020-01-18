package ru.tasks.two;

public class StartTest {

    public static void main(String[] args) {
        Supplier supplier = new Supplier();
        SupplierThread supplierThread = new SupplierThread(supplier);
        ConsumerThread consumerThread = new ConsumerThread(supplier.getTasks());
        supplierThread.start();
        consumerThread.start();
    }
}