import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;

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
	public abstract void render(Graphics2D g) throws IOException;
	 public void setX(int x) {
		 this.x=x;
	 }
	 public void setY(int y) {
		 this.y=y;
	 }
	 public int getX() {
		 return x;
	 }
	 public int getY() {
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
	 public int getVelX() {
		 return velOnX;
	 }
	 public int getVelY() {
		 return velOnY;
	 }
}
