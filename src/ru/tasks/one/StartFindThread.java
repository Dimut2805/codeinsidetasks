package ru.tasks.one;

import java.io.File;

public class StartFindThread extends Thread {
    String text;

    StartFindThread(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        File[] disks = File.listRoots();
        for (File disk : disks) {
            findInDir(disk, text);
        }
    }

    /**
     * Ищет определенный файл в файловой системе
     *
     * @param dir  текущая директория
     * @param text название файла для поиска
     */
    private static void findInDir(File dir, String text) {
        File[] listFiles = dir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory() && file.canRead()) {
                    findInDir(file, text);
                } else {
                    if (file.getName().equals(text)) {
                        System.out.println(file.getPath());
                    }
                }
            }
        }
    }
}