package pong;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setSpeed(3, 1);
	}

	public Ball(int x, int y)
	{
		super(x, y);
		setSpeed(3, 1);
	}
	
	public Ball(int x, int y, int width, int height)
	{
		this(x, y);
		super.setWidth(width);
		super.setHeight(height);
	}
	
	public Ball(int x, int y, int width, int height, Color col)
	{
		this(x, y, width, height);
		super.setColor(col);
	}
	
	public Ball(int x, int y, int width, int height, int xS, int xY)
	{
		this(x, y, width, height);
		setSpeed(xS, xY);
	}
	
	public Ball(int x, int y, int width, int height, Color col, int xS, int xY)
	{
		super(x, y, width, height, col);
		setSpeed(xS, xY);
	}
	
	
	public void setXSpeed(int xS)
	{
		xSpeed=xS;
	}
	
	public void setYSpeed(int yS)
	{
		ySpeed=yS;
	}
	
	public void setSpeed(int xS, int yS)
	{
		xSpeed=xS;
		ySpeed=yS;
	}
	

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		return super.equals(other) && xSpeed==other.getXSpeed() 
				&& ySpeed==other.getYSpeed();
	}

	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	public boolean didCollideLeft(Object obj)
	{
		Block other = (Block)obj;
		return (getX() <= (other.getX() + other.getWidth() + Math.abs(getXSpeed()))
				&& getX() > (other.getX() - getWidth() - Math.abs(getXSpeed()))
				&& getX()>=(other.getX())
				&& getY()<=(other.getY()+other.getHeight())
				&& (getY()+getHeight())>=other.getY());
	}
	
	public boolean didCollideRight(Object obj)
	{
		Block other = (Block)obj;
		return (getX() < (other.getX() + other.getWidth() + Math.abs(getXSpeed()))
				&& getX() >= (other.getX() - getWidth() - Math.abs(getXSpeed()))
				&& getX()<=other.getX()+other.getWidth()
				&& getY()<=(other.getY()+other.getHeight())
				&& (getY()+getHeight())>=other.getY());
	}
	
	public boolean didCollideTop(Object obj)
	{
		Block other = (Block)obj;
		return (getY() >= (other.getY() - getHeight() - Math.abs(getYSpeed()))
				&& getY() < (other.getY() + other.getHeight() + Math.abs(getYSpeed())) 
				&& (getX()>=other.getX()
				&& getX()<=(other.getX()+other.getWidth())
				&& (getX()+getWidth())>=other.getX()
				&& (getX()+getWidth())<=other.getX()+other.getWidth()));
	}
	
	public boolean didCollideBottom(Object obj)
	{
		
		Block other = (Block)obj;
		return (getY() > (other.getY() - getHeight() - Math.abs(getYSpeed()))
				&& getY() <= (other.getY() + other.getHeight() + Math.abs(getYSpeed())) 
				&& (getX()>=other.getX()
				&& getX()<=(other.getX()+other.getWidth())
				&& (getX()+getWidth())>=other.getX()
				&& (getX()+getWidth())<=other.getX()+other.getWidth()));
	}

	public String toString()
	{
		return super.toString()+" "+xSpeed+" "+ySpeed;
	}
}
