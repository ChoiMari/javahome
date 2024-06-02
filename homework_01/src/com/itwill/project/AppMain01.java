package com.itwill.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class AppMain01 {

	private JFrame frame;
	private JPanel panel;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_2;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain01 window = new AppMain01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Frog Pizza"); //창 타이틀 문구
		frame.setBounds(100, 100, 500, 500); // 프레임(x좌표,y좌표,가로,세로)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); //프레임 화면 스크린의 가운데 뜨게 함
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 55, 486, 408);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("불고기피자");
		lblNewLabel.setBounds(30, 22, 93, 43);
		panel.add(lblNewLabel);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 55, 486, 408);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("콜라");
		lblNewLabel_1.setBounds(50, 50, 52, 15);
		panel_2.add(lblNewLabel_1);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 55, 486, 408);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("기타");
		lblNewLabel_2.setBounds(0, 0, 52, 15);
		panel_3.add(lblNewLabel_2);
		
		btnNewButton = new JButton("피자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
			}
		});
		btnNewButton.setBounds(0, 0, 146, 55);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("음료");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel.setVisible(false);
				panel_3.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(148, 0, 146, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel.setVisible(false);
				panel_2.setVisible(false);
				
				
			}
		});
		btnNewButton_2.setBounds(294, 0, 146, 55);
		frame.getContentPane().add(btnNewButton_2);
		

		
		
		
	}
}
