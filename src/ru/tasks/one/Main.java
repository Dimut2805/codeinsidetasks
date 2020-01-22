package ru.tasks.one;

/**
 * author Utin Dmitry
 */
public class Main {
    public static void main(String[] args) {
        new StartFindThread(createText(args)).start();
        new StartFindThread(createText(args)).start();
        new StartFindThread(createText(args)).start();
        new StartFindThread(createText(args)).start();
        new StartFindThread(createText(args)).start();
        new StartFindThread(createText(args)).start();
    }

    /**
     * Создает из аргументов текст
     *
     * @param args аргументы при запуске приложения
     * @return текст
     */
    private static String createText(String[] args) {
        StringBuilder string = new StringBuilder();
        for (String arg : args) {
            string.append(arg).append(" ");
        }
        return string.toString().strip();
    }
}