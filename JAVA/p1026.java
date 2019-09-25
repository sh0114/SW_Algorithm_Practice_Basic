import java.util.*;

public class p1026 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i< n;i++) {
			a[i] = s.nextInt();
		}
		
		for(int i=0; i< n;i++) {
			b[i] = s.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int result = 0;


		for(int i=0; i<n; i++) {
			result += a[i]*b[n-i-1];
		}
		
		System.out.println(result);
		s.close();
	}
}
