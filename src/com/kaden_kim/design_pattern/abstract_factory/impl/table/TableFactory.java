package com.kaden_kim.design_pattern.abstract_factory.impl.table;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Factory;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Link;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Page;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Tray;

public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }

}
