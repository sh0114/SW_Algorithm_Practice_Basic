package basic;

import java.util.*;

public class p10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			int sum = a+b;
			System.out.println(sum);
		}
		
		sc.close();
	}
}
