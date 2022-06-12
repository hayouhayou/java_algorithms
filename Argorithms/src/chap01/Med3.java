package chap01;
// Q4 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
 class Med3 {
	 static int med3(int a, int b, int c) {
		
		 // a 와 b 의 크기는 이미 정해졌으므로
		 // 이중 if문을 사용하여 c의 값을 a 또는 b와 비교
		 if ( a >= b ) 
			 if (b >= c)
				 return b;
			 else if (a <= c)
			 	 return a;
			 else
			 	return c;
		 
		 // 이미 a < b
		 // a = c 또는 b = c 의 경우는 위에서 다뤄줬기 때문에
		 // 아래에서는 생략
		 
		 else if (a > c)
			 return a;
		 else if (b > c)
			 return c;
		 else
			 return b;
		 
	 }
	 
	 
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
		
	}

}
