package com.kaden_kim.design_pattern.builder.impl.framework;

public class TextBuilder extends Builder {

    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        buffer.append("==============================\n");
        buffer.append('〖').append(title).append('〗').append("\n\n");
    }

    @Override
    public void buildString(String string) {
        buffer.append("◎︎︎ ︎").append(string).append("\n\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (String item : items) buffer.append("  • ").append(item).append('\n');
        buffer.append('\n');
    }

    @Override
    public void buildDone() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }

}
