package com.kaden_kim.design_pattern.composite;

import com.kaden_kim.design_pattern.composite.impl.framework.Directory;
import com.kaden_kim.design_pattern.composite.impl.framework.Entry;
import com.kaden_kim.design_pattern.composite.impl.framework.File;
import com.kaden_kim.design_pattern.composite.impl.framework.FileTreatmentException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");

            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.printList();

            System.out.println();
            System.out.println("Making user entries...");
            Directory aliceDir = new Directory("Alice");
            Directory bowmanDir = new Directory("Bowman");
            Directory carrollDir = new Directory("Carroll");
            usrDir.add(aliceDir);
            usrDir.add(bowmanDir);
            usrDir.add(carrollDir);
            File diary = new File("diary.html", 100);
            aliceDir.add(diary);
            aliceDir.add(new File("Composite.java", 200));
            bowmanDir.add(new File("memo.txt", 300));
            File game = new File("game.doc", 400);
            carrollDir.add(game);
            carrollDir.add(new File("junk.mail", 500));
            rootDir.printList();

            System.out.println();
            System.out.println("Check Full Path...");
            printFullName(diary);
            printFullName(game);
            printFullName(bowmanDir);
            printFullName(rootDir);
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

    private static void printFullName(Entry entry) {
        System.out.println("[" + (entry instanceof File ? "F" : "D") + "] " + entry.getName() + ": " + entry.getFullName());
    }

}
