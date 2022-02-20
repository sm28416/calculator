package org.smichalski.calculator.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    JPanel panel;
    JButton button;
    JTextArea label;
    public About(){
        super("About");
        button = new JButton("Close");
        button.addActionListener(this);
        panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(400, 525));
        GridBagConstraints constraints = new GridBagConstraints();
        label = new JTextArea();
        label.setFont(new Font("Serif", Font.BOLD, 15));
        label.setEditable(false);
        label.setText("This calculator was created by Sebastian Michalski.\n" +
                "\n This calculator is able to realize simple equations.\n" +
                "Such as +|-|*|/|^2|√|%|");
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.anchor = GridBagConstraints.SOUTH;
        panel.add(label, constraints);

        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.anchor = GridBagConstraints.SOUTH;
        panel.add(button, constraints);



        this.setContentPane(panel);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            this.dispose();
        }
    }
}
