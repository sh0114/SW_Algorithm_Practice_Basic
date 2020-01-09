import java.util.*;

public class p1003 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			long[] arr0 = new long[n+1];
			long[] arr1 = new long[n+1];
			long[] fibo = new long[n+1];
			
			if(n==0) {
				arr0[0] = 1;
				arr1[0] = 0;
			}else if(n==1) {
				arr0[0] = 0;
				arr1[1] = 1;
			}else {
			
				arr0[0] = 1;
				arr1[1] = 1;
				fibo[1] = 1;
				
				for(int i=2; i<=n; i++) {
					fibo[i] = fibo[i-1]+fibo[i-2];
					arr0[i] = arr0[i-1]+arr0[i-2];
					arr1[i] = arr1[i-1]+arr1[i-2];
				}
			}
			
			System.out.println(arr0[n] + " " + arr1[n]);
		}
		sc.close();
	}
}
