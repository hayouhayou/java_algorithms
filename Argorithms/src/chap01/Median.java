package chap01;
import java.util.Scanner;
class Median { 
	//실습 1C-1: 세 정수의 중앙값을 구한다.
	//실수 : Class Median을 두번 작성

	static int med3(int a, int b, int c) {
		if(a >= b) 
			if(b >= c)                //a >= b >= c
				return b;
			else if (a <= c)          //c >= a >= b
				return a;
			else
				return c;
		
		//아래서는 a < b 인 경우
		else if(a > c)
			return a;                 //c < a < b 
		else if(b > c)
			return c;                  //a < c < b 
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		
	}

}
