package chap01;

// 중앙값은 다음과 같은 메서드로도 구할 수 있으나 효율이 떨어진다.
// 이유: b >= a 도 확인하고 a >= b 도 확인하므로,
// 실질적으로 동일한 판단이 계속된다.
public class med3x {

	static int med3(int a, int b, int c) {
		
		// b >= a >= c 또는 c >= a >= b 인 경우
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		
		// a > b > c 또는 c > b > a 인 경우
		else if ((a > b && b > c) || (c > b && b > a))
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
