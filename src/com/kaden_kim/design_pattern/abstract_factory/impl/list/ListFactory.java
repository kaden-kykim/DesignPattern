package com.kaden_kim.design_pattern.abstract_factory.impl.list;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Factory;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Link;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Page;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

}
