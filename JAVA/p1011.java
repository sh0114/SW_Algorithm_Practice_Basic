package basic;

import java.util.*;
import java.io.*;

public class p1011 {
	public static long func(int diff) {
		long pow, min, max, count;
		for(long i = 1;; i++) {
			pow = i*i;
			min = pow-i+1;
			max = pow+i;
			if(min <= diff && diff <= max) {
				if(min <= diff && diff <= pow) {
					count = 2*i -1;
				}else {
					count = 2*i;
				}
				return count;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		while (tc-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int diff = y - x;
			
			System.out.println(func(diff));
		}

		br.close();
	}
}
