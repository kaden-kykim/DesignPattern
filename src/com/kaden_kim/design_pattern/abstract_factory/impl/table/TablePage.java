package com.kaden_kim.design_pattern.abstract_factory.impl.table;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Item;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Page;

public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>").append(title).append("</title></head>\n<body>\n<h1>")
                .append(title).append("</h1>\n<table width=\"80%\" border=\"3\">\n");
        for (Item item : getContent()) builder.append("<tr>").append(item.makeHTML()).append("</tr>");
        builder.append("</table>\n<hr><address>").append(author).append("</address></body></html>\n");
        return builder.toString();
    }

}
