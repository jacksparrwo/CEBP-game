import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Window extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8255319694373975038L;
	public JTextField textField;
	private JTextField txtFrames;
	
	
	
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
		desktopPane.setBounds(0, 0, 130, 35);
		desktopPane.setBackground(Color.LIGHT_GRAY);
		
	
		
		textField= new JTextField();
		textField.setBounds(74, 11, 48, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		txtFrames = new JTextField();
		txtFrames.setText("Frames :");
		txtFrames.setBounds(10, 11, 60, 20);
		desktopPane.add(txtFrames);
		txtFrames.setColumns(10);
		txtFrames.setEditable(false);
		
		
		frame.setVisible(true);
		g.startGame();
	}
}
