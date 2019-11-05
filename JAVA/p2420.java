package basic;
import java.util.*;
import java.io.*;
public class p2420 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long sub = Math.abs(n-m);
		System.out.println(sub);
		br.close();
	}
}
