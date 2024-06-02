package com.itwill.condition06;

public class ConditionMain06 {

	public static void main(String[] args) {
		// 삼항 연산자 연습
		// 1. number 변수가 짝수인지, 홀수인지를 검사해 보고 저장하는 변수 evenOrOdd:
		int number = 121;
		String evenOrOdd = (number % 2 == 0)? "짝수" : "홀수";
		System.out.println(evenOrOdd);
		// 2. 주민번호 뒷자리 첫 시작 번호 성별.
		int genderCode = 1;
		// genderCode 변수의 값이 1 또는 3이면 "남성", 그렇지 않으면 "여성" 이라고 하는 문자열 저장.
		// 그래서 출력 해보기
		String gender = (genderCode == 1 || genderCode == 3) ? "남성" : "여성";
		System.out.println(gender);
		
		String evenOrOdd2;
		if(number % 2 == 0) {
			evenOrOdd2 = "짝수";
			System.out.println("짝수");
		} else {
			evenOrOdd2 = "홀수";
			System.out.println("홀수");
		}
	}

}
