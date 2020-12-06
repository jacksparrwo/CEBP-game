import java.awt.Color;
import java.awt.Graphics;

public class Catcher extends GameObj{

	public Catcher(int x, int y, Entities entity) {
		super(x, y, entity);
		//setX(100);
		//setY(100);
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x , y , 32 , 32);
		
	}
	
}
