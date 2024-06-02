package com.itwill.variable02;

public class VariableMain02 {

	public static void main(String[] args) {
		//정수를 저장하는 변수x를 선언하고
		//값을 저장하세요.(초기화) 한 문장으로
		int x = 11;
		//정수를 저장하는 변수 y를 선언하고
		//값을 저장하세요(초기화) 한 문장으로
		int y = 1;
		//두 변수 x와 y의 사칙연산(더하기 +, 빼기 -, 곱하기 *, 나누기 /) 
		//결과를 각각 출력 4문장으로 4칙연산이니까.
		System.out.println("x + y =" + (x + y));
		System.out.printf("%d + %d = %d\n",x,y,(x+y));
		System.out.println("x - y = " + (x - y));
		System.out.printf("%d - %d = %d\n",x,y,(x-y));
		System.out.println("x * y = " + (x * y));
		System.out.printf("%d * %d = %d\n",x,y,(x*y));
		y = 8;
		System.out.printf("%d / %d = %d\n",x,y,(x / y));
		System.out.println("나눈 나머지 = " + (x % y));
		System.out.println("x / y = " + (double)x/y);
		System.out.printf("%d / %d = %f\n",x,y,(double)x/y);
		double division = (double)x / y;
		System.out.println("x / y = " + division);
		System.out.printf("%d / %d = %f\n",x,y,division);
	
	}

}
