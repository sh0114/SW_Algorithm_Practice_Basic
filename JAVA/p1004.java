package basic;

import java.util.*;
import java.io.*;

public class p1004 {
	
	public static boolean check(int x1, int y1, int x2, int y2, int r) {
		int x_diff = x1-x2;
		int y_diff = y1-y2;
		int diff = x_diff*x_diff + y_diff*y_diff;
		if(diff<r*r) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for(int i = 0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				boolean c1 = check(x1,y1,cx,cy,r);
				boolean c2 = check(x2,y2,cx,cy,r);
				if(c1&&c2) {
					continue;
				}else if(c1 || c2) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		br.close();
	}
}
