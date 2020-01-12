package basic;

import java.util.*;

public class p10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = a+b;
			System.out.println(sum);
		}
		
		sc.close();
	}
}
