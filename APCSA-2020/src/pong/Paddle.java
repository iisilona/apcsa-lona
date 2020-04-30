import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
  ublic Paddle()
   {
	  this(10, 10);
   }

   public Paddle(int x, int y)
   {
	   super(x, y, 10, 10, Color.PINK);
	   setSpeed(5);
   }
   
   public Paddle (int x, int y, int sp)
   {
	   super(x, y, 10, 10, Color.PINK);
	   setSpeed(sp);
   }
   
   public Paddle (int x, int y, int width, int height, int sp)
   {
	   super (x, y, width, height, Color.BLACK);
	   setSpeed(sp);
   }
   
   public Paddle (int x, int y, int width, int height, Color col, int sp)
   {
	   super (x, y, width, height, col);
	   setSpeed(sp);
   }
   
   public void setSpeed(int sp)
   {
	   speed = sp;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()+speed);
	   draw(window);
   }

   public int getSpeed()
   {
	   return speed;
   }   
   
   public String toString()
   {
	   return super.toString()+" "+speed;
   }
}
