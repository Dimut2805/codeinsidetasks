package ru.tasks.one;

import java.io.*;

public class ReadFileThread extends Thread {
    private File file;
    private String text;
    private FoundText foundText;

    ReadFileThread(File file, String text, FoundText foundText) {
        this.file = file;
        this.text = text;
        this.foundText = foundText;
    }

    @Override
    public void run() {
        findTextFile();
    }

    /**
     * Поиск текста в файле
     */
    private void findTextFile() {
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "cp1251"))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(text)) {
                    foundText.addText(file.getPath() + ": " + line);
                }
            }
        } catch (IOException e) {
        }
    }
}