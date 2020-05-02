package pong;
import java.awt.Color;
import java.awt.Graphics;

public class PaddleExtension extends Paddle {
	public PaddleExtension()
	{
		super();
	}

   public PaddleExtension(int x, int y)
   {
	   super(x, y);
   }
   
   public PaddleExtension (int x, int y, int speed)
   {
	   super(x, y, speed);
   }
   
   public PaddleExtension (int x, int y, int width, int height, int speed)
   {
	   super (x, y, width, height, speed);
   }
   
   public PaddleExtension (int x, int y, int width, int height, Color col, int speed)
   {
	   super (x, y, width, height, col, speed);
   }
   
   public void moveLeftAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()-getSpeed());
	   draw(window);
   }
   
   public void moveRightAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()+ getSpeed());
	   draw(window);
   }
}
