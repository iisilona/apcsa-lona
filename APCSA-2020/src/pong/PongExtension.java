package pong;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class PongExtension extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private PaddleExtension paddle;
	private boolean[] keys;
	private BufferedImage back;
	private Block erase;
	private Wall wall;
	private List<Block> sideBlocks;

	public PongExtension()
	{
		ball=new Ball(200, 200, 10, 10, Color.RED, 1, 1);
		paddle=new PaddleExtension(375, 275, 40, 40, Color.BLUE, 2);
		keys = new boolean[4];
		erase=new Block(400, 530, 200, 60, Color.BLACK);
		wall=new Wall(805, 585);

		setNewSideBlocks();
		
		
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void setNewSideBlocks()
   {
	   sideBlocks=new ArrayList<Block>();
		
		for (int vertPos=5; vertPos<550; vertPos+=80)
		{
			sideBlocks.add(new Block(5, vertPos, 35, 75, Color.BLACK));
			sideBlocks.add(new Block(45, vertPos, 35, 75, Color.BLACK));
			sideBlocks.add(new Block(725, vertPos, 35, 75, Color.BLACK));
			sideBlocks.add(new Block(765, vertPos, 35, 75, Color.BLACK));
		}
		for (int hPos=85; hPos<700; hPos+=80)
		{
			sideBlocks.add(new Block(hPos, 5, 75, 35, Color.BLACK));
			sideBlocks.add(new Block(hPos, 45, 75, 35, Color.BLACK));
			sideBlocks.add(new Block(hPos, 485, 75, 35, Color.BLACK));
			sideBlocks.add(new Block(hPos, 525, 75, 35, Color.BLACK));
		}
		
   }
	
   public boolean inRange(int test, int smaller, int larger)
   {
	   return (test<larger && test>smaller);
   }
   public void update(Graphics window){
	   paint(window);
   }
   
   public void printScore(Graphics window)
   {
	   
	   erase.draw(window, Color.WHITE);
	   window.setColor(Color.RED);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		printScore(graphToBack);
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		for (Block b: sideBlocks)
		{
			b.draw(graphToBack);
		}

		//see if ball hits left wall or right wall
		if(sideBlocks.size()==0)
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			paddle.setSpeed(0);
			paddle.draw(graphToBack, Color.WHITE);
			ball = new Ball(200, 200, 10, 10, Color.RED, 1, 1); //(int)(3*Math.pow(-1, (int)(Math.random()*2))), 2); 
			paddle=new PaddleExtension(375, 275, 40, 40, Color.BLUE, 2);
			setNewSideBlocks();
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=wall.getY() 
				&& ball.getY()<=wall.getHeight()-ball.getHeight()-ball.getYSpeed()-20))
		{
			ball.setYSpeed(ball.getYSpeed()*-1);
		}
		//see if the ball hits the side walls
		else if (!(ball.getX()>=wall.getX() 
				&& ball.getX()<=wall.getWidth()-ball.getWidth()-ball.getXSpeed()))
		{
			ball.setXSpeed(ball.getXSpeed()*-1);
		}



		//see if the ball hits the left paddle
		if(ball.didCollideLeft(paddle) && !(ball.didCollideTop(paddle)) 
				&& !(ball.didCollideBottom(paddle) && !(ball.didCollideRight(paddle))))
		{
			if (ball.getX()<=(paddle.getX()+paddle.getWidth()-Math.abs(ball.getXSpeed())))
			{
				ball.setYSpeed(Math.abs(ball.getYSpeed()));
			}
			else
			{
				System.out.print("left");
				ball.setXSpeed(Math.abs(ball.getXSpeed()));

			}
		}
		
		if(ball.didCollideRight(paddle) && !(ball.didCollideTop(paddle)) 
				&& !(ball.didCollideBottom(paddle)) && !(ball.didCollideLeft(paddle)))
		{
			if (ball.getX()>=(paddle.getX()+paddle.getWidth()+Math.abs(ball.getXSpeed())))
			{
				ball.setYSpeed(-1*Math.abs(ball.getYSpeed()));
			}
			else
			{
				System.out.print("right");
				ball.setXSpeed(-1*Math.abs(ball.getXSpeed()));
			}
		}
		
		if(ball.didCollideTop(paddle) && !(ball.didCollideLeft(paddle)) 
				&& !(ball.didCollideRight(paddle) && !(ball.didCollideBottom(paddle))))
		{
			if (ball.getY()>=(paddle.getY()+paddle.getHeight()+Math.abs(ball.getYSpeed())))
			{
				ball.setXSpeed(-Math.abs(ball.getXSpeed()));
			}
			else
			{

				System.out.print("top");
				ball.setYSpeed(-Math.abs(ball.getYSpeed()));

			}		
		}
		
		if(ball.didCollideBottom(paddle) && !(ball.didCollideLeft(paddle)) 
				&& !(ball.didCollideRight(paddle)) && !(ball.didCollideTop(paddle)))
		{
			if (ball.getY()<=(paddle.getY()+paddle.getHeight()-Math.abs(ball.getYSpeed())))
			{
				ball.setXSpeed(Math.abs(ball.getXSpeed()));
			}
			else
			{
				System.out.print("bottom");
				ball.setYSpeed(Math.abs(ball.getYSpeed()));

			}
		}
		
		
		//see if the ball hits the side blocks
		
		for (int i=0; i<sideBlocks.size(); i++)
		{
			Block side = sideBlocks.get(i);
			if (ball.didCollideBottom(side) || ball.didCollideLeft(side) 
					|| ball.didCollideRight(side) || ball.didCollideTop(side))
			{
				if (ball.didCollideBottom(side) || ball.didCollideTop(side))
				{
					ball.setYSpeed(ball.getYSpeed()*-1);
				}
				else ball.setXSpeed(ball.getXSpeed()*-1);
				side.draw(graphToBack, Color.WHITE);
				sideBlocks.remove(i);
			}
		}
		


		//see if the paddles need to be moved
		//inRange checks only work if paddle width is less than block width
		if (keys[0]==true && paddle.getY()>paddle.getSpeed())
		{
			boolean paddleToBlock=false;
			for (Block block: sideBlocks)
			{
				if (block.getY()+block.getHeight()<paddle.getY()
						&& paddle.getY()<paddle.getSpeed()+block.getY()+block.getHeight()
						&& (inRange(paddle.getX(), block.getX(), block.getX()+block.getWidth())
								|| inRange(paddle.getX()+paddle.getWidth(), block.getX(), block.getX()+block.getWidth())
								|| inRange(block.getX(), paddle.getX(), paddle.getX()+paddle.getWidth())
								|| inRange(block.getX()+block.getWidth(), paddle.getX(), paddle.getX()+paddle.getWidth())))
				{
					paddleToBlock=true;
				}
			}
			if (!paddleToBlock) paddle.moveUpAndDraw(graphToBack);
		}
		
		if (keys[1]==true && paddle.getY()<(wall.getHeight()-paddle.getHeight()-20))
		{	
			boolean paddleToBlock=false;
			for (Block block: sideBlocks)
			{
				if (block.getY()>paddle.getY()
						&& paddle.getY()>block.getY()-paddle.getHeight()-paddle.getSpeed()-1
						&& (inRange(paddle.getX(), block.getX(), block.getX()+block.getWidth())
								|| inRange(paddle.getX()+paddle.getWidth(), block.getX(), block.getX()+block.getWidth())
								|| inRange(block.getX(), paddle.getX(), paddle.getX()+paddle.getWidth())
								|| inRange(block.getX()+block.getWidth(), paddle.getX(), paddle.getX()+paddle.getWidth())))
				{
					paddleToBlock=true;
				}
			}
			if (!paddleToBlock) paddle.moveDownAndDraw(graphToBack);
		}

		if (keys[2]==true && paddle.getX()>paddle.getSpeed())
		{
			boolean paddleToBlock=false;
			for (Block block: sideBlocks)
			{
				if (block.getX()+block.getWidth()<paddle.getX()
						&& paddle.getX()<paddle.getSpeed()+block.getX()+block.getWidth()
						&& (inRange(paddle.getY(), block.getY(), block.getY()+block.getHeight())
								|| inRange(paddle.getY()+paddle.getHeight(), block.getY(), block.getY()+block.getHeight())
								|| inRange(block.getY(), paddle.getY(), paddle.getY()+paddle.getHeight())
								|| inRange(block.getY()+block.getHeight(), paddle.getY(), paddle.getY()+paddle.getHeight())))
				{
					paddleToBlock=true;
				}
			}
			if (!paddleToBlock) paddle.moveLeftAndDraw(graphToBack);
		}
		
		if (keys[3]==true && paddle.getX()<(wall.getWidth()-paddle.getWidth()))
		{
			boolean paddleToBlock=false;
			for (Block block: sideBlocks)
			{
				if (block.getX()>paddle.getX()
						&& paddle.getX()>block.getX()-paddle.getWidth()-paddle.getSpeed()-1
						&& (inRange(paddle.getY(), block.getY(), block.getY()+block.getHeight())
								|| inRange(paddle.getY()+paddle.getHeight(), block.getY(), block.getY()+block.getHeight())
								|| inRange(block.getY(), paddle.getY(), paddle.getY()+paddle.getHeight())
								|| inRange(block.getY()+block.getHeight(), paddle.getY(), paddle.getY()+paddle.getHeight())))
				{
					paddleToBlock=true;
				}
			}
			if (!paddleToBlock) paddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}
