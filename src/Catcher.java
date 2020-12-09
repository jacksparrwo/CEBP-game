import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Catcher extends GameObj{
	GameHandler gh;
	public static int goldWhite ;
	public static int goldBlack ;
	public Catcher(int x, int y, Entities entity,GameHandler gh) {
		super(x, y, entity);
		this.gh=gh;
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
		
	}

	@Override
	public void tick() {
		x+=velOnX;
		y+=velOnY;
		collision();
		
	}
	private void collision()
	{
		
		
		for(int i=0; i < gh.gameObjects.size(); i++) {
			GameObj obj = gh.gameObjects.get(i);
			
			 
			if(obj.getEntity()== Entities.Coin)
			{
				if(getBounds().intersects(obj.getBounds()))
				{
					//gold++;
					
					if(entity == Entities.Catcher)
					{
						if(goldWhite<1)
						{
						goldWhite++;
						gh.removeObject(obj);
						}else
						{
							System.out.println("WHITE: the gold limit is reached!!!");
						}
					}
					if(entity == Entities.Catcher2)
					{
						if(goldBlack<1)
						{
						goldBlack++;
						gh.removeObject(obj);
						}else
						{
							System.out.println("BLACK: the gold limit is reached!!!");
						}
					}
					
					
				}
				
			}
			
		}
	}

	@Override
	public void render(Graphics2D g) {
		
		if(entity == Entities.Catcher) {
			
			g.setColor(Color.black);
			g.fillRect(x , y , 32 , 32);
			g.setColor(Color.white);
			g.fillRect(x+2 , y+2 , 28 , 28);
			
		}
	
		if(entity == Entities.Catcher2) {
			
			g.setColor(Color.white);
			g.fillRect(x , y , 32 , 32);
			g.setColor(Color.black);
			g.fillRect(x+2 , y+2 , 28 , 28);
			
		}	
		
	}
	
}
