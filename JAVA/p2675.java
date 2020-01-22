package basic;

import java.util.*;

public class p2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		while(tc-->0) {
			int r = sc.nextInt();
			String s = sc.next();
			String answer = "";
			for(int i=0; i<s.length(); i++) {
				String sub = s.substring(i,i+1);
				for(int j=0; j<r; j++) {
					answer = answer + sub;
				}
			}
			System.out.println(answer);
		}
		
		sc.close();
	}
}
