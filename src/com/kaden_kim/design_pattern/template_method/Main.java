package com.kaden_kim.design_pattern.template_method;

import com.kaden_kim.design_pattern.template_method.impl.CharDisplay;
import com.kaden_kim.design_pattern.template_method.impl.StringDisplay;
import com.kaden_kim.design_pattern.template_method.impl.framework.AbstractDisplay;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d1.display();
        d2.display();
    }

}
