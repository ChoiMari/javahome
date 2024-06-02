package com.itwill.switch01;

import java.util.Scanner;

public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("계절을 입력하세요 >> ");
			String season = scanner.nextLine();
			switch(season) {
				case "봄" :
					System.out.println("Spring");
					break;
				case "여름" :
					System.out.println("Summer");
					break;
				case "가을" :
					System.out.println("fall");
					break;
				case "겨울" :
					System.out.println("Winter");
					break;
				case "종료" : 
					System.out.println("프로그램이 종료됩니다.");
					run = false;
					break;
				default :
					System.out.println("몰라요~");
				
			} 
		}
	}

}
