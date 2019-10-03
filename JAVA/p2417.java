package basic;
import java.util.*;
public class p2417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = (long)Math.sqrt(n);
		
		if(Math.pow(answer, 2) == n) {
			System.out.println((long)answer);
		}else {
			System.out.println((long)(answer+1));
		}
		sc.close();
	}
}
