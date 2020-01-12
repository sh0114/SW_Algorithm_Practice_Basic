package basic;

import java.util.*;

public class p11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int cnt = 1;
		while(tc-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			System.out.println("Case #" + cnt +": " + sum);
			cnt++;
		}
		
		sc.close();
	}
}
