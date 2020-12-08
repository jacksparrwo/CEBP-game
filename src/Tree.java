import java.awt.Color;
import java.awt.Graphics;

public class Tree extends GameObj{

	public Tree(int x, int y, Entities entity) {
		super(x, y, entity);
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x , y , 24 , 24);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x , y+14 , 8 , 10);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x+16 , y+14 , 8 , 10 );
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x+8 , y+15 , 8 , 10 );
		
	}
	
}
