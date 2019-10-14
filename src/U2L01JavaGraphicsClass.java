import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class U2L01JavaGraphicsClass extends JPanel {
	
	public void paintComponent(Graphics g){
		g.drawLine(0,0,50,50);       
		g.drawLine(50,0,50,75);
	}
	
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Canvas");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    U2L01JavaGraphicsClass panel = new U2L01JavaGraphicsClass();
	    
	    frame.add(panel);

	    frame.setSize(300, 200);
	    frame.setVisible(true);

	}

}
