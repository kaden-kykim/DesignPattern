package com.kaden_kim.design_pattern.adapter.fileio;

import com.kaden_kim.design_pattern.adapter.fileio.impl.FileProperties;
import com.kaden_kim.design_pattern.adapter.fileio.impl.framework.FileIO;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("res/adapter/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("res/adapter/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
