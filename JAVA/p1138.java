package basic;

import java.util.*;

public class p1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] result = new int[n+1];
		for (int i = 1; i <= n; i++) {
			int height = sc.nextInt();

			for(int k=0; k<n; k++) {
				if(height == 0 && result[k]==0) {
					result[k] = i;
					break;
				}else if(result[k] == 0) {
					height--;
				}

			}

		}

		for(int i=0; i<n-1; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
		System.out.print(result[n-1]);
		System.out.println();

		sc.close();
	}
}
