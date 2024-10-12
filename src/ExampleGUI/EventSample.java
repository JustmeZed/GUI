package ExampleGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSample {

 public static void main(String[] args) {
// Create a new JFrame (window)
	JFrame frame = new JFrame("Event  Example");
	frame.setSize(300, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null); // Use null layout for absolute positioning

 // Create a new JButton
	JButton button = new JButton("Click Me");
	button.setBounds(100, 80, 100, 30); //Set button position and size

 // Add an ActionListener to the button
	button.addActionListener(new ActionListener() {
	@Override
		public void actionPerformed(ActionEvent event) {
		// This method is called when the button is clicked
		// The event parameter is an instance of ActionEvent
		System.out.println("Button was clicked!");
		// You can retrieve additional information from the event object
		//System.out.println("Event source: " + event.getSource());
		}
	});

 // Add the button to the frame
 frame.add(button);
 button.setFocusable(false);
// Make the frame visible
frame.setVisible(true);
 }
}