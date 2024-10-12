package JLabel;

import javax.swing.BorderFactory;

//JLabel is a GUI display area for a string of text, an image, or both

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel; // need to import for JLabel
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
public class Jlabel {
	public static void main(String[] args) {
		//create an object
		ImageIcon image = new ImageIcon("ig.png"); //creating an image
		Border border = BorderFactory.createLineBorder(Color.white,3);
		
		// creating a label
		JLabel label = new JLabel(); 
		//set text of label
		label.setText("Instagram!"); 
		// set the image
		label.setIcon(image); 
		// set text Position of ImageIcon
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP); 
		// set textColor
		label.setForeground(Color.black); 
		//set Font of text
		label.setFont(new Font("MV Boli",Font.PLAIN,80)); 
		// set the gap of text close to the image
		label.setIconTextGap(-10);
		
		/*
		//set the bg color
		label.setBackground(Color.white); 
		// display bg color
		label.setOpaque(true);
		*/
		
		// display border
		label.setBorder(border); 
		// set the Alignment of text and icon based on the label
		label.setVerticalAlignment(JLabel.CENTER); 
		label.setHorizontalAlignment(JLabel.CENTER); 
		
		
		
		//Create a frame.
		JFrame frame = new JFrame();
		frame.setTitle("JLabel Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(0x833AB4));
		//adding the label in frame so it will pop up.
		frame.add(label); 
		//frame.pack(); adjust the size depending on the label.
		
	}
}
