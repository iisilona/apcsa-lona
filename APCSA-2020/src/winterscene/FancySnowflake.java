package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;
import java.util.ArrayList;;


//extend the AbstractShape class to make a FancySnowFlake class

public class FancySnowFlake extends AbstractShape
{
	public int notbottom = 0;
	
	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}
	
	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);

	}
	
	public void draw(Graphics window)
	{
		window.fillOval(getXPos(), getYPos() , 5, 5);
		window.fillOval(getXPos()+5, getYPos() , 5, 5);
		window.fillOval(getXPos()-5, getYPos() , 5, 5);
		window.fillOval(getXPos(), getYPos()+5 , 5, 5);
		window.fillOval(getXPos(), getYPos()-5 , 5, 5);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		draw(window);
		setYPos(getYPos() + 5);
		System.out.println("HERE!");
	}

}
