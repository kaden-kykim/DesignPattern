package com.kaden_kim.design_pattern.builder.impl.framework;

import javax.swing.*;

public class FrameBuilder extends Builder {

    private final JFrame frame = new JFrame();
    private final Box box = new Box(BoxLayout.Y_AXIS);

    @Override
    protected void buildTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    protected void buildString(String string) {
        box.add(new JLabel(string));
    }

    @Override
    protected void buildItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for (String item : items) {
            JButton button = new JButton(item);
            button.addActionListener(e -> System.out.println(e.getActionCommand()));
            innerBox.add(button);
        }
        box.add(innerBox);
    }

    @Override
    protected void buildDone() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getResult() {
        return frame;
    }

}
