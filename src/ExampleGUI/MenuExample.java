package ExampleGUI;

import javax.swing.*;
public class MenuExample {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setSize(300,300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setTitle("Example of Menu");
		frame1.setResizable(false);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(new JMenuItem("Close"));
		
		JMenu editMenu = new JMenu("Edit");
		editMenu.add(new JMenuItem("Undo"));
		editMenu.add(new JMenuItem("Redo"));
		editMenu.add(new JMenuItem("Cut"));
		
		JMenuBar menubar = new JMenuBar();
		menubar.add(fileMenu);
		menubar.add(editMenu);
		
		frame1.setJMenuBar(menubar);
		frame1.setVisible(true);
	}
}
