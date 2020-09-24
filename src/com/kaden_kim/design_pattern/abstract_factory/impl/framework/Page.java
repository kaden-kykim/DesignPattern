package com.kaden_kim.design_pattern.abstract_factory.impl.framework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page implements HTMLabel{

    protected String title;
    protected String author;
    private final List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            File dir = new File("res");
            if (!dir.exists() && !dir.mkdir()) {
                System.out.println("Unable to make directory for result - " + dir.getAbsolutePath());
                System.exit(0);
            }
            dir = new File("res" + File.separator + "abstract_factory");
            if (!dir.exists() && !dir.mkdir()) {
                System.out.println("Unable to make directory for result - " + dir.getAbsolutePath());
                System.exit(0);
            }
            String fileName = dir.getAbsolutePath() + File.separator + title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(title + ".html is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Item> getContent() {
        return content;
    }

}
