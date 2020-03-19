package segtree;

import java.util.*;
import java.io.*;

public class p1242 {
	
	static int n, k, m;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int temp = n;
		
		while(n > 0) {
			int val = k%n;
			if(val == 0)
				val = n;
			n--;
			
			m-= val;
			
			if(m == 0) {
				cnt = temp - n;
				break;
			}else if(m < 0) {
				m+= n+1;
			}
		}
		System.out.println(cnt);
	}
}
