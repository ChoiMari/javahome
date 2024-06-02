package com.itwill.project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); //JFrame 객체 생성
		JPanel panel = new JPanel(); //JPanel 객체 생성
		JLabel label = new JLabel("안녕"); //JLabel 객체 생성
		JButton but1 = new JButton("클릭");//JButton 객체 생성
		JButton but2 = new JButton("종료");//버튼1개 더 만듬.
		JTextArea textArea = new JTextArea();//한 줄 이상의 여러 줄(text)넣을 때 사용. 많은 양의 글자를 쓸 때 사용.
		JTextField textField = new JTextField();//한 줄 정도의 글자(text)넣을 때 사용 ()안에 글자 크기 설정
		
		JPanel btnPanel = new JPanel();//버튼 집어넣을 용도로 쓰려고 패널 1개 더 만듬.
		
		panel.setLayout(new BorderLayout());//판넬 레이아웃을 borderlayout으로 설정
		panel.add(label,BorderLayout.NORTH); // 라벨객체를 BorderLayout의 NORTH으로 판넬에 추가함.
		
		btnPanel.add(but1);//판넬에 버튼1을 추가함(집어넣음). 클릭버튼
		btnPanel.add(but2);//판넬에 버튼 2를 추가함.종료버튼
		//panel.add(new JLabel("id")); //패널에 라벨을 만들어서 집어 넣음 라벨 문구 id
		//panel.add(but1,BorderLayout.WEST);//버튼1(but1)을 볼더레이아웃의 west위치로 판넬에 추가함.
		//-> 왼쪽에 버튼 대신에 버튼들을 집어 넣을 용도로 쓸 추가로 만들었던 패널을 집어 넣음
		panel.add(btnPanel,BorderLayout.WEST);//판넬을 BorderLayout의 WEST 위치로 판넬에 추가함.
		
		
		panel.add(textArea,BorderLayout.CENTER);//textArea를 볼더레이아웃의 가운데 위치로 판넬에 추가함
		
		frame.add(panel);// 프레임안에 패널을 집어넣음
		
		//버튼"클릭"에 기능을 추가 - 클릭버튼을 클릭했을 때 실행되는 코드.
		but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//textArea.append("안녕하세요 ^____^ \n");//텍스트에리아에 글을 추가
				//클릭버튼을 누르면 텍스트에리아에 안녕하세요 ^____^가 써짐.//클릭할 때마다 계속 추가되서 나옴
				
				label.setText(textArea.getText());//textArea에 써진 글씨를 getText():써진글씨 읽어서 리턴해주는 메서드?
				//읽어와서 label에 setText보여지게 함. JLabel클래스에 있는 setText메서드호출. 
				
				
			}
		});
		
		//"종료"버튼 클릭시 실행되는 코드
		but2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// 프로그램이 종료되어서 창이 꺼짐.
				
			}
		});
		
		frame.setVisible(true);//만든 JFrame객체를 setVisible -> true 보이게 하겠다.
		//false를 아규먼트로 주면 실행해도 볼 수 없음
		
		frame.setResizable(false);// 프레임 크기 조절 못하게 설정.//아규먼트로 true를 주면 조절가능.
		
		//frame.setPreferredSize(new Dimension(800,400));//프레임 크기 설정 Dimension(가로,세로)
		frame.setSize(500,500);//setSize(가로,세로) 메서드 프레임 크기 설정
		
		frame.setLocationRelativeTo(null);//어떤 위치에서 화면을 출력할 것인지 설정하는 메서드
		//아규먼트로 null-> 실행시 프레임이 스크린화면 가운데 뜨도록 설정. 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임을 닫았을때 프로그램이 어떻게 작동할건지 설정
		//EXIT_ON_CLOSE : 프로그램을 껐을 때(창의 x 버튼을 눌렀을 때) 모든게 종료되게 설정
		
	}

}
