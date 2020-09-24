package com.kaden_kim.design_pattern.abstract_factory.impl.list;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Item;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>").append(title).append("</title></head>\n<body>\n<h1>")
                .append(title).append("</h1>\n<ul>\n");
        for (Item item : getContent()) builder.append(item.makeHTML());
        builder.append("</ul>\n<hr><address>").append(author).append("</address></body></html>\n");
        return builder.toString();
    }

}
