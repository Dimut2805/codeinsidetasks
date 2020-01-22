package ru.tasks.one;

import java.io.*;

public class StartFindThread extends Thread {
    private String text;
    private FoundText foundText;

    StartFindThread(String text) {
        this.text = text;
        foundText = new FoundText();
    }

    @Override
    public void run() {
        File[] disks = File.listRoots();
        for (File disk : disks) {
            findInDir(disk, text);
        }
        foundText.printFoundText();
    }

    /**
     * Ищет текст в файлах.txt файловой системе
     *
     * @param dir  текущая директория
     * @param text название файла для поиска
     */
    private void findInDir(File dir, String text) {
        File[] listFiles = dir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    findInDir(file, text);
                } else {
                    if (file.toString().endsWith(".txt") && file.canRead()) {
                        new ReadFileThread(file, text, foundText).start();
                    }
                }
            }
        }
    }
}