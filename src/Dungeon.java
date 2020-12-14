
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Dungeon extends GameObj{
	

	GameHandler gh;
	public Dungeon(int x, int y, Entities entity) {
		super(x, y, entity);
		
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,100,100);
		
	}
	
	@Override
	public void render(Graphics2D g) throws IOException {

		
		g.setColor(Color.black);
		g.fillRect(x , y , 100 , 100);
		g.setColor(Color.orange);
		g.fillRect(x+20 , y+25 , 60 , 75);
		
	
	
		
		
	}
	
	
}
