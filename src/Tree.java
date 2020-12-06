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
		
	}
	
}
