package com.kaden_kim.design_pattern.abstract_factory.impl.table;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }

}
