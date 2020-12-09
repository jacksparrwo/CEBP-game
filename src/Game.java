import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.io.IOException;
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
		
		for(int i = 0; i < 50; i++){
			
			gh.addObject(new Coin(r.nextInt(1920),r.nextInt(800),Entities.Coin));
			
		}
		
		gh.addObject(new Catcher(700,900,Entities.Catcher,gh));// adding the catcher object type in the list
		gh.addObject(new Catcher(800,900,Entities.Catcher2,gh));
		gh.addObject(new ShopKeeper(300,900,Entities.ShopKeeper));
		
		 
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
				try {
					render();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			frames++;
			
			if(System.currentTimeMillis()- timer > 1000) 
			{
				timer += 1000;
				wind.textField.setText(String.valueOf(frames));
				frames=0;
			}
				
			wind.textField_2.setText(String.valueOf(Catcher.goldWhite));
			wind.textField_5.setText(String.valueOf(Catcher.goldBlack));
					
			
		}
		stopGame();
		
	}
	private void tick()
	{
		gh.tick();
	}
	private void render() throws IOException
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs== null)
		{
			this.createBufferStrategy(3);
			return;
		}
		Graphics2D g = (Graphics2D) bs.getDrawGraphics();
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
