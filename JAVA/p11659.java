import java.util.*;

public class p11659 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[] nums = new int[100001];
		int[] sums = new int[100001];
		
		for(int i=1; i<= n ;i++) {
			nums[i] = s.nextInt();
			sums[i] = sums[i-1]+nums[i];
		}
		
		for(int i=0; i< m; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			int result = sums[y] - sums[x-1];
			System.out.println(result);
		}
		
			
		s.close();
	}
}
