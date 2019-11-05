package basic;
import java.util.*;
import java.io.*;
public class p2004 {
	
	public static long count2(long n) {
		long ans = 0;
		for(long i=2; i<=n; i*=2) {
			ans += n/i;
		}
		return ans;
	}
	
	public static long count5(long n) {
		long ans = 0;
		for(long i=5; i<=n; i*=5) {
			ans += n/i;
		}
		return ans;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long cn2 = count2(n);
		long cn5 = count5(n);

		long cn_m2 = count2(n-m);
		long cn_m5 = count5(n-m);


		long cm2 = count2(m);
		long cm5 = count5(m);
		
		long c2 = cn2 - cn_m2 - cm2;
		long c5 = cn5 - cn_m5 - cm5;
		
		if(c2 <= c5)
			System.out.println(c2);
		else
			System.out.println(c5);
		br.close();
	}
}
