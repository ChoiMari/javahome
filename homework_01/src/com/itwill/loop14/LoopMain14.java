package com.itwill.loop14;

import java.util.Scanner;

public class LoopMain14 {

	public static void main(String[] args) {
		// 교재 연습문제7
		boolean run = true; 
		int balance = 0; //은행 잔고, 마이너스 통장도 가능하다고 생각
		Scanner scanner = new Scanner(System.in);
		//int i = scanner.nextInt();
		while(run) { // while값 조건 run이 true여서 무한 루프. 종료 원할 때는 변수 run값을 false로 변경해준다.
			System.out.println("-----------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			int i = scanner.nextInt(); // 콘솔에 입력한 값을 i에 저장
			 
			switch (i) {
			case 1 : // 콘솔에 입력한 i값이 1일 때
				//예금금액?
				System.out.print("예금액> ");
				int s = scanner.nextInt(); // 콘솔에 입력한 값을 변수 s에 저장(예금액)
				balance = balance + s; // 은행잔고 + 예금액을 은행잔고에 저장
				System.out.println(s + "원이 예금 되었습니다."); //예금액 출력
				break; // switch{} 빠져나오고 다시 while실행
			case 2 : // 콘솔에 입력한 i값이 2일 때
				// 얼마 출금? 기다렸다가 입력하면 출금액 나오게.은행잔고 변경되게.
				System.out.print("출금액> ");
				int w = scanner.nextInt(); // 콘솔에 입력한 값을 변수 w에 저장(출금액)
				balance = balance - w; // 은행잔고 - 출금액을 은행잔고에 저장
				System.out.println(w + "원이 출금 되었습니다."); //출금액 출력
				break; // switch{} 빠져나오고 다시 while실행
			case 3 : // 콘솔에 입력한 i값이 3일 때
				System.out.print("잔고> ");
				System.out.println(balance+"원"); //은행잔고
				break; // switch{} 빠져나오고 다시 while실행
			case 4 : // 콘솔에 4를 입력할 때의 실행코드 인덱스.
				System.out.println("이용해 주셔서 감사합니다.\n"); // 종료시 문구
				run = false; //while조건을 false로 변경해서 더이상 반복 실행 되지 않도록
							//반복문 while을 종료시킴. ==> 48번 코드 실행됨
			}
			
			
		}
		System.out.println("프로그램 종료"); //반복문 while 끝나면 나오는 문구
	}

}