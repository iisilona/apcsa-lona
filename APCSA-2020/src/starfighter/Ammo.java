//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		speed = 1;
	}

	public Ammo(int x, int y, int s)
	{
		xPos = x;
		yPos = y;
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		if (direction.equals("UP"))
		   {
			   setY(getY()-getSpeed());
		   }
		   else if (direction.equals("DOWN"))
		   {
			   setY(getY()+getSpeed());
		   }
		   else if (direction.equals("LEFT"))
		   {
			   setX(getX()-getSpeed());
		   }
		   else if (direction.equals("RIGHT")) 
		   {
			   setX(getX()+getSpeed());
		   }
	}

	public String toString()
	{
		return "";
	}
}
