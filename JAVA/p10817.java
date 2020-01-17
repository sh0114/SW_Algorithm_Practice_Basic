import java.util.*;

public class p10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int answer = 0;
		if(a<=b && b<=c) {
			answer = b;
		}
		if(c<=b && b<=a) {
			answer = b;
		}
		if(b<=a && a<=c) {
			answer = a;
		}
		if(c<=a && a<=b) {
			answer = a;
		}
		
		if(b<=c && c<=a) {
			answer = c;
		}
		if(a<=c && c<=b) {
			answer = c;
		}
		System.out.println(answer);
		
		sc.close();
	}
}
