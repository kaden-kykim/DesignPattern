package com.kaden_kim.design_pattern.builder.impl.framework;

public abstract class Builder {

    private boolean initialized = false, done = false;

    public void makeTitle(String title) {
        if (!initialized && !done) { buildTitle(title); initialized = true; }
    }
    public void makeString(String string) {
        if (initialized && !done) buildString(string);
    }
    public void makeItems(String[] items) {
        if (initialized && !done) buildItems(items);
    }
    public void close() {
        if (initialized && !done) { buildDone(); done = true; }
    }

    protected abstract void buildTitle(String title);
    protected abstract void buildString(String string);
    protected abstract void buildItems(String[] items);
    protected abstract void buildDone();

}
