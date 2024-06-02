package com.itwill.condition02;

import java.util.Scanner;

public class ConditionMain02 {

	public static void main(String[] args) throws Exception{
		// 콘솔 창에서 정수 1개를 입력 받고, int 타입 변수에 저장
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		// if 만약 입력 받은 정수가 0보다 크면, 화면에 “positive”라고 출력하기
		while(run) {
			System.out.print("계절 입력 >> ");
			String a = sc.nextLine();
			
			switch(a) {
			case "봄" :
				System.out.println("벚꽃이 피었어요");
				break;
			case "여름" : 
				System.out.println("수박을 먹어요");
				break;
			case "가을" :
				System.out.println("단풍이 떨어져요");
				break;
			case "겨울" : 
				System.out.println("눈이 내리네요");
				break;
			case "종료" :
				System.out.println("프로그램이 종료 됩니다.");
				run = false;
				break;
			default :
				System.out.println("다시 입력해 주세요.");
				
			}
			
		}
		// else if 그렇지 않고 0이면 (0은 양수도 아니고 음수도 아님) “zero” 라고 출력

		//else 그렇지 않으면(음수면), “negative”라고 출력.
	}

}
