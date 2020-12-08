import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInEvent extends KeyAdapter{
	
	private GameHandler gh;
	public KeyInEvent(GameHandler gh) {
	
		this.gh = gh;
	}
	public void keyPressed(KeyEvent e)
	{
		
		int key = e.getKeyCode();// get the key which is pressed
		
		
		for(int i=0; i < gh.gameObjects.size(); i++) {
			GameObj obj = gh.gameObjects.get(i);
			
			if(obj.getEntity() == Entities.Catcher )
			{
				if( key == KeyEvent.VK_W ) obj.setVelY(-5);
				if( key == KeyEvent.VK_S ) obj.setVelY(5);
				if( key == KeyEvent.VK_A ) obj.setVelX(-5);
				if( key == KeyEvent.VK_D ) obj.setVelX(5);
				
			}
			
			if(obj.getEntity() == Entities.Catcher2 )
			{
				if( key == KeyEvent.VK_UP ) obj.setVelY(-5);
				if( key == KeyEvent.VK_DOWN ) obj.setVelY(5);
				if( key == KeyEvent.VK_LEFT ) obj.setVelX(-5);
				if( key == KeyEvent.VK_RIGHT ) obj.setVelX(5);
				
			}
		} 
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		for(int i=0; i < gh.gameObjects.size(); i++) {
			GameObj obj = gh.gameObjects.get(i);
			
			if(obj.getEntity() == Entities.Catcher )
			{
				if( key == KeyEvent.VK_W ) obj.setVelY(0);
				if( key == KeyEvent.VK_S ) obj.setVelY(0);
				if( key == KeyEvent.VK_A ) obj.setVelX(0);
				if( key == KeyEvent.VK_D ) obj.setVelX(0);
				
			}
			
			if(obj.getEntity() == Entities.Catcher2 )
			{
				if( key == KeyEvent.VK_UP ) obj.setVelY(0);
				if( key == KeyEvent.VK_DOWN ) obj.setVelY(0);
				if( key == KeyEvent.VK_LEFT ) obj.setVelX(0);
				if( key == KeyEvent.VK_RIGHT ) obj.setVelX(0);
				
			}
		}
		
	} 
}
