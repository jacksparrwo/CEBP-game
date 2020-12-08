import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2493195693272574797L;
	private Thread t1;
	private boolean running = false;
	private GameHandler gh;
	private Random r;
	public int frames;
	Window wind;
	public Game() {
		
		gh = new GameHandler();
		
		this.addKeyListener(new KeyInEvent(gh));
		
		wind=new Window(1920,1000,"POKEMON POKEMON",this);
		
		r = new Random();
		
		for(int i = 0; i < 20; i++){
			
			gh.addObject(new Tree(r.nextInt(1000),r.nextInt(400),Entities.Tree));
			
		}
		
		gh.addObject(new Catcher(700,600,Entities.Catcher));// adding the catcher object type in the list
		gh.addObject(new Catcher(800,600,Entities.Catcher2));
	
		 
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
		frames=0;
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
				wind.textField.setText(String.valueOf(frames));
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
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0,0,1920,1000);
		gh.render(g);
		g.dispose();
		bs.show();
	}
	public int getFrames()
	{
		return frames;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}

}
