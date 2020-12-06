import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2493195693272574797L;
	private Thread t1;
	private boolean running = false;
	private GameHandler gh;
	public Game() {
		new Window(640,480,"POKEMON POKEMON",this);
		
		gh = new GameHandler();
		
		gh.addObject(new Catcher(100,100,Entities.Catcher));// adding the catcher object type in the list
		
		gh.addObject(new Tree(300,250,Entities.Tree));
		gh.addObject(new Tree(400,250,Entities.Tree));
		gh.addObject(new Tree(500,250,Entities.Tree));
		gh.addObject(new Tree(300,250,Entities.Tree));
		gh.addObject(new Tree(400,350,Entities.Tree));
		gh.addObject(new Tree(500,350,Entities.Tree));
		gh.addObject(new Tree(300,350,Entities.Tree));
		 
	}
	
	
	public synchronized void startGame() {
		t1=new Thread(this);
		t1.start();
		running = true;
	}
	public synchronized void stopGame() {
		try {
			t1.join();
			running = false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void run() {
		
	
		
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns=1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames=0;
		while(running)
		{
			long now = System.nanoTime();
			delta +=(now-lastTime)/ns;
			lastTime=now;
			
					while(delta >=1) 
					{
						tick();
						delta--;
					}
					
			if(running) 
				render();
			frames++;
			
			if(System.currentTimeMillis()- timer > 1000) 
			{
				timer += 1000;
				System.out.println("FPS: "+frames);
				frames=0;
			}
				
			
					
			
		}
		stopGame();
		
	}
	private void tick()
	{
		gh.tick();
	}
	private void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs== null)
		{
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.pink);
		g.fillRect(0,0,640,480);
		gh.render(g);
		g.dispose();
		bs.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}

}
