package org.smichalski.calculator.component;

import org.smichalski.calculator.Main;
import org.smichalski.calculator.frame.MainFrame;
import org.smichalski.calculator.function.EditValue;
import org.smichalski.calculator.function.Operators;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pad extends JPanel implements ActionListener{
    JButton bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9, bttn0;
    JButton addButton, subButton, mulButton, divButton, equButton, decButton, sqrButton, expButton, modButton;
    JButton clrButton, delButton, oButton;
    JTextField display;
    JTextArea his;
    char operator = ' ';
    double  num1 = 0, num2 = 0, result;
    boolean numAc = false;
    GridBagConstraints constraints;
    JButton [] buttons = new JButton[22];
    EditValue editValue = new EditValue();
    Operators op = new Operators();
    public Pad(){

        this.setLayout(new GridBagLayout());

        his = new JTextArea();
        his.setEditable(false);
        his.setFont(new Font("Serif", Font.BOLD, 15));

        JScrollPane js = new JScrollPane(his);
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.ipady = 60;
        this.add(js, constraints);

        display = new JTextField();
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.ipady = 30;
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        this.add(display, constraints);

        expButton = new JButton("^2");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.ipady = 30;
        this.add(expButton, constraints);

        divButton = new JButton("/");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.ipady = 30;
        this.add(divButton, constraints);

        bttn0 = new JButton("0");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.ipady = 30;
        this.add(bttn0, constraints);

        decButton = new JButton(".");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.ipady = 30;
        this.add(decButton, constraints);

        mulButton = new JButton("*");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx=1;
        constraints.gridx = 3;
        constraints.gridy = 4;
        constraints.ipady = 30;
        this.add(mulButton, constraints);

        bttn1 = new JButton("1");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx=1;
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.ipady = 30;
        this.add(bttn1, constraints);

        bttn2 = new JButton("2");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx=1;
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.ipady = 30;
        this.add(bttn2, constraints);

        bttn3 = new JButton("3");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx=1;
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.ipady = 30;
        this.add(bttn3, constraints);

        subButton = new JButton("-");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx=1;
        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.ipady = 30;
        this.add(subButton, constraints);

        bttn4 = new JButton("4");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.ipady = 30;
        this.add(bttn4, constraints);

        bttn5 = new JButton("5");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.ipady = 30;
        this.add(bttn5, constraints);

        bttn6 = new JButton("6");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.ipady = 30;
        this.add(bttn6, constraints);

        bttn7 = new JButton("7");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.ipady = 30;
        this.add(bttn7, constraints);

        bttn8 = new JButton("8");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.ipady = 30;
        this.add(bttn8, constraints);

        bttn9 = new JButton("9");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.ipady = 30;
        this.add(bttn9, constraints);

        addButton = new JButton("+");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.ipady = 30;
        this.add(addButton, constraints);


        sqrButton = new JButton("√");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.ipady = 30;
        this.add(sqrButton, constraints);

        modButton = new JButton("%");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.ipady = 30;
        this.add(modButton, constraints);

        equButton = new JButton("=");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.ipady = 30;
        this.add(equButton, constraints);

        clrButton = new JButton("Clear");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.ipady = 30;
        this.add(clrButton, constraints);

        delButton = new JButton("Delete");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.ipady = 30;
        this.add(delButton, constraints);

        oButton = new JButton("About");
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 4;
        constraints.ipady = 30;
        this.add(oButton, constraints);

        buttons[0] = bttn0;
        buttons[1] = bttn1;
        buttons[2] = bttn2;
        buttons[3] = bttn3;
        buttons[4] = bttn4;
        buttons[5] = bttn5;
        buttons[6] = bttn6;
        buttons[7] = bttn7;
        buttons[8] = bttn8;
        buttons[9] = bttn9;
        buttons[10] = addButton;
        buttons[11] = subButton;
        buttons[12] = mulButton;
        buttons[13] = divButton;
        buttons[14] = decButton;
        buttons[15] = delButton;
        buttons[16] = clrButton;
        buttons[17] = sqrButton;
        buttons[18] = expButton;
        buttons[19] = oButton;
        buttons[20] = equButton;
        buttons[21] = modButton;

        for (JButton button : buttons) {
            button.addActionListener(this);
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bttn0){
            editValue.GetNumbers("0", display);
        }
        if(e.getSource() == bttn1){
            editValue.GetNumbers("1", display);
        }
        if(e.getSource() == bttn2){
            editValue.GetNumbers("2", display);
        }
        if(e.getSource() == bttn3){
            editValue.GetNumbers("3", display);
        }
        if(e.getSource() == bttn4){
            editValue.GetNumbers("4", display);
        }
        if(e.getSource() == bttn5){
            editValue.GetNumbers("5", display);
        }
        if(e.getSource() == bttn6){
            editValue.GetNumbers("6", display);
        }
        if(e.getSource() == bttn7){
            editValue.GetNumbers("7", display);
        }
        if(e.getSource() == bttn8){
            editValue.GetNumbers("8", display);
        }
        if(e.getSource() == bttn9){
            editValue.GetNumbers("9", display);
        }
        if(e.getSource() == decButton){
            editValue.Decimal(display, ".");
        }
        if(e.getSource() == delButton){
            editValue.Delete(display);
        }
        if(e.getSource() == clrButton){
          editValue.Clear(num1, num2, result, display, his, operator, numAc);
        }
        if(e.getSource() == addButton){
            if(!numAc){
                num1 = editValue.Num(num1, display);
                op.Plus(display, his, num1, operator);
                operator = '+';
                numAc = true;
            }
            else {
                op.Plus(display, his, num1, operator);
                operator = '+';
            }

        }
        if(e.getSource() == subButton){
            if(!numAc){
                num1 = editValue.Num(num1, display);
                op.Sub(display, his, num1, operator);
                operator = '-';
                numAc = true;
            }
            else {
                op.Sub(display, his, num1, operator);
                operator = '-';
            }
        }
        if(e.getSource() == mulButton){
            if(!numAc){
                num1 = editValue.Num(num1, display);
                op.Mul(display, his, num1, operator);
                operator = '*';
                numAc = true;
            }
            else {
                op.Mul(display, his, num1, operator);
                operator = '*';
            }
        }
        if(e.getSource() == divButton){
            if(!numAc){
                num1 = editValue.Num(num1, display);
                op.Div(display, his, num1, operator);
                operator = '/';
                numAc = true;
            }else {
                op.Div(display, his, num1, operator);
                operator = '/';
            }
        }
        if(e.getSource() == modButton){
            if(!numAc){
                num1 = editValue.Num(num1, display);
                op.Mod(display, his, num1, operator);
                operator = '%';
                numAc = true;
            }
            else {
                op.Mod(display, his, num1, operator);
                operator = '%';
            }
        }
        if(e.getSource() == sqrButton){
            if(!numAc){
                operator = 's';
                num1 = op.Sqrt(num1, display);
                his.setText(his.getText().concat(num1 + "  "));
                numAc = true;
                display.setText("");
            }
            else {
                num2 = op.Sqrt(num2, display);
                op.Equ(display, his, num1, num2, result, operator);
                num2 = 0;
                numAc = false;
            }
        }
        if(e.getSource() == expButton){
            if(!numAc){
                operator = 's';
                num1 = op.Exp(num1, display);
                his.setText(his.getText().concat(num1 + "  "));
                numAc = true;
                display.setText("");
            }
            else {
                num2 = op.Exp(num2, display);
                op.Equ(display, his, num1, num2, result, operator);
                num2 = 0;
                numAc = false;
            }
        }
        if(e.getSource() == equButton){
            if(num2 == 0){
                num2 = editValue.Num(num2, display);
            }
            op.Equ(display, his, num1, num2, result, operator);
            num2 = 0;
            numAc = false;
        }
        if(e.getSource() == oButton){

        }
    }
}
