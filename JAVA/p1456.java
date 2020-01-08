import java.util.*;
import java.io.*;

public class p1456 {
	
	static int[] num;
	
	public static void func() {
		//에라토스테네스의 체
		for(int i=2; i*i<10000005; i++) {
			for(int j=i*i; j<10000005; j += i) {
				num[j] = -1;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		
		num = new int[10000005];
		
		func();
		
		int count = 0;

		for(int i = 2; i<10000005; i++) {
			if(num[i]==0) {
				long n = i;
				
				while(i <= b/n) {
					if(n*i >= a)
						count++;
					n *= i;
				}
			}
		}
		System.out.println(count);

		
		br.close();
	}
}
