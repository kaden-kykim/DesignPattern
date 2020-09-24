package com.kaden_kim.design_pattern.abstract_factory;

import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Factory;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Link;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Page;
import com.kaden_kim.design_pattern.abstract_factory.impl.framework.Tray;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main com.kaden_kim.design_pattern.abstract_factory.impl.list.ListFactory");
            System.out.println("Example 2: java Main com.kaden_kim.design_pattern.abstract_factory.impl.table.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link linkAmazon = factory.createLink("Amazon", "https://www.amazon.com");
        Link linkEBay = factory.createLink("eBay", "https://www.eBay.com");

        Link linkUSMSN = factory.createLink("MSN", "https://www.msn.com/en-us");
        Link linkKRMSN = factory.createLink("MSN Korea", "https://www.msn.com/ko-kr");
        Link linkGoogle = factory.createLink("Google", "https://www.google.com");
        Link linkBing = factory.createLink("Yahoo", "https://www.yahoo.com");

        Tray trayShopping = factory.createTray("Shopping");
        trayShopping.add(linkAmazon);
        trayShopping.add(linkEBay);

        Tray trayMSN = factory.createTray("MSN");
        trayMSN.add(linkUSMSN);
        trayMSN.add(linkKRMSN);

        Tray traySearch = factory.createTray("Search");
        traySearch.add(trayMSN);
        traySearch.add(linkGoogle);
        traySearch.add(linkBing);

        Page page = factory.createPage("TablePage", "kaden-kim.com");
        page.add(trayShopping);
        page.add(traySearch);
        page.output();

        page = factory.createYahooPage();
        page.output();
    }

}
