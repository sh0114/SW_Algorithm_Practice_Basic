package basic;

import java.util.*;
import java.awt.*;

public class p9663 {
	static int n;
	static int count;
	
	public static void nq(int[] s, int row) {
		if(row == n) {
			count++;
		}else {
			for(int i=1; i<=n; i++) {
				s[row+1] = i;
				if(check(s,row+1)) {
					nq(s,row+1);
				}
			}
		}
	}
	public static boolean check(int[] s, int row) {
		for(int i=1; i<row; i++) {
			if(s[row] == s[i])
				return false;
			if(Math.abs(row-i) == Math.abs(s[row]-s[i])) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		count = 0;
		for(int i=1; i<=n; i++) {
			int[] s = new int[n + 1];
			s[1] = i;
			nq(s,1);
		}
		System.out.println(count);
		sc.close();
	}
}
