package pong;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
	   super(x, y);
   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x, y, wid, ht);
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public Color randomColor()
   {
   		int r = (int)(Math.random()*256);		//use Math.random()
 		int g = (int)(Math.random()*256);
 		int b = (int)(Math.random()*256);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()+getXSpeed());
	   setY(getY()+getYSpeed());
	   draw(window, randomColor());
   }
}
