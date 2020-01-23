package bas;

import java.util.*;

public class p1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			int len = Integer.toString(i).length();
			if(len<=2)
				ans++;
			else {
				int n1 = Integer.parseInt(Integer.toString(i).substring(0,1));
				int n2 = Integer.parseInt(Integer.toString(i).substring(1,2));
				int n3 = Integer.parseInt(Integer.toString(i).substring(2,3));
				
				if(n2-n1 == n3-n2) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
}
