import java.awt.Graphics;
import java.util.LinkedList;

public class GameHandler {
	
	LinkedList<GameObj> gameObjects=new LinkedList<GameObj>();
	
	public void tick() {
		for(int i = 0;i < gameObjects.size(); i++){
			GameObj gj = gameObjects.get(i);
			gj.tick();
		}
		
	}

	
	public void render(Graphics g) {  
		for(int i = 0;i < gameObjects.size(); i++){   // in order to loop through all objects in the game 
			GameObj gj = gameObjects.get(i);          // and render them.      *same above
			gj.render(g);
		}
		
		
	}
	public void addObject(GameObj obj) {   //adding obj to the list
		this.gameObjects.add(obj);
	}
	public void removeObject(GameObj obj) { //removing obj to the list
		this.gameObjects.remove(obj);
	}
}
