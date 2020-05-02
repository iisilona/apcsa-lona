package pong;
import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new PaddleTestTwo());

		PaddleTestTwo padTest = new PaddleTestTwo();
		((Component)padTest).setFocusable(true);
		getContentPane().add(padTest);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}
