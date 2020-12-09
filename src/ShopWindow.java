import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;



public class ShopWindow extends JFrame{

	
	private JButton buttonBuy;
	
	public ShopWindow () {
		
		
		setLayout(new FlowLayout());
		setBounds(100, 100, 200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		buttonBuy = new JButton("BUY POKEBALL");
	    add(buttonBuy);
	    
	    setVisible(true);
	    buttonBuy.addActionListener(new ActionListener(){ 
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
			
	    	
	    });
	}
}