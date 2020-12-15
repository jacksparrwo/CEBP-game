
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
import java.util.Random;

import javax.swing.GroupLayout;
	import javax.swing.ImageIcon;
	import javax.swing.GroupLayout.Alignment;
	import javax.swing.JButton;
	import javax.swing.JDesktopPane;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JTextField;
	import javax.swing.LayoutStyle.ComponentPlacement;
	import javax.swing.SwingConstants;

	
	

	public class BDungeonWindow  extends JFrame{
		private ImageIcon img1 = new ImageIcon("1.png");
		private ImageIcon img2 = new ImageIcon("2.png");
		private ImageIcon img3 = new ImageIcon("3.png");
		private ImageIcon img4 = new ImageIcon("4.png");
		private ImageIcon img5 = new ImageIcon("5.png");
		private ImageIcon img6 = new ImageIcon("6.png");
		private ImageIcon img7 = new ImageIcon("7.png");
		private ImageIcon img8 = new ImageIcon("8.png");
		private ImageIcon img9 = new ImageIcon("9.png");
		private ImageIcon img10 = new ImageIcon("10.png");
		private ImageIcon img11 = new ImageIcon("11.png");
		private ImageIcon img12 = new ImageIcon("12.png");
		
		Random r;
		int low = 10;
		int high = 100;
		int result ;
		

		
		public BDungeonWindow () {
			 
			JFrame frame = new JFrame("BLACK IN DUNGEON");
			frame.setBounds(100, 100, 600, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			
			JDesktopPane desktopPane = new JDesktopPane();
			frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
			
	
			
		
			
			JButton b1 = new JButton("CHARMANDER");
			b1.setBounds(158, 45, 103, 23);
			b1.setBackground(Color.RED);
			desktopPane.add(b1);
			b1.addActionListener(new ActionListener(){ 
			    	
					@Override
					public void actionPerformed(ActionEvent e) {
						
						r=new Random();
						result = r.nextInt(high-low) + low;
						if(Catcher.ballsBlack>0)
						{
							
							Catcher.ballsBlack--;
							if(result>70)
							{
							Catcher.pokemonsBlack++;
							}
						}		
						
					}
					
			    	
			    });
			
			
			
			JButton b2 = new JButton("EEVEE");
			b2.setBounds(158, 116, 103, 23);
			b2.setBackground(new Color(139, 69, 19));
			desktopPane.add(b2);
			b2.addActionListener(new ActionListener(){ 
			    	
					@Override
					public void actionPerformed(ActionEvent e) {
						
						r=new Random();
						result = r.nextInt(high-low) + low;
						if(Catcher.ballsBlack>0)
						{
							
							Catcher.ballsBlack--;
							if(result>70)
							{
							Catcher.pokemonsBlack++;
							}
						}		
						
			
					}
					
			    	
			    });
			 
			 
			
			JButton b3 = new JButton("MEW");
			b3.setBounds(158, 198, 103, 23);
			b3.setBackground(new Color(255, 105, 180));
			desktopPane.add(b3);
			b3.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
	
			
			
			JButton b4 = new JButton("PIKACHU");
			b4.setBackground(Color.YELLOW);
			b4.setBounds(158, 266, 103, 23);
			desktopPane.add(b4);
			b4.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
				
			
			JButton b5 = new JButton("SQUIRTLE");
			b5.setBackground(Color.CYAN);
			b5.setBounds(158, 342, 103, 23);
			desktopPane.add(b5);
			b5.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
			JButton b6 = new JButton("CELEBI");
			b6.setBackground(new Color(173, 255, 47));
			b6.setBounds(158, 413, 103, 23);
			desktopPane.add(b6);
			b6.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}		
				}
				
		    	
		    });
			
			JButton b7 = new JButton("VULPIX");
			b7.setBackground(new Color(255, 140, 0));
			b7.setBounds(458, 45, 103, 23);
			desktopPane.add(b7);
			b7.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
			JButton b8 = new JButton("GASTLY");
			b8.setBackground(new Color(128, 0, 128));
			b8.setBounds(458, 116, 103, 23);
			desktopPane.add(b8);
			b8.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
			JButton b9 = new JButton("POLIWAG");
			b9.setBackground(new Color(65, 105, 225));
			b9.setBounds(458, 198, 103, 23);
			desktopPane.add(b9);
			b9.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
			JButton b10 = new JButton("BULBASAUR");
			b10.setBackground(Color.GREEN);
			b10.setBounds(458, 266, 103, 23);
			desktopPane.add(b10);
			b10.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}			
					
				}
				
		    	
		    });
			
			JButton b11 = new JButton("TOGEPI");
			b11.setBackground(new Color(255, 250, 205));
			b11.setBounds(458, 342, 103, 23);
			desktopPane.add(b11);
			b11.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
			JButton b12 = new JButton("PSYDUCK");
			b12.setBackground(new Color(255, 255, 0));
			b12.setBounds(458, 413, 103, 23);
			desktopPane.add(b12);
			b12.addActionListener(new ActionListener(){ 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r=new Random();
					result = r.nextInt(high-low) + low;
					if(Catcher.ballsBlack>0)
					{
						
						Catcher.ballsBlack--;
						if(result>70)
						{
						Catcher.pokemonsBlack++;
						}
					}				
					
				}
				
		    	
		    });
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(41, 26, 70, 60);
			
			lblNewLabel.setIcon(img1);
			desktopPane.add(lblNewLabel);
			
			
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(41, 97, 70, 60);
			desktopPane.add(lblNewLabel_1);
			lblNewLabel_1.setIcon(img2);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(41, 179, 70, 60);
			desktopPane.add(lblNewLabel_2);
			lblNewLabel_2.setIcon(img3);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(41, 247, 70, 60);
			desktopPane.add(lblNewLabel_3);
			lblNewLabel_3.setIcon(img4);
			
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(41, 323, 70, 60);
			desktopPane.add(lblNewLabel_4);
			lblNewLabel_4.setIcon(img5);
			
			JLabel lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setBounds(41, 394, 70, 60);
			desktopPane.add(lblNewLabel_5);
			lblNewLabel_5.setIcon(img6);
			
			JLabel lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setBounds(351, 26, 70, 60);
			desktopPane.add(lblNewLabel_6);
			lblNewLabel_6.setIcon(img7);
			
			JLabel lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setBounds(351, 97, 70, 60);
			desktopPane.add(lblNewLabel_7);
			lblNewLabel_7.setIcon(img8);
			
			JLabel lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setBounds(351, 179, 70, 60);
			desktopPane.add(lblNewLabel_8);
			lblNewLabel_8.setIcon(img9);
			
			JLabel lblNewLabel_9 = new JLabel("");
			lblNewLabel_9.setBounds(351, 247, 70, 60);
			desktopPane.add(lblNewLabel_9);
			lblNewLabel_9.setIcon(img10);
			
			JLabel lblNewLabel_10 = new JLabel("");
			lblNewLabel_10.setBounds(351, 323, 70, 60);
			desktopPane.add(lblNewLabel_10);
			lblNewLabel_10.setIcon(img11);
			
			JLabel lblNewLabel_11 = new JLabel("");
			lblNewLabel_11.setBounds(351, 394, 70, 60);
			desktopPane.add(lblNewLabel_11);
			lblNewLabel_11.setIcon(img12);
			
			
			
			desktopPane.setLayout(null);
			frame.setVisible(true);

		
		}
	}

