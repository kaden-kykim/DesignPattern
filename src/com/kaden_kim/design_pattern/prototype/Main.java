package com.kaden_kim.design_pattern.prototype;

import com.kaden_kim.design_pattern.prototype.impl.MessageBox;
import com.kaden_kim.design_pattern.prototype.impl.UnderlinePen;
import com.kaden_kim.design_pattern.prototype.impl.framework.Manager;
import com.kaden_kim.design_pattern.prototype.impl.framework.Product;

public class Main {

    public static void main(String[] args) {
        // Preparing
        Manager manager = new Manager();
        UnderlinePen uPen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message", uPen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // Creating
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }

}
