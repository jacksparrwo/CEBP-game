import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Catcher extends GameObj{

	public Catcher(int x, int y, Entities entity) {
		super(x, y, entity);
	
	}

	@Override
	public void tick() {
		x+=velOnX;
		y+=velOnY;
		
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
