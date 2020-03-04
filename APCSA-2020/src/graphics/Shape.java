//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpd = xSpeed;
		ySpd = ySpeed;
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
	   window.setColor(Color.pink);
	   window.drawRect(100, 200, 200, 100);
      window.fillRect(xPos, yPos, width, height);
      window.drawLine(100, 200, 100, 300);
      window.drawLine(200, 100, 200, 200);
      window.setColor(Color.CYAN);
      window.drawOval(100, 200, 400, 300);
   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public void moveAndDraw(Graphics window)
   {
    	//not needed yet
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return 0;
   }

   public void setX( int x )
   {
   	//add code here
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}