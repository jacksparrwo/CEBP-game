import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Catcher extends GameObj{
	GameHandler gh;
	public static int goldWhite ;
	public static int goldBlack ;
	public static int ballsWhite ;
	public static int ballsBlack ;
	public boolean colShopKeeperWhite=false;
	public boolean colShopKeeperBlack=false;
	public boolean dBlack=false;
	public boolean dWhite=false;
	
	
	public static int pokemonsWhite ;
	public static int pokemonsBlack ;
	
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
					
					if(entity == Entities.Catcher)
					{
						if(goldWhite<25)
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
						if(goldBlack<25)														
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
			
			if(obj.getEntity()== Entities.ShopKeeper)
			{
				if(getBounds().intersects(obj.getBounds()))
				{
					
					if(entity == Entities.Catcher)
					{
						if(colShopKeeperWhite==false)
						{
						new ShopWindow();
						
						colShopKeeperWhite=true;
						} 
					}
					
					
					
					if(entity == Entities.Catcher2)											        //GOLD LIMITS
					{	
						if(colShopKeeperBlack==false)
						{
						new ShopWindow2();
						
						colShopKeeperBlack=true;
						} 
					}
				}
				
			}
			
			if(obj.getEntity()== Entities.Dungeon)
			{
				if(getBounds().intersects(obj.getBounds()))
				{
					
					if(entity == Entities.Catcher)
					{
						if(dWhite==false)
						{
						new WDungeonWindow();
						
						dWhite=true;
						} 
					}
					
					
					
					if(entity == Entities.Catcher2)											        //GOLD LIMITS
					{	
						if(dBlack==false)
						{
						new BDungeonWindow();
						
						dBlack=true;
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
	//test
}
