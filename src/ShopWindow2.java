
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class ShopWindow2 extends JFrame{

	

	private static final long serialVersionUID = -1363970201577058982L;
	
	
	private JButton buttonBuy;
	GameHandler gh;
	Entities ent;
	private ImageIcon img = new ImageIcon("pokeball.png");
	public ShopWindow2 () {
		
		JFrame frame= new JFrame("THIS IS SHOP FOR BLACK");
		frame.setLayout(new FlowLayout());
		frame.setBounds(100, 100, 400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLocation(0, 300);
		
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setBounds(169, 106, 93, 95);
		label.setIcon(img);
		
		frame.getContentPane().add(label);
		buttonBuy = new JButton("BUY POKEBALL");
		frame.add(buttonBuy);
	    
	    frame.setVisible(true);
	    buttonBuy.addActionListener(new ActionListener(){ 
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
					
						
					
					
						if(Catcher.goldBlack>0)
						{
							Catcher.goldBlack--;
							Catcher.ballsBlack++;
						}
					
				
				}
			
			//test
	    	
	    });
	}
}