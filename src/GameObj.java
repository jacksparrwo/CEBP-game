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
	 public void setX(int x) {
		 this.x=x;
	 }
	 public void setY(int y) {
		 this.y=y;
	 }
	 public int getX(int x) {
		 return x;
	 }
	 public int getY(int y) {
		 return y;
	 }
	 public void setEntity(Entities entity)
	 {
		 this.entity=entity;
	 }
	 public Entities getEntity()
	 {
		 return entity;
	 }
}
