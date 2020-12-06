import java.awt.Graphics;

public abstract class GameObj {

	protected int x,y;
	protected int velOnX,velOnY;
	protected Entities entity;
	public GameObj(int x,int y,Entities entity){
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
	 public void setVelX(int velOnX) {
		 this.velOnX=velOnX;
	 }
	 public void setVelY(int velOnY) {
		 this.velOnY=velOnY;
	 }
	 public int getVelX(int x) {
		 return velOnX;
	 }
	 public int getVelY(int y) {
		 return velOnY;
	 }
}
