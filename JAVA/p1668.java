package basic;
import java.util.*;
public class p1668 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] trophy = new int[n];
		for(int i = 0; i<n; i++) {
			trophy[i] = sc.nextInt();
		}
		
		int left = 1;
		int right = 1;
		int height = trophy[0];
		for(int i=1; i<n;i++) {
			if(height < trophy[i]) {
				left++;
				height = trophy[i];
			}
		}
		height = trophy[n-1];
		for(int i=n-2; i>=0;i--) {
			if(height < trophy[i]) {
				right++;
				height = trophy[i];
			}
		}
		System.out.println(left);
		System.out.println(right);
		sc.close();
	}
}
