package com.kaden_kim.design_pattern.bridge.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {

    private final int READ_SIZE_LIMIT = 2 << 12;
    private final String DECO_LINE = "=-=-=-=-=-=";

    private final String filePath;

    private BufferedReader reader;

    public FileDisplayImpl(String filePath) {
        this.filePath = new File(filePath).getAbsolutePath();
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filePath));
            reader.mark(READ_SIZE_LIMIT);
        } catch (IOException e) { e.printStackTrace(); }
        System.out.println(DECO_LINE + " "
                + filePath.substring(filePath.lastIndexOf(File.separatorChar) + 1) + " " + DECO_LINE);
    }

    @Override
    public void rawPrint() {
        try {
            reader.reset();
            String line;
            while ((line = reader.readLine()) != null) System.out.println("> " + line);
        } catch (IOException e) { e.printStackTrace(); }
    }

    @Override
    public void rawClose() {
        System.out.println(DECO_LINE + DECO_LINE.substring(1, DECO_LINE.length() - 1) + DECO_LINE);
        try { if (reader != null) reader.close(); }
        catch (IOException e) { e.printStackTrace(); }
    }

}
