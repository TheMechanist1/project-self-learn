package reichBoi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.*; 

public class MainClass {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int width=1280;
		int height=1024;
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); 
		frame.setSize(width, height); 
		frame.setUndecorated(true);
		frame.setTitle("Random Numbers");
		frame.setAutoRequestFocus(true);
		frame.setExtendedState(frame.getExtendedState()|JFrame.MAXIMIZED_BOTH);
		
		
		frame.setVisible(true);
		
	    frame.setLayout(new BorderLayout());
	    frame.add(new JPanel(){
			private static final long serialVersionUID = 1L;

			@Override
	        public void paintComponent(Graphics g){
	            super.paintComponent(g);
	            int width = frame.getSize().width;
	            int height = frame.getSize().height;
	            g.setColor(Color.BLACK);
	            g.fillRect(0, 0, width, height);
//	            for (int x = 0; x < width; x++) {
//	            	for (int y = 0; y < height; y++) {
//	            		
//	            		if(rand.nextInt(2)==1) {
//	            			g.setColor(Color.BLACK);
//	            		} else {
//	            			g.setColor(Color.WHITE);
//	            		}
//	            		g.drawLine(x, y, width / 2, height / 2);
//	            	}
//	            }
	            while(true) {
            		
            			
            		
        				g.setColor(Color.GREEN);
            		
            		g.drawRect(rand.nextInt(width), rand.nextInt(height), 1, 1);
	            }
			
	        }
	    }, BorderLayout.CENTER);
		

		
	}

}
