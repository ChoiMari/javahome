package com.itwill.switch02;

import java.util.Random;

public class SwitchMain02 {

	public static void main(String[] args) {
		 // Random 타입의 변수를 선언하고, 초기화.
		Random random = new Random();
		 // 정수 타입의 변수에 1부터 4까지의 정수 난수 1개를 저장.
		int code = random.nextInt(1,5);
		System.out.println("code : " + code);
		// code라고 하는 정수가 1또는 3이면 "남성" 2또는 4이면 "여성" 이라고 출력하기.
		// if문 사용
//		if(code == 1 || code == 3) {
//			System.out.println("남성");
//		} else {
//			System.out.println("여성");
//		}
		// switch - case 사용
		switch(code) {
		case 1 :
		case 3 :
			System.out.println("남성");
			break;
		case 2 :
		case 4 :
			System.out.println("여성");
		}
		// 삼항 연산자 사용
//		String gender = (code == 1 || code == 3) ? "남성" : "여성";
//		System.out.println(gender);
	}

}
