package bas;

import java.util.*;
import java.io.*;

public class p2824 {

	public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Integer> amap = new HashMap<>();
		HashMap<Integer, Integer> bmap = new HashMap<>();
		
	    int n = Integer.parseInt(br.readLine());

	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i = 0; i < n; i++) {

	        int a = Integer.parseInt(st.nextToken());

	        for (int j = 2; j * j <= a; j++) {

	            int cnt = 0;
	            while (a % j == 0) {

	                a /= j;
	                cnt++;
	            }

	            if (amap.containsKey(j)) {
	            	amap.put(j, amap.get(j) + cnt);
	            }else {
	            	amap.put(j, cnt);
	            }
	        }

	        if (a > 1) {

	            if (amap.containsKey(a)) {
	            	amap.put(a, amap.get(a) + 1);
	            }else {
	            	amap.put(a, 1);
	            }
	        }
	    }

	    int m = Integer.parseInt(br.readLine());

	    st = new StringTokenizer(br.readLine());
	    
	    for (int i = 0; i < m; i++) {

	        int b = Integer.parseInt(st.nextToken());

	        for (int j = 2; j * j <= b; j++) {

	            int cnt = 0;
	            while (b % j == 0) {

	                b /= j;
	                cnt++;
	            }

	            if (bmap.containsKey(j)) {
	            	bmap.put(j, bmap.get(j) + cnt);
	            }else {
	            	bmap.put(j, cnt);
	            }
	        }

	        if (b > 1) {

	            if (bmap.containsKey(b)) {
	            	bmap.put(b, bmap.get(b) + 1);
	            }else {
	            	bmap.put(b, 1);
	            }
	        }
	    }


	    long gcd = 1L;
	    boolean chk = false;

	    for (Integer key : amap.keySet()) {

	        if (!bmap.containsKey(key)) 
	        	continue;

	        int min = Math.min(amap.get(key), bmap.get(key));

	        for (int i = 0; i < min; i++) {

	            gcd *= key;

	            if (gcd > 1000000000) {

	                chk = true;
	                gcd %= 1000000000;
	            }
	        }
	    }

	    if (chk) {
	    	System.out.println(String.format("%09d", gcd));
	    }else {
	    	System.out.println(gcd);
	    }
	}
}
