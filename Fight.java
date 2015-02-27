import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Fight {
	private static int Hp1 = 20;
	private static int Attack1 = 3;
	private static int Speed1 = 4;
	private static int Hp2 = 12;
	private static int Attack2 = 2;
	private static int Speed2 = 3;
	
	private static JFrame frame1 = new JFrame ("!Battle!");
	private static int width;
	private static int height;
	private static JButton button1 = new JButton ("--EXIT--");
	private static JButton button2 = new JButton ("");
	private static JButton button3 = new JButton ("");
	private static JButton button4 = new JButton ("");
	private static JButton button5 = new JButton ("");
	private static JTextArea txtArea1 = new JTextArea ();
	
	public static void main (String Args[]){
		frame1.setLayout(null);
		frame1.setSize(800, 500);
		frame1.setLocation(400, 250);
		frame1.setEnabled(true);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.lightGray);
		
		width = frame1.getWidth();
		height = frame1.getHeight();
		
		button1.setBounds(width/8*5,height/8*5,width/4,height/4);
		button1.setEnabled(true);
		button1.setVisible(true);
		button1.setToolTipText("Save and Quit?");
		button1.setBackground(Color.orange);
		button1.setForeground(Color.magenta);
		button1.addActionListener(new actionExit());
		frame1.add(button1);
		
		txtArea1.setBounds(30,30,width/4,height/4);
		txtArea1.setText("Health = " + Hp1 + "\n"     +
					" Attack = " + Attack1 + "\n" +
					" Speed = "	+ Speed1 					);
		txtArea1.setBackground(Color.lightGray);
		txtArea1.setForeground(Color.black);
		txtArea1.setVisible(true);
		txtArea1.setEnabled(true);
		frame1.add(txtArea1);
	}//main method
	
	public static void wait(int time){
		try {
			TimeUnit.MILLISECONDS.sleep(time);
		} catch(InterruptedException e){}
	}
	public static void exit (){
		frame1.setEnabled(false);
		frame1.setVisible(false);
		System.exit(0);
	}//exit method
	
	public static void print (String text){
		System.out.println(text);
	} public static void print (int text){
		System.out.println("" + text);
	}//print method(s)

}//Fight Class
class actionExit implements ActionListener {
	@Override
	public void actionPerformed (ActionEvent e){
		Fight.exit();
	}//actionPerformed method
}//actionExit class