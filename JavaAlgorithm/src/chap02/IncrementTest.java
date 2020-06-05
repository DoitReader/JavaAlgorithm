package chap02;
import java.util.Scanner;


public class IncrementTest {

	public static void main(String[] args) {
		int a=3;
		int b=++a;
		
		int c=3;
		int d=c++;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a：" + a + "\n" + "b：" + b + "\n");
		System.out.print("c：" + c + "\n" + "d：" + d);
	}

}
