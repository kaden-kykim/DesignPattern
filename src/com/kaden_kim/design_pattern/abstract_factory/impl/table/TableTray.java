package com.kaden_kim.design_pattern.abstract_factory.impl.table;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Item;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Tray;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td><table width=\"100%\" border=\"1\">\n");
        builder.append("<tr><td bgcolor=\"#cccccc\" align=\"center\" colspan=\"").append(getTray().size())
                .append("\"><b>").append(caption).append("</b></td></tr>\n<tr>\n");
        for (Item item : getTray()) builder.append(item.makeHTML());
        builder.append("</tr></table></td>\n");
        return builder.toString();
    }

}
