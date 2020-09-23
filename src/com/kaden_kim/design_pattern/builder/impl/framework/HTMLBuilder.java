package com.kaden_kim.design_pattern.builder.impl.framework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

    private String fileName;
    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        fileName = title + ".html";
        try {
            File dir = new File("res");
            if (!dir.exists() && !dir.mkdir()) {
                System.out.println("Unable to make directory for result - " + dir.getAbsolutePath());
                System.exit(0);
            }
            dir = new File("res" + File.separator + "builder");
            if (!dir.exists() && !dir.mkdir()) {
                System.out.println("Unable to make directory for result - " + dir.getAbsolutePath());
                System.exit(0);
            }
            writer = new PrintWriter(new FileWriter(dir.getAbsolutePath() + File.separator + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void buildString(String string) {
        writer.println("<p>" + string + "</p>");
    }

    @Override
    public void buildItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) writer.println("<li>" + item + "</li>");
        writer.println("</ul>");
    }

    @Override
    public void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }

}
