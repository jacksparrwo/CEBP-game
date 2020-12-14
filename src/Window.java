import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class Window extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8255319694373975038L;
	public JTextField textField;
	public JTextField txtFrames;
	public JTextField txtGold;
	public  JTextField textField_2;
	public JTextField txtPokeballs;
	public  JTextField textField_4;
	public JTextField txtPokemonCaughtFor;
	public  JTextField textField_3;
	public JTextField txtPokemonCaughtFor_1;
	public  JTextField textField_6;
	public JTextField textField_1;
	public JTextField textField_5;
	public JTextField textField_7;
	public JTextField textField_8;
	
	
	
	public Window(int w,int h,String title,Game g)
	{
		JDesktopPane desktopPane = new JDesktopPane();
		JFrame frame= new JFrame(title);
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(w,h));
		frame.setMaximumSize(new Dimension(w,h));
		frame.setMinimumSize(new Dimension(w,h));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.getContentPane().add(desktopPane);
		frame.getContentPane().add(g);
		desktopPane.setBounds(0, 0, 545, 52);
		desktopPane.setBackground(Color.LIGHT_GRAY);
		//desktopPane.setBackground(Color.yellow);
		
	
		
		textField= new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(68, 11, 48, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		txtFrames = new JTextField();
		txtFrames.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtFrames.setText("Frames :");
		txtFrames.setBounds(10, 11, 60, 20);
		desktopPane.add(txtFrames);
		txtFrames.setColumns(10);
		txtFrames.setEditable(false);
		
		txtGold = new JTextField();
		txtGold.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtGold.setText("Gold :");
		txtGold.setBounds(260, 30, 36, 20);
		desktopPane.add(txtGold);
		txtGold.setColumns(10);
		txtGold.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setBounds(295, 30, 36, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		

		
		txtPokeballs = new JTextField();
		txtPokeballs.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPokeballs.setText("Pokeballs :");
		txtPokeballs.setBounds(126, 30, 65, 20);
		desktopPane.add(txtPokeballs);
		txtPokeballs.setColumns(10);
		txtPokeballs.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setBounds(190, 30, 36, 20);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		txtPokemonCaughtFor = new JTextField();
		txtPokemonCaughtFor.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPokemonCaughtFor.setText("Pokemons caught by White :");
		txtPokemonCaughtFor.setBounds(126, 11, 170, 20);
		desktopPane.add(txtPokemonCaughtFor);
		txtPokemonCaughtFor.setColumns(10);
		txtPokemonCaughtFor.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setBounds(295, 11, 36, 20);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		txtPokemonCaughtFor_1 = new JTextField();
		txtPokemonCaughtFor_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPokemonCaughtFor_1.setText("Pokemons caught by Black :");
		txtPokemonCaughtFor_1.setBounds(336, 11, 170, 20);
		desktopPane.add(txtPokemonCaughtFor_1);
		txtPokemonCaughtFor_1.setColumns(10);
		txtPokemonCaughtFor_1.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setBounds(506, 11, 36, 20);
		desktopPane.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setText("Gold :");
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(470, 30, 36, 20);
		desktopPane.add(textField_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(506, 30, 36, 20);
		desktopPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setText("Pokeballs :");
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(336, 30, 65, 20);
		desktopPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(401, 30, 36, 20);
		desktopPane.add(textField_8);
		
		frame.setVisible(true);
		g.startGame();
		
	}
}
