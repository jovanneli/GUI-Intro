import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameExample 
{
	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(400, 400, 600, 300);
		myFrame.setLayout(null);
		JLabel label1 = new JLabel("Click the button");
		label1.setBounds(40, 30, 100, 30);
		myFrame.add(label1);
		JButton button1 = new JButton("click");
		button1.setLocation(new Point(180, 30));
		button1.setSize(new Dimension(100, 30));
		myFrame.add(button1);
		button1.addActionListener(new ActionListener() //creating an anonymous class
				{
					public void actionPerformed(ActionEvent e)
					{
						label1.setText("Congrats");
					}
				});
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
