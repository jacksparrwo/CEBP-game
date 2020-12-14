import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Button;
import javax.swing.SwingConstants;






public class ShopWindow extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7724070370845968374L;
	private JButton buttonBuy;
	GameHandler gh;
	Entities ent;
	private ImageIcon img = new ImageIcon("pokeball.png");
	public ShopWindow () {
		
		JFrame frame= new JFrame("THIS IS SHOP FOR WHITE");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setBounds(0, 0, 400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	    frame.setLocation(0, 0);
		
		
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setBounds(169, 106, 93, 95);
		label.setIcon(img);
		
		frame.getContentPane().add(label);

		buttonBuy = new JButton("BUY POKEBALL");
		buttonBuy.setBounds(153, 11, 126, 42);
		
		frame.getContentPane().add(buttonBuy);

	    
	    
	    buttonBuy.addActionListener(new ActionListener(){ 
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
					
						
				if(Catcher.goldWhite>0 && Catcher.ballsWhite<10)
				{
					
					Catcher.goldWhite--;
					Catcher.ballsWhite++;
				}
				else
				{
					System.out.println("WHITE: Not enough space in bag for pokeballs");
					
				}
						
						
						
					
					
					
				
				}
			
			
	    	
	    });
	    //desktopPane.add(label);
	    //desktopPane.add(buttonBuy);
	    frame.setVisible(true);
	}
	//test
}