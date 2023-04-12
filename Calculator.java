package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
	static JFrame frame;
	String s0, s1, s2;
	static JTextField txt;
	
	public Calculator() {
		s0 = s1 = s2 = "";
	}
	private static void createUI (final JFrame frame) {
		// Creating textField
		txt = new JTextField(20);
		txt.setEditable(false);
		Calculator c = new Calculator();
		
		// Creating buttons
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bA, bSub, bMul, bDiv, bClear, bPoint, bEq;
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bA = new JButton("+");
		bSub = new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		bClear = new JButton("C");
		bPoint = new JButton(".");
		bEq = new JButton("=");
		
		b0.addActionListener(c);
		b1.addActionListener(c);
		b2.addActionListener(c);
		b3.addActionListener(c);
		b4.addActionListener(c);
		b5.addActionListener(c);
		b6.addActionListener(c);
		b7.addActionListener(c);
		b8.addActionListener(c);
		b9.addActionListener(c);
		bA.addActionListener(c);
		bSub.addActionListener(c);
		bMul.addActionListener(c);
		bDiv.addActionListener(c);
		bClear.addActionListener(c);
		bPoint.addActionListener(c);
		bEq.addActionListener(c);
		
		// Creating panels
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5, 4));
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		buttonPanel.add(bA);
		
		buttonPanel.add(b4);
		buttonPanel.add(b5);
		buttonPanel.add(b6);
		buttonPanel.add(bSub);
		
		buttonPanel.add(b7);
		buttonPanel.add(b8);
		buttonPanel.add(b9);
		buttonPanel.add(bMul);
		
		buttonPanel.add(bPoint);
		buttonPanel.add(b0);
		buttonPanel.add(bClear);
		buttonPanel.add(bDiv);
		buttonPanel.add(bEq);
		
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		textPanel.add(txt);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(textPanel, BorderLayout.NORTH);
		mainPanel.add(buttonPanel, BorderLayout.CENTER);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	private static void createFrame() {
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setVisible(true);
		createUI(frame);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			if (s1.equals("") && s2.equals("")) {
				s0 = s0 + s;
			} else if (!s1.equals("")) {
				s2 = s2 + s;
			}
			txt.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == 'C') {
			s0 = s1 = s2 = "";
			txt.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == '=') {
			double result = 0;
			if (s1.equals("+")) {
				result = Double.parseDouble(s0) + Double.parseDouble(s2);
			}
			else if (s1.equals("-")) {
				result = Double.parseDouble(s0) - Double.parseDouble(s2);
			}
			else if (s1.equals("*")) {
				result = Double.parseDouble(s0) * Double.parseDouble(s2);
			}
			else if (s1.equals("/")) {
				result = Double.parseDouble(s0) / Double.parseDouble(s2);
			}
			txt.setText(s0 + s1 + s2 + "=" + Double.valueOf(result));
		}
		else {
			double result = 0;
			if (!s1.equals("") && !s2.equals("")) {
				if (s1.equals("+")) {
					result = Double.parseDouble(s0) + Double.parseDouble(s2);
				}
				else if (s1.equals("-")) {
					result = Double.parseDouble(s0) - Double.parseDouble(s2);
				}
				else if (s1.equals("*")) {
					result = Double.parseDouble(s0) * Double.parseDouble(s2);
				}
				else if (s1.equals("/")) {
					result = Double.parseDouble(s0) / Double.parseDouble(s2);
				}
				s0 = Double.toString(result);
				s2 = "";
				s1 = s;
			}
			else if(!s0.equals("")) {
				s1 = s;
			}
			txt.setText(s0 + s1 + s2);
		}
	}

}
