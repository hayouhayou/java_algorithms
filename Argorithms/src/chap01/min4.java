package chap01;
import java.util.Scanner;
public class min4 {
	
	static int Min4(int a, int b, int c, int d) {
		int min = a;
		if(a > b) min = b;
		if(b > c) min = c;
		if(c > d) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		
		Scanner stdln = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("a의 값: "); a = stdln.nextInt();
		System.out.println("b의 값: "); b = stdln.nextInt();
		System.out.println("c의 값: "); c = stdln.nextInt();
		System.out.println("d의 값: "); d = stdln.nextInt();
		
		int min = Min4(a, b, c, d);
		
		System.out.println("네 정수의 최소값은: " + min + "입니다.");
				
		
	}

}

//2022.05.30 틀린 부분 없음