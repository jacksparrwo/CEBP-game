import java.awt.Graphics;

public abstract class GameObj {

	protected int x,y;
	protected int velOnX,velOnY;
	protected Entities entity;
	public GameObj(int velOnX,int velOnY,Entities entity){
		this.x=x;
		this.y=y;
		this.entity=entity;
	}
	public abstract void tick();
	public abstract void render(Graphics g);
}
