package JButtonSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Jbuttonsample extends JFrame implements ActionListener{

		JButton button;
		Jbuttonsample(){
			
			button = new JButton();
			button.setBounds(100,100,100,50);
			button.addActionListener(this);
			//or button.addActionListener(e -> System.out.println("print"));
			//remove implements and override
			
			//set a text inside the button
			button.setText("Click Here");
			//get rid of the box in text.
			button.setFocusable(false);
		
			button.setFont(new Font("Comic Sans",Font.BOLD, 10));
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(300,300);
			this.setResizable(false);
			this.setVisible(true);
			this.add(button);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == button) {
				System.out.println("print");
			}
		}
		
}
