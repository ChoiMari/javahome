package com.itwill.condition03;

import java.util.Scanner;

public class ConditionMain03 {

	public static void main(String[] args) {
		// Scanner 타입의 변수를 선언,초기화
		Scanner sc = new Scanner(System.in);
		// 콘솔 창에서 Java 과목 점수를 입력받고 저장(정수) 0~100점 까지의 점수
		System.out.print("Java 과목 점수 >> ");
		int java = sc.nextInt();
		// 콘솔 창에서 SQL 과목 점수를 입력받고 저장(정수) 0~100점 까지의 점수
		System.out.print("SQL 과목 점수 >> ");
		int sql = sc.nextInt();
	  //콘솔 창에서 JavaScript 과목 점수를 입력받고 저장(정수) 0~100점 까지의 점수
		System.out.print("JavaScript 과목 점수 >> ");
		int javaScript = sc.nextInt();
		// 세 과목의 총점을 계산하고 출력(정수) 최대 300점
		int total = java + sql + javaScript;
		System.out.println("3과목의 총점 = " + total);
		//세 과목의 평균을 계산하고 출력(소수점 있는 실수). 소수점까지 계산하기
		//여기 까지 조건문 안 들어감
		double mean = (double) total/3;
		System.out.println("3과목의 평균 = " + mean);
		//세 과목 평균이 90점 이상이면, "A"라고 출력하기
		//세 과목 평균이 80점 이상이면, "B"라고 출력하기
		//세 과목 평균이 70점 이상이면, "C"라고 출력하기
		//세 과목 평균이 70점 미만이면, "F"라고 출력하기
		if(mean >= 90) {
			System.out.println("A");
		} else if(mean >= 80) {
			System.out.println("B");
		} else if(mean >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}

}
