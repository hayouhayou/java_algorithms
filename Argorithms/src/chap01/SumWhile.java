package chap01;
import java.util.Scanner;
public class SumWhile {
   //1부터 n까지의 정수 합을 구하는 알고리즘

   public static void main(String[] args) {
      Scanner stdln = new Scanner(System.in);
      
      System.out.println("1부터 n까지의 정수 합을 구합니다.");
      System.out.print("n의 값: ");
      int n = stdln.nextInt();
      
      int sum = 0;
      int i = 0;
      while(i <= n) {
         sum += i;
         i++;
      }
      System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
   }

}