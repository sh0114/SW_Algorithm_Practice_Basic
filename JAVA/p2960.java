package bas;

import java.util.*;

public class p2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] arr = new boolean[n+1];
		for(int i=2; i<=n; i++){
			arr[i] = true;
		}
		
		int cnt = 0;
		int answer = 0;
		for(int i=2; i<=n; i++) {
			for(int j=i; j<=n; j += i) {
				if(!arr[j]) continue;
				arr[j] = false;
				cnt++;
				if(cnt==k) {
					answer = j;
					break;
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
