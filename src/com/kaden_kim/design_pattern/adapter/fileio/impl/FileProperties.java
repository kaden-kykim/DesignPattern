package com.kaden_kim.design_pattern.adapter.fileio.impl;

import com.kaden_kim.design_pattern.adapter.fileio.impl.framework.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));

//        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
//        String line;
//        while ((line = reader.readLine()) != null)
//            System.out.println(line);
//        reader.close();
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName), "written by " + getClass().getSimpleName());

//        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName)));
//        writer.write("#written by " + getClass().getSimpleName());
//        writer.newLine();
//        writer.write("#" + Calendar.getInstance().getTime().toString());
//        writer.newLine();
//
//        Set<Object> keys = keySet();
//        for (Object k : keys) {
//            String key = (String) k;
//            writer.write(key + "=" + getProperty(key));
//            writer.newLine();
//        }
//
//        writer.close();
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
