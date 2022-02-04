import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorPanel implements ActionListener{
		

	double num1 = 0, num2 = 0, res = 0;
	char op;
	
	//Numbers
	JButton bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9, bttn0;
		
	//Operator	
	JButton addButton, subButton, mulButton, divButton, equButton, decButton, delButton, clrButton;	
	
	JTextField display;
	
	JPanel panel, panel2, panel3;
	public CalculatorPanel() {
	
		bttn1 = new JButton(String.valueOf(1));
		bttn1.addActionListener(this);
		
		bttn2 = new JButton(String.valueOf(2));
		bttn2.addActionListener(this);
		
		bttn3 = new JButton(String.valueOf(3));
		bttn3.addActionListener(this);
		
		bttn4 = new JButton(String.valueOf(4));
		bttn4.addActionListener(this);
		
		bttn5 = new JButton(String.valueOf(5));
		bttn5.addActionListener(this);
		
		bttn6 = new JButton(String.valueOf(6));
		bttn6.addActionListener(this);
		
		bttn7 = new JButton(String.valueOf(7));
		bttn7.addActionListener(this);
		
		bttn8 = new JButton(String.valueOf(8));
		bttn8.addActionListener(this);
		
		bttn9 = new JButton(String.valueOf(9));
		bttn9.addActionListener(this);
		
		bttn0 = new JButton(String.valueOf(0));
		bttn0.addActionListener(this);
		
		addButton = new JButton("+");
		addButton.addActionListener(this);
		
		subButton = new JButton("-");
		subButton.addActionListener(this);
		
		mulButton = new JButton("*");
		mulButton.addActionListener(this);
		
		divButton = new JButton("/");
		divButton.addActionListener(this);
		
		equButton = new JButton("=");
		equButton.addActionListener(this);
		
		decButton = new JButton(".");
		decButton.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		panel.add(bttn7); 
		panel.add(bttn8); 
		panel.add(bttn9); 
		panel.add(addButton);
		panel.add(bttn4); 
		panel.add(bttn5); 
		panel.add(bttn6); 
		panel.add(subButton);
		panel.add(bttn1); 
		panel.add(bttn2); 
		panel.add(bttn3); 
		panel.add(mulButton);
		panel.add(decButton); 
		panel.add(bttn0); 
		panel.add(divButton); 
		panel.add(equButton);

		Font font = new Font("SansSerif", Font.BOLD, 20);
		display = new JTextField();
		display.setBackground(Color.white);
		display.setSize(300, 50);
		display.setEditable(false);
		display.setFont(font);
		display.setHorizontalAlignment(JTextField.RIGHT);
		
		panel2 = new JPanel();
		panel2.setBounds(50, 25, 300, 50);
		panel2.setLayout(new GridLayout(1, 1));
		panel2.add(display);
		
		delButton = new JButton("Delete");
		delButton.addActionListener(this);
		
		clrButton = new JButton("Clear");
		clrButton.addActionListener(this);	
		
		panel3 = new JPanel();
		panel3.setBounds(50, 430, 300, 50);
		panel3.setLayout(new GridLayout(1,1));
		
		panel3.add(clrButton);		
		panel3.add(delButton);

			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bttn0) {
			display.setText(display.getText().concat(String.valueOf(0)));
		}
		if(e.getSource() == bttn1) {
			display.setText(display.getText().concat(String.valueOf(1)));
		}
		if(e.getSource() == bttn2) {
			display.setText(display.getText().concat(String.valueOf(2)));
		}
		if(e.getSource() == bttn3) {
			display.setText(display.getText().concat(String.valueOf(3)));
		}
		if(e.getSource() == bttn4) {
			display.setText(display.getText().concat(String.valueOf(4)));
		}
		if(e.getSource() == bttn5) {
			display.setText(display.getText().concat(String.valueOf(5)));
		}
		if(e.getSource() == bttn6) {
			display.setText(display.getText().concat(String.valueOf(6)));
		}
		if(e.getSource() == bttn7) {
			display.setText(display.getText().concat(String.valueOf(7)));
		}
		if(e.getSource() == bttn8) {
			display.setText(display.getText().concat(String.valueOf(8)));
		}
		if(e.getSource() == bttn9) {
			display.setText(display.getText().concat(String.valueOf(9)));
		}
		if(e.getSource() == decButton) {
			display.setText(display.getText().concat("."));
		}
		
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(display.getText());
			op = '+';
			display.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(display.getText());
			op = '-';
			display.setText("");
		}
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(display.getText());
			op = '*';
			display.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(display.getText());
			op = '/';
			display.setText("");
		}
		
		if(e.getSource() == equButton) {
			num2 = Double.parseDouble(display.getText());
			switch (op) {
			case '+': 
				res = num1 + num2;
				break;
			case '-': 
				res = num1 - num2;
				break;
			case '*': 
				res = num1 * num2;
				break;
			case '/': 
				res = num1 / num2;
				break;
			}
			display.setText(String.valueOf(res));
			num1 = res;
		}
		if(e.getSource() == clrButton) {
			display.setText(null);
			num1 = 0;
			num1 = 0;
			res = 0;
		}
		if(e.getSource() == delButton) {
			String size = display.getText();
			display.setText("");
			for(int i=0;i<size.length()-1; i++) {
				String sizenew = size.substring(0,size.length()-1);
				display.setText(sizenew);
			}
		}
		
	}
}
