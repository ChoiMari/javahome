package com.itwill.loop04;

public class LoopMain04 {

	public static void main(String[] args) {
        /* 369게임: 아래와 같이 출력하세요.
        1   2   *   4   5   *   7   8   *   10
        11  12  *   14  15  *   17  18  *   20
        21  22  *   24  25  *   27  28  *   *
        *   *   *   *   *   *   *   *   *   40
        41  42  *   44  45  *   47  48  *   50
        51  52  *   54  55  *   57  58  *   *
        *   *   *   *   *   *   *   *   *   70
        71  72  *   74  75  *   77  78  *   80
        81  82  *   84  85  *   87  88  *   *
        *   *   *   *   *   *   *   *   *   100
    */
		for(int i = 1;i <= 100;i++) {
			if (i % 3 == 0) {
				System.out.print("*\t");
				if (i % 10 == 0) {
					System.out.println();
				}
			} else if(i % 10 == 0) {
				System.out.print(i+"\n");
			} else {
			System.out.print(i+"\t");
			} 

		}

	}
}
