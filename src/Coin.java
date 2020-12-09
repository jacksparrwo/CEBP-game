import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Coin extends GameObj{
	

	
	public Coin(int x, int y, Entities entity) {
		super(x, y, entity);
		
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,22,22);
		
	}
	

	@Override
	public void render(Graphics2D g) throws IOException {
		/*
		g.setColor(Color.green);
		g.fillRect(x , y , 24 , 24);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x , y+14 , 8 , 10);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x+16 , y+14 , 8 , 10 );
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x+8 , y+15 , 8 , 10 );
		*/
		
		
		g.fillOval(x , y , 24 , 24);
		g.setColor(Color.yellow);
		g.fillOval(x+2 , y+2 , 20 , 20);
		g.setColor(Color.black);
		
		
		//BufferedImage image = ImageIO.read(new File("C:\\Users\\Manu\\eclipse-workspace\\CEBP-game\\CEBP-game\\goldd"));
        //g.drawImage(image, x, y, null);
	
	
		
		
	}
	
	
}
