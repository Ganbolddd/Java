package javaWed;

import java.awt.Color;

import javax.swing.*;

import java.awt.event.*;

public class swing1 {
	static boolean visibility = true;
	static boolean disable = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		/*ImageIcon icn = new ImageIcon(F:\press.png);
		Image img = icon.getImage();
		Image new_img = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		Icon btnIcn = new ImageIcon(new_img);*/
		
		JLabel lbl = new JLabel("Hello Wing UI");
		lbl.setBounds(180, 20, 100, 40);

		
		JButton clickBtn = new JButton("Click me!");
		clickBtn.setBounds(100, 100, 90, 40);
		clickBtn.setBackground(Color.decode("#C0C0C0"));
		
		
		JButton pressBtn = new JButton("Press me!");
		pressBtn.setBounds(208, 100, 90, 40);
		
		JTextField txt = new JTextField();
		txt.setBounds(100, 55, 200, 30);
		
		JButton deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(208, 150, 90, 40);
		
		JButton disableBtn = new JButton("Disable");
		disableBtn.setBounds(100, 200, 90, 40);
		
		JButton editableBtn = new JButton("Edit");
		editableBtn.setBounds(208, 200, 90, 40);
		
		JButton hideShowBtn = new JButton("Hide/Show");
		hideShowBtn.setBounds(100, 150, 90, 40);
		
		frame.add(lbl);
		frame.add(clickBtn);
		frame.add(pressBtn);
		frame.add(txt);
		frame.add(deleteBtn);
		frame.add(disableBtn);
		frame.add(editableBtn);
		frame.add(hideShowBtn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 500);
		frame.getContentPane().setBackground(Color.decode("#C0C0C0"));
		frame.setVisible(true);
		
		clickBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText(clickBtn.getText());
			}});
		
		pressBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText(pressBtn.getText());
			}});
		
		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txt.setText(null);
			}});
		
		hideShowBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (visibility) {
					visibility = false;
				} else {
					visibility = true;
				}
				lbl.setVisible(visibility);
			}});
		
		txt.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				lbl.setText(txt.getText());
			}});
		disableBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (txt.isEnabled()) {
					txt.setEnabled(false);
				} else {
					txt.setEnabled(true);
				}
			}});
		
		editableBtn.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(txt.isEditable()) {
					txt.setEditable(false);
				} else {
					txt.setEditable(true);
				}
			}});
		pressBtn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				pressBtn.setBackground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				pressBtn.setBackground(Color.decode("#CCE5FF"));
			}});
	}
}
