package com.kaden_kim.design_pattern.composite.impl.framework;

public abstract class Entry {

    protected Entry parent;

    public abstract String getName();
    public abstract int getSize();
    protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        Entry entry = this;
        do {
            fullName.insert(0, entry.getName()).insert(0, '/');
            entry = entry.parent;
        } while (entry != null);
        return fullName.toString();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

}
