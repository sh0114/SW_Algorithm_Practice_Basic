package basic;

import java.util.*;

public class p11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		for(int i=0; i<len; i++) {
			int n = Integer.parseInt(num.substring(i,i+1));
			sum += n;
		}
		System.out.println(sum);
		sc.close();
	}
}
