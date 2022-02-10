package org.smichalski.calculator.function;

import javax.swing.*;

public class Operators {
    public void Plus(JTextField dis,JTextArea his, double num1, char op){
        dis.setText("");
        if(op == ' ') {
            op = '+';
            his.setText(his.getText().concat(num1 + "  " + op));
        }
        else {
            op = '+';
            String size = his.getText();
            for(int i=0;i<size.length()-1; i++) {
                String sizenew = size.substring(0,size.length()-1);
                his.setText(sizenew);
            }
            his.setText(his.getText().concat(String.valueOf(op)));
        }
    }
    public void Sub(JTextField dis,JTextArea his, double  num1, char op){
        dis.setText("");
        if(op == ' ') {
            op = '-';
            his.setText(his.getText().concat(num1 + "  " + op));
        }
        else {
            op = '-';
            String size = his.getText();
            for(int i=0;i<size.length()-1; i++) {
                String sizenew = size.substring(0,size.length()-1);
                his.setText(sizenew);
            }
            his.setText(his.getText().concat(String.valueOf(op)));
        }
    }
    public void Mul(JTextField dis,JTextArea his, double num1, char op){
        dis.setText("");
        if(op == ' ') {
            op = '*';
            his.setText(his.getText().concat(num1 + "  " + op));
        }
        else {
            op = '*';
            String size = his.getText();
            for(int i=0;i<size.length()-1; i++) {
                String sizenew = size.substring(0,size.length()-1);
                his.setText(sizenew);
            }
            his.setText(his.getText().concat(String.valueOf(op)));
        }
    }
    public void Div(JTextField dis,JTextArea his, double num1, char op){
        dis.setText("");
        if(op == ' ') {
            op = '/';
            his.setText(his.getText().concat(num1 + "  " + op));
        }
        else {
            op = '/';
            String size = his.getText();
            for(int i=0;i<size.length()-1; i++) {
                String sizenew = size.substring(0,size.length()-1);
                his.setText(sizenew);
            }
            his.setText(his.getText().concat(String.valueOf(op)));
        }
    }
    public void Mod(JTextField dis,JTextArea his, double num1, char op){
        dis.setText("");
        if(op == ' ') {
            op = '%';
            his.setText(his.getText().concat(num1 + "  " + op));
        }
        else {
            op = '%';
            String size = his.getText();
            for(int i=0;i<size.length()-1; i++) {
                String sizenew = size.substring(0,size.length()-1);
                his.setText(sizenew);
            }
            his.setText(his.getText().concat(String.valueOf(op)));
        }
    }
    public void Equ(JTextField dis, JTextArea his, double num1, double num2, double res, char op){
        switch (op){
            case '+':
                res = num1 + num2;
                his.setText(his.getText().concat(" " + num2 + " = " + res + " \n"));
                dis.setText(String.valueOf(res));
                break;
            case '-':
                res = num1 - num2;
                his.setText(his.getText().concat(" " + num2 + " = " + res + " \n"));
                dis.setText(String.valueOf(res));
                break;
            case '*':
                res = num1 * num2;
                his.setText(his.getText().concat(" " + num2 + " = " + res + " \n"));
                dis.setText(String.valueOf(res));
                break;
            case '/':
                if(num1 != 0 && num2 != 0){
                    res = num1 / num2;
                    his.setText(his.getText().concat(" " + num2 + " = " + res + " \n"));
                    dis.setText(String.valueOf(res));
                }
                else{
                    his.setText("Can't divide by 0");
                }
                break;
            case '%':
                res = num1 % num2;
                his.setText(his.getText().concat(" " + num2 + " = " + res + " \n"));
                dis.setText(String.valueOf(res));
                break;
        }
        num1 = res;
        his.append(num1 + "  ");
    }
}
