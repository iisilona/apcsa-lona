package pong;

public class Wall extends Block
{
	private int width, height;
	
	public Wall()
	{
		setPos(0, 0);
		width=800;
		height=600;
	}
	
	public Wall(int wid, int hei)
	{
		setPos(0, 0);
		width=wid;
		height=hei;
	}
	
	public void setWidthHeight(int wid, int hei)
	{
		width=wid;
		height=hei;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
}
