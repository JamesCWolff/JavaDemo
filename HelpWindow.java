import java.awt.*;
import javax.swing.*;

public class HelpWindow extends JDialog{
	JLabel label;
	
	public HelpWindow(JFrame frame){
		super(frame, "Help Window", true);
		setLayout(new FlowLayout());
		
		label = new JLabel("I am tired, this is a help menu.");
		add(label);
	}
}