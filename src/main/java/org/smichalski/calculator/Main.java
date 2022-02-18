package org.smichalski.calculator;

import org.smichalski.calculator.frame.MainFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
