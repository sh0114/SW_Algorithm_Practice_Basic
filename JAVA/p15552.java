package basic;

import java.util.*;
import java.io.*;

public class p15552 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-->0) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int ab = a+b;
			String sum = Integer.toString(ab);
			bw.append(sum);
			bw.append("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
