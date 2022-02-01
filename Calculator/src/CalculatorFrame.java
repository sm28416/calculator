import javax.swing.JFrame;

public class CalculatorFrame{
	
	JFrame frame;
	
	CalculatorPanel panel = new CalculatorPanel();
	
	public CalculatorFrame() {
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		frame.setSize(420, 550);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.add(panel.panel);
		frame.add(panel.panel2);
		frame.add(panel.panel3);
		frame.setVisible(true);	
	}

}
