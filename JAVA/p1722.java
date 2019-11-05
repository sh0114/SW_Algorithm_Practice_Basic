package basic;
import java.util.*;
import java.io.*;
public class p1722 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		boolean[] chk = new boolean[n+1];
		
		long[] fac = new long[n+1];
		fac[0] = 1;
		for(int i=1; i<=n;i++) {
			fac[i] = fac[i-1]*i;
		}
		
		if(num==1) {
			long k = Long.parseLong(st.nextToken());	
			int[] res = new int[n+1];
			for(int i=1; i<=n;i++) {
				for(int j=1; j<=n; j++) {
					if(chk[j]) continue;
					if(fac[n-i] < k)
						k -= fac[n-i];
					else {
						res[i] = j;
						chk[j] = true;
						break;
					}
				}
			}
			for(int i=1; i<=n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}else {
			int [] arr = new int[n+1];
			long count = 1;
			for(int i=1; i<=n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=1; i<=n;i++) {
				for(int j=1; j<arr[i]; j++) {
					if(!chk[j])
						count += fac[n-i];
				}
				chk[arr[i]] = true;
			}
			System.out.println(count);
			
		}
		
		br.close();
	}
}
