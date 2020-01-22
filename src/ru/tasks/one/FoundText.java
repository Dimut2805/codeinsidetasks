package ru.tasks.one;

import java.util.ArrayList;
import java.util.List;

public class FoundText { //Найденный текст
    private List<String> containsFoundTextList;

    FoundText() {
        containsFoundTextList = new ArrayList<>();
    }

    /**
     * Добавление найденого текста в лист
     *
     * @param text найденный текст
     */
    public synchronized void addText(String text) {
        containsFoundTextList.add(text);
    }

    /**
     * Выводит найденный текст в консоль
     */
    public void printFoundText() {
        for (String foundText : containsFoundTextList) {
            System.out.println(foundText);
        }
    }
}