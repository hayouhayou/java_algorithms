package chap01;

import java.util.Scanner;

public class min3 {

	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		int a, b, c, d;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a 의 값: "); a = stdIn.nextInt();
		System.out.print("b 의 값: "); b = stdIn.nextInt();
		System.out.print("c 의 값: "); c = stdIn.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("세 정수의 최소값은 " + min + "입니다.");
		
	
	}
	}
