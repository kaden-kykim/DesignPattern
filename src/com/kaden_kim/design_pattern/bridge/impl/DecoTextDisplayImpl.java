package com.kaden_kim.design_pattern.bridge.impl;

/**
 * Worse design: impl and task are strongly connected
 */
public class DecoTextDisplayImpl extends DisplayImpl {

    private final char head, body, foot;
    private final int step;

    private StringBuilder stringBuilder;

    public DecoTextDisplayImpl(char head, char body, char foot, int step) {
        this.head = head;
        this.body = body;
        this.foot = foot;
        this.step = step;
    }

    @Override
    public void rawOpen() {
        stringBuilder = new StringBuilder();
        stringBuilder.append(head);
    }

    @Override
    public void rawPrint() {
        System.out.print(stringBuilder);
        System.out.println(foot);
        for (int i = 0; i < step; ++i) stringBuilder.append(body);
    }

    @Override
    public void rawClose() {
        stringBuilder = null;
    }

}
