package ru.consumer;

import java.util.Queue;
import java.util.logging.Logger;

public class Consumer { //Потребитель
    private static Logger LOGGER = Logger.getLogger(Consumer.class.getName());

    /**
     * Исполняет задание
     *
     * @param tasks список заданий
     */
    public static void performTask(Queue<String> tasks) {
        if (tasks.size() != 0) {
            LOGGER.info(tasks.element());
            tasks.remove();
        } else {
            LOGGER.info("Пусто");
        }
    }
}
