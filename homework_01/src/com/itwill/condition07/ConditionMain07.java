package com.itwill.condition07;

import java.util.Random;

public class ConditionMain07 {

	public static void main(String[] args) {
		// 조건문, 비교연산자, 논리연산자 연습.
		// 0 이상 101 미만의 정수 난수를 저장.
		Random  random = new Random();
		int java = random.nextInt(101);
		int sql = random.nextInt(101);
		int javaScript = random.nextInt(101);
		System.out.printf("Java 점수 = %d , sql 점수 = %d , JavaScript 점수 = %d\n"
				,java,sql,javaScript);
		// 세 과목이 모두 40점 이상이고, 평균이 60점 이상이면 "합격", 
		int total = java + sql + javaScript;
		double mean = (double) total/ 3;
		System.out.println("총점 : " + total + "\n평균 : " + mean);
		// 그렇지 않으면 "불합격"을 출력
		String result = (java >=40 && sql>=40 && javaScript >=40 && mean >=60) ? "합격" : "불합격";
		System.out.println("결과 : " + result);
	}

}


