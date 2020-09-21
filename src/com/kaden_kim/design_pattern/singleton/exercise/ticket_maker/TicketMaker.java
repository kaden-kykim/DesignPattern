package com.kaden_kim.design_pattern.singleton.exercise.ticket_maker;

public class TicketMaker {
    private int ticket = 1000;
    private static final TicketMaker instance = new TicketMaker();
    private TicketMaker() { }
    public static TicketMaker getInstance() {
        return instance;
    }
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
