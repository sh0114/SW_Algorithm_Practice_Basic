package basic;

import java.util.*;
import java.io.*;

public class p6603 {
	static Stack<Integer> stack;
	static int[] s;
	static int k;
	public static void sprint() {
		for(int i=0; i<stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
	}
	public static void comb(int n, int r, int i) {
		if(r == 0) {
			sprint();
		}else if(n==r) {
			for(int j=0; j<n; j++) {
				stack.push(s[i+j]);
			}
			sprint();
			for(int j=0; j<n; j++) {
				stack.pop();
			}
		}else {
			stack.push(s[i]);
			comb(n-1, r-1,i+1);
			stack.pop();
			comb(n-1,r,i+1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		stack = new Stack<>();
		while (true) {
			String[] input = br.readLine().split(" ");
			k = Integer.parseInt(input[0]);
			if(k == 0) {
				break;
			}
			s = new int[k];
			for (int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(input[i+1]);
			}
			comb(k,6,0);
			System.out.println();
			stack.clear();
		}
		br.close();
	}
}
