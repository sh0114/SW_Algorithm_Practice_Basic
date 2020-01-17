import java.util.*;
import java.io.*;

public class p2884 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int ansh = 0, ansm = 0;
		if(m-45 >= 0) {
			ansh = h;
			ansm = m-45;
		}else {
			if(h-1 >=0) {
				ansh = h-1;
				ansm = 60 + m - 45;
			}else {
				ansh = 23;
				ansm = 60+m-45;
			}
		}
		
		System.out.println(ansh + " " + ansm);
		
		br.close();
	}
}
