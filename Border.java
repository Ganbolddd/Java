 package swing;
 import javax.swing.*;
 import java.awt.*;

public class Border {
	private static void createUI(final JFrame frame) {
		// Creating buttons
		// JButton b1 = new JButton("button-1");
		JButton b2 = new JButton("button-2");
		JButton b3 = new JButton("button-3");
		JButton b4 = new JButton("button-4");
		JButton b5 = new JButton("button-5");
		
		JButton b6 = new JButton("button-6");
		JButton b7 = new JButton("button-7");
		JButton b8 = new JButton("button-8");
		JButton b9 = new JButton("button-9");
		
		// Creating panel
		JPanel panel = new JPanel();
		
		// Creating center panel
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(2, 2));
		centerPanel.add(b6);
		centerPanel.add(b7);
		centerPanel.add(b8);
		centerPanel.add(b9);
		
		// Adding buttons on panel
		panel.setLayout(new BorderLayout());
		panel.add(centerPanel, BorderLayout.NORTH);
		panel.add(b2, BorderLayout.WEST);
		panel.add(b3, BorderLayout.EAST);
		panel.add(b4, BorderLayout.SOUTH);
		panel.add(b5, BorderLayout.CENTER);
		frame.add(panel);	
	}
	
	private static void createFrame() {
		// Creating frame
		JFrame frame = new JFrame("GridLayout");
		
		// Set something on my frame
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
