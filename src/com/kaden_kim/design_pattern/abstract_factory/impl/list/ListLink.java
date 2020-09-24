package com.kaden_kim.design_pattern.abstract_factory.impl.list;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "\t<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
