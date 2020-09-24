package com.kaden_kim.design_pattern.abstract_factory.impl.framework;

public abstract class Factory {

    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("IllegalAccessException occurred " + e.getMessage());
        } catch (InstantiationException e) {
            System.err.println("InstantiationException occurred " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException occurred " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public Page createYahooPage() {
        Link link = createLink("Yahoo!", "https://www.yahoo.com");
        Page page = createPage("Yahoo!", "Yahoo!");
        page.add(link);
        return page;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

}
