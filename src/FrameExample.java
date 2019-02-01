import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameExample 
{
	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(250, 200, 500, 300);
		myFrame.setLayout(null);
		JLabel label1 = new JLabel("Our first label");
		label1.setLocation(new Point(100, 200));
		myFrame.add(label1);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
