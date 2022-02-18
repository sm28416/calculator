package org.smichalski.calculator.function;

import javax.swing.*;

public class EditValue {
    public void GetNumbers(String txt, JTextField display){
        display.setText(display.getText().concat(String.valueOf(txt)));
    }
    public void Delete(JTextField display){
        String size = display.getText();
        display.setText("");
        for(int i=0;i<size.length()-1; i++) {
            String sizenew = size.substring(0,size.length()-1);
            display.setText(sizenew);
        }
    }
    public void Clear(double num1, double num2, double res, JTextField display, JTextArea history, char op, boolean num){
        display.setText("");
        history.setText("");
        num1 = 0;
        num2 = 0;
        res = 0;
        op = ' ';
        num = false;
    }
    public void Decimal(JTextField display, String txt){
        String size = display.getText();
        int count = size.indexOf('.');

        //if index does not exist add "."
        if(count == -1){
            display.setText(display.getText().concat(String.valueOf(txt)));
        }
    }
    public double Num(double num, JTextField dis){
        return num = Double.parseDouble(dis.getText());
    }

}
