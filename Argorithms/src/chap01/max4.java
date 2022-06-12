package chap01;

import java.util.Scanner;

public class max4 {
	
	
	static int max4(int a, int b, int c, int d) {
		//메서드를 중괄호로 묶지 않음
	int max = a;
	if (b > max) max = b;
	if (c > max) max = c;
	if (d > max) max = d;
	
	return max;
}

	public static void main(String[] args) {
			
	
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, d;            
		//Main 함수에서 변수 선언 안함
		
		System.out.print("a= "); a = stdIn.nextInt(); 
		//a 내에 전달받은 값 입력 하는걸 print 안에 썻음
		System.out.print("b= "); b = stdIn.nextInt(); 
		System.out.print("c= "); c = stdIn.nextInt();
		System.out.print("d= "); d = stdIn.nextInt();
		
		int max = max4(a, b, c, d);     
		// Main 함수 안에서 max 선언 및 메서드 사용 안함
		System.out.println("네 정수의 최대값은 " + max + "입니다.");
		
		
		
	}
}


