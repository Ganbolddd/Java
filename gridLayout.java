 package swing;
 import javax.swing.*;
 import java.awt.*;

public class gridLayout {
	private static void createUI(final JFrame frame) {
		// Creating buttons
		JButton b1 = new JButton("button-1");
		JButton b2 = new JButton("button-2");
		JButton b3 = new JButton("button-3");
		JButton b4 = new JButton("button-4");
		JButton b5 = new JButton("button-5");
		
		// Creating panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		// Adding buttons on panel
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		frame.add(panel);	
	}
	
	private static void createFrame() {
		JFrame frame = new JFrame("GridLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		createUI(frame);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFrame();

	}

}
