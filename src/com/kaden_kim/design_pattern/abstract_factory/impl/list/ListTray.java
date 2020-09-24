package com.kaden_kim.design_pattern.abstract_factory.impl.list;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Item;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n").append(caption).append("\n<ul>\n");
        for (Item item : getTray()) builder.append(item.makeHTML());
        builder.append("</ul>\n</li>\n");
        return builder.toString();
    }

}
