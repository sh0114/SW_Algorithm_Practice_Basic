package basic;

import java.util.*;
import java.io.*;

public class p1267 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		long y = 0;
		long m = 0;

		// int[] times = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			long t = Integer.parseInt(st.nextToken());
			long yc = t / 30;

			y += (yc + 1) * 10;

			long mc = t / 60;

			m += (mc + 1) * 15;

		}

		if (m > y) {
			System.out.println("Y " + y);
		} else if (m < y) {
			System.out.println("M " + m);
		} else {
			System.out.println("Y M " + y);
		}

		br.close();
	}
}
