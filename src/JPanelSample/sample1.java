package JPanelSample;

// JPanel is a GUI component that functions as a container to hold other components.


import javax.swing.*;
import java.awt.*;
public class sample1 {
	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		label.setText("HELLO EARTH");
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250, 250);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250, 0, 250, 250);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 250, 500, 250);
		
		JFrame frame = new JFrame();
		frame.setTitle("JPanel Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);
		redpanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
	}

}
