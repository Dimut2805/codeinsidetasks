package ru.tasks.two;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Consumer { //Потребитель
    private static Logger LOGGER = Logger.getLogger(Consumer.class.getName());

    /**
     * Исполняет задание
     *
     * @param tasks список заданий
     */
    public static void performTask(ArrayList<String> tasks) {
        if (tasks.size() != 0) {
            LOGGER.info(tasks.get(0));
            tasks.remove(0);
        } else {
            LOGGER.info("Пусто");
        }
    }
}
