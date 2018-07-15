import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class  BasicBallClassExample {

	//Attributes - Fields
	private JFrame frame = new JFrame();
	private Timer t;
	

	
	//Ball attributes
	private Color ballColor = Color.RED;
	private int xpos = -20;
	private int ypos = -20;
	private int r = 10;
	
	
	private MouseMotionListener mlistener = new MouseMotionListener() {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
			  if (e.getButton() == MouseEvent.BUTTON3) {

				  r = r - 1;	
			  }
			  else {
				  r = r + 1;
			  }
			
			panel.repaint();
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
	
			
			xpos = e.getX();
			ypos = e.getY();
			panel.repaint();
			
			
		}
		
		
	};
	
	private ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			//panel.repaint();  
		}
		
		
	};
	
	
	private JPanel panel = new JPanel() {
	
		public void paint(Graphics g) {
		
			//Pretty Stuff:  this makes your drawing look nicer. 
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			/*
			g2.setColor(Color.BLUE);
			int width = panel.getWidth();
			int height = panel.getHeight();
			
			g2.drawRect(10, 10, width-20, height - 20);
		
			g2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
			
			if (showText) {
				g2.drawString("QUIET PLEASE", 30, 40);
			
			}
			showText = !showText;
			*/
			
			
			//Drawing Ball
			g2.setColor(ballColor);
			g2.fillOval(xpos, ypos, r, r);
			
			
			
			
			
		}
		
		
		
	};
	
	//Game Variables;
	private boolean showText = true;
	
	
	
	//Constructors
	public BasicBallClassExample() {
		
		frame.setSize(500,500);
		frame.setLocation(100, 100);
		
		//t = new Timer(100,action);
		//t.start();
		
		frame.addMouseMotionListener(mlistener);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	//Behaviours - Methods
	
	
	//**********************
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicBallClassExample b = new BasicBallClassExample();
	}

}
