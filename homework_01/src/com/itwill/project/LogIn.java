package com.itwill.project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame{
	
	public LogIn() {//기본생성자
		JPanel panel = new JPanel();//판넬만듬
		JLabel laberId = new JLabel("ID");
		JTextField txtId = new JTextField(10); //텍스트필드 10크기정도로 글자가 들어갈 수 있게 만듬(텍스트프레임 크기설정)
		JLabel laberPw = new JLabel("PASSWORD");
		JPasswordField passwordField = new JPasswordField(10);
		//JPasswordField -> 텍스트가 가려져서 보임. 크기12설정
		//텍스트필드에 적는 텍스트 내용이 암호화 되어서 보인다.
		JButton logInBtn = new JButton("로그인");
		
		panel.add(laberId);//판넬에 id라벨 집어넣음
		panel.add(txtId);//판넬에 id적을 텍스트필드 집어넣음
		panel.add(laberPw);
		panel.add(passwordField);//판넬에 패스워드필드 집어넣음
		panel.add(logInBtn);
		add(panel);//제이프레임에 판넬을 추가함.
		
		
		
		setVisible(true);//-> 만든 panel을 화면에 보이게 설정 - true
		setSize(500,500); //판넬의 가로,세로 크기 설정
		setLocationRelativeTo(null);//스크린화면 가운데에 판넬 띄움
		setResizable(false);//판넬 크기 조절 못하게 설정. - false
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창의 x버튼 클릭시 setDefaultCloseOperation메소드로 기능 설정
		//JFrame.EXIT_ON_CLOSE 프로그램 모두 종료되게 설정.
		
		//로그인 버튼 클릭시 실행되는 코드
		logInBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "mari";
				String password = "1234";
				
				//boolean resultId = txtId.getText().equals(id); 
				//boolean resultPassword = passwordField.getText().equals(password);
				boolean resultId = id.equals(txtId.getText());
				//boolean resultPassword = password.equals(passwordField.getPassword());
				boolean resultPassword = password.equals(new String(passwordField.getPassword()));
				//getpassword()메서드는 char[]타입으로 리턴값을 주기때문에 String타입으로 변환해서 비교함.
				//출처 : https://young0105.tistory.com/131
				
				if(resultId && resultPassword) {
						JOptionPane.showMessageDialog(null,"로그인에 성공 했습니다.", "로그인 성공", JOptionPane.PLAIN_MESSAGE);
				} else {
					if(resultId == false && resultPassword == true) {
						JOptionPane.showMessageDialog(null,"해당 아이디가 없습니다.", "로그인 실패", JOptionPane.NO_OPTION);
						return;
					} else if (resultId == true && resultPassword == false) {
						JOptionPane.showMessageDialog(null,"비밀번호가 틀렸습니다.", "로그인 실패", JOptionPane.NO_OPTION);
						return;
					} else {
						JOptionPane.showMessageDialog(null,"아이디와 비밀번호를 확인하세요", "로그인 실패", JOptionPane.NO_OPTION);
						return;
						}
					//System.out.println(resultId);
					//System.out.println(resultPassword);
					
					//return;
				}
				
				
			}
		});
		
	}

	public static void main(String[] args) {
		new LogIn(); // new로 객체생성(메모리의 heap영역에 띄우고)하면서 LogIn()기본생성자 호출. 기본생성자의 내부{}코드 실행됨

	}

}
