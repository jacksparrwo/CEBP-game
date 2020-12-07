import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInEvent extends KeyAdapter{
	
	private GameHandler handler;
	public KeyInEvent(GameHandler gh)
	{
		this.handler = handler;
	}
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode(); // get the key which is pressed
	}
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
	}
}
