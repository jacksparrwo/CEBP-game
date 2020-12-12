import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ShopKeeper extends GameObj{
	

	GameHandler gh;
	private boolean wspeed =false;
	private boolean bspeed =false;
	public ShopKeeper(int x, int y, Entities entity) {
		super(x, y, entity);
		
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,50,50);
		
	}
	
	@Override
	public void render(Graphics2D g) throws IOException {

		
		g.setColor(Color.black);
		g.fillRect(x , y , 50 , 50);
		g.setColor(Color.orange);
		g.fillRect(x+2 , y+2 , 46 , 46);
		g.setColor(Color.black);
		g.fillRect(x+10, y+10 , 30 , 30);
		g.setColor(Color.orange);
		g.fillRect(x+12 , y+12 , 26 , 26);
	
	
		
		
	}
	
	
}

