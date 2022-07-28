package spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel 
{
	private final int WIDTH = 1350, HEIGHT = 1300;
	private final int DELAY = 20, IMAGE_SIZE = 35;
	private ImageIcon [] image;
	private Timer timer;
	private int x, y, moveX, moveY;
	//-----------------------------------------------------------------
	// Sets up the panel, including the timer for the animation.
	//-----------------------------------------------------------------
	public ReboundPanel()
	{
		timer = new Timer(DELAY, new ReboundListener());
		image[10]= new ImageIcon("gif.gif");
		x = 300;
		y = 50;
		moveX = 2; 
		moveY = 3;
		setPreferredSize(new Dimension(1800, 1200));
		setBackground(Color.black);
		timer.start();
	}
	//-----------------------------------------------------------------
	// Draws the image in the current location.
	//-----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		image[].paintIcon(this, page, x, y);
		
	}
	//*****************************************************************
	// Represents the action listener for the timer.
	//*****************************************************************
	private class ReboundListener implements ActionListener
	{
		//--------------------------------------------------------------
		// Updates the position of the image and possibly the direction
		// of movement whenever the timer fires an action event.
		//--------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			x += moveX;
			//y += moveY;
			
			
			if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
			{
				moveX = moveX * -1;
				y = y+20;
			}
			//if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
				//moveY = moveY * -1;
			repaint();
		}
	}
}