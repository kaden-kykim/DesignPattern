package com.kaden_kim.design_pattern.singleton.exercise.ticket_maker;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; ++i) System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        System.out.println("End.");
    }

}
