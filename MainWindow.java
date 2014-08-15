import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame{
	JMenuBar menubar;
	JMenu help;
	JMenuItem about;
	
	public MainWindow(){
		setLayout(new FlowLayout());
		
		menubar = new JMenuBar();
		add(menubar);
		
		help = new JMenu("Help");
		menubar.add(help);
		
		about = new JMenuItem("About");
		help.add(about);
		
		setJMenuBar(menubar);
		
		event e = new event();
		about.addActionListener(e);
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			HelpWindow gui = new HelpWindow(MainWindow.this);
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			gui.setSize(300,100);
			gui.setLocation(300,300);
			//gui.setTitle("Help Window");
			gui.setVisible(true);
		}
	}
	
	public static void main(String[]args){
		MainWindow gui = new MainWindow();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,100);
		//gui.setLocation(300,300);
		gui.setVisible(true);
		gui.setTitle("Main Window");
	}
}