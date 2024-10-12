package SimpleJFrame;

//JFrame is a GUI window to add components to

import java.awt.Color; // used for color. Line 22
import javax.swing.ImageIcon; // used for image icon. Line 19
import javax.swing.JFrame;
public class Main {
	public static void main(String[] args) {
		
		// JFrame is a GUI window to add components to
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("Starbucks Coffee"); // it will set a title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
		frame.setResizable(false); // this will prevent frame from being resize
		frame.setSize(300,300); //set the x and y dimension of frame
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("logo.jpg"); //create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon of frames
		// I set the color of starbucks based on RGB (0,98,65) or hex (0x006241)
		frame.getContentPane().setBackground(new Color(0x006241)); //change color of background
	}
}
