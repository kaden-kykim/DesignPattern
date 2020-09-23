package com.kaden_kim.design_pattern.builder;

import com.kaden_kim.design_pattern.builder.impl.Director;
import com.kaden_kim.design_pattern.builder.impl.framework.FrameBuilder;
import com.kaden_kim.design_pattern.builder.impl.framework.HTMLBuilder;
import com.kaden_kim.design_pattern.builder.impl.framework.TextBuilder;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) usage();
        if ("plain".equals(args[0])) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        } else if ("html".equals(args[0])) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            System.out.println(htmlBuilder.getResult() + " is created.");
        } else if ("gui".equals(args[0])) {
            FrameBuilder frameBuilder = new FrameBuilder();
            Director director = new Director(frameBuilder);
            director.construct();
            frameBuilder.getResult().setVisible(true);
        } else usage();
    }

    public static void usage() {
        System.out.println("Usage: java Main plain: Create a document by plain text");
        System.out.println("Usage: java Main html: Create a HTML file");
        System.out.println("Usage: java Main gui: Create a JFrame window");
        System.exit(0);
    }

}
