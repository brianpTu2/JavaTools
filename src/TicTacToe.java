import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe {

	//Attributes - Fields (Variables)
	private JFrame frame;
	private JButton[] buttons = new JButton[9];
	
	private int ctr = 0;
	
	KeyListener kListen = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Key Pressed");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	
	ActionListener action1 = new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
				
			System.out.println("BUTTON RUNNING");
			
			JButton tempJ = ((JButton)e.getSource());
			
			String text = "";
			
			if (ctr%2 == 0) {
				text = "X";
			}
			
			else {
				text = "O";
			}
			
			tempJ.setEnabled(false);
			tempJ.setText(text);
			
			//write your win logic
			if (buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())) {
				System.out.println(text+" WINS!!!");
				
				//Write code to reset board
				for (int i =0; i < buttons.length; i++) {
					buttons[i].setText(""+ i);
					buttons[i].setEnabled(true);
				}
				
				
				
			}
			
			System.out.println(text);
			ctr = ctr + 1;
		}	
	};
	
	//Constructors - Special Methods used once
	public TicTacToe() {
		
		frame = new JFrame("Tic Tac Toe");
		frame.setLocation(100, 100);
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.addKeyListener(kListen);
		GridLayout g = new GridLayout(3, 3, 5, 5);
		frame.setLayout(g);
		
		for (int i = 0; i < buttons.length; i++) {
			
			//Constructs each button
			buttons[i] = new JButton(""+i);
			buttons[i].addActionListener(action1);
			buttons[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

			frame.add(buttons[i]);
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	// Behaviours - Methods
	
	public static void main(String[] args) {
		
		//Reference Type = Object Type
		TicTacToe game = new TicTacToe();
		
	
	} //end main

} //end class
