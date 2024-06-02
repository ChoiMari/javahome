package com.itwill.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		 // 5 4 3 2 1 출력
		for(int i = 5;i >= 1;i--) {
			System.out.print(i + " ");
		} 
		System.out.println();
		// 0 2 4 6 8 10 출력
		for(int i = 0;i <= 10;i=i+2) { // i = 12일 때 더이상 조건에 만족하지 않으므로 반복 종료. for문 블록을 빠져나온다
			System.out.print(i + " ");
		}
		System.out.println();
		// 10 8 6 4 2 0 출력
		for(int i = 10;i >= 0; i-=2) { 
			// i-=2는 i=i-2의 뜻 i-2를 i에 저장시킨다는 의미. i값이 실행 될 수록 2씩 줄어듬.
			System.out.print(i + " ");
		} 
	}

}
