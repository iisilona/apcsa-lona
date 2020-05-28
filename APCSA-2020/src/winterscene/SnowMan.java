package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class SnowMan extends AbstractShape
{
 public SnowMan(int x, int y, int w, int h )
 {
		super(x, y, w, h, Color.WHITE, 0, 0);
 }

 public void draw(Graphics window)
 {

	 int Xinit = 200
	 int Yinit = 300
	 
	 //lowest 
	 window.fillOval(Xinit,Yinit,30,30);
	 //middle
	 window.fillOval(Xinit+5,Yinit-20,20,20);
	 //top
	 window.fillOval(Xinit+10,Yinit-30,10,10);
 }

 public void moveAndDraw(Graphics window)
 {
    draw(window);   
 }
}
