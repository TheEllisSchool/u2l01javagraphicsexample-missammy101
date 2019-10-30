import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class U2L01JavaGraphicsClass extends JPanel {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Canvas");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    U2L01JavaGraphicsClass panel = new U2L01JavaGraphicsClass();
	    
	    frame.add(panel);

	    frame.setSize(300, 200);
	    frame.setVisible(true);

	}
	
	public void paintComponent(Graphics g){
		
		Color balletPink = new Color (245, 201, 227);
		
		Color darkgrey = new Color (69, 64, 71) ; 

		
		
	
		g.setColor(balletPink);
			g.fillOval(30,30,100,50) ; 
			
		g.setColor(darkgrey);
			
		g.setFont(new Font ("Arial", Font.PLAIN, 13));
		g.drawString("sam games", 45, 50);
		
		g.drawString("inc", 70, 70);
		
		
	
		
	}

}
