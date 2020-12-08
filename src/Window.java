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
	private JTextField txtFrames;
	private JTextField txtGold;
	private JTextField textField_2;
	private JTextField txtPokeballs;
	private JTextField textField_4;
	private JTextField txtPokemonCaughtFor;
	private JTextField textField_3;
	private JTextField txtPokemonCaughtFor_1;
	private JTextField textField_6;
	
	
	
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
		desktopPane.setBounds(0, 0, 730, 35);
		desktopPane.setBackground(Color.LIGHT_GRAY);
		
	
		
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
		txtGold.setBounds(132, 11, 36, 20);
		desktopPane.add(txtGold);
		txtGold.setColumns(10);
		txtGold.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setBounds(168, 11, 36, 20);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		txtPokeballs = new JTextField();
		txtPokeballs.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPokeballs.setText("Pokeballs :");
		txtPokeballs.setBounds(214, 11, 65, 20);
		desktopPane.add(txtPokeballs);
		txtPokeballs.setColumns(10);
		txtPokeballs.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setBounds(277, 11, 36, 20);
		desktopPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		txtPokemonCaughtFor = new JTextField();
		txtPokemonCaughtFor.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPokemonCaughtFor.setText("Pokemons caught for White :");
		txtPokemonCaughtFor.setBounds(323, 11, 170, 20);
		desktopPane.add(txtPokemonCaughtFor);
		txtPokemonCaughtFor.setColumns(10);
		txtPokemonCaughtFor.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setBounds(492, 11, 30, 20);
		desktopPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		txtPokemonCaughtFor_1 = new JTextField();
		txtPokemonCaughtFor_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPokemonCaughtFor_1.setText("Pokemons caught for Black :");
		txtPokemonCaughtFor_1.setBounds(532, 11, 170, 20);
		desktopPane.add(txtPokemonCaughtFor_1);
		txtPokemonCaughtFor_1.setColumns(10);
		txtPokemonCaughtFor_1.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setBounds(700, 11, 36, 20);
		desktopPane.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEditable(false);
		
		frame.setVisible(true);
		g.startGame();
	}
}
