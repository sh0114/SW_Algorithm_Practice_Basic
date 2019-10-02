package basic;

import java.util.*;

public class p2846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n+1];
		ArrayList<Integer> uphill = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		int i = 0;
		int j = 1;
		int chk = 1;
		while (j < n) {
			
			for (; j < n; j++) {
				if(height[i]>=height[j]) {
					chk = -1;
					break;
				}
				if (height[i]<height[j] && height[j] >=height[j+1]) {
					chk = 1;
					break;
				}
			}
			
			if(chk>0) {
				uphill.add(height[j] - height[i]);
			}
	
			i = j;
			j++;
		}
		int max = 0;

		if (uphill.size() > 0) {
			for (int k = 0; k < uphill.size(); k++) {
				if (max < uphill.get(k))
					max = uphill.get(k);
			}
			System.out.println(max);
		} else {
			System.out.println(0);
		}
		sc.close();
	}
}
