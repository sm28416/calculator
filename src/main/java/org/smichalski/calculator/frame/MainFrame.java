package org.smichalski.calculator.frame;

import org.smichalski.calculator.component.Pad;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    JPanel content;
    public MainFrame(){
        super("Calculator");
        content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setPreferredSize(new Dimension(400,525));
        Pad c1 = new Pad();

        content.add(c1);
        this.setContentPane(content);
        pack();
    }
}
