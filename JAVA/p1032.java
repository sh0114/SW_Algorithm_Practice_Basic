package basic;
import java.util.*;

public class p1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] filename = new char[n][51];
		int len = 0;
		for(int i=0; i<n; i++) {
			String a = sc.next();
			len = a.length();
			for(int j=0; j<a.length(); j++) {
				filename[i][j] = a.charAt(j);
			}
		}
		
		char[] pattern = new char[len];
		for(int i=0; i<len; i++) {
			pattern[i] = filename[0][i];
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<len; j++) {
				if(pattern[j] != filename[i][j]) {
					pattern[j] = '?';
				}
			}
		}
		for(int i=0; i<len; i++) {
			System.out.print(pattern[i]);
		}
		System.out.println();
		
		sc.close();
	}
}
