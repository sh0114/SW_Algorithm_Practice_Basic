package basic;
import java.util.*;
import java.io.*;
public class p1009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		while(tc-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int d = a%10;
			if(d ==1 || d ==5 || d == 6) {
				System.out.println(d);
			}else if(d == 0) {
				System.out.println(10);
			}else if(d == 2) {
				switch(b%4) {
				case 0:
					System.out.println(6);
					break;
				case 1:
					System.out.println(2);
					break;
				case 2:
					System.out.println(4);
					break;
				case 3:
					System.out.println(8);
					break;
				}
			}else if(d == 3) {
				switch(b%4) {
				case 0:
					System.out.println(1);
					break;
				case 1:
					System.out.println(3);
					break;
				case 2:
					System.out.println(9);
					break;
				case 3:
					System.out.println(7);
					break;
				}
			}else if(d == 7) {

				switch(b%4) {
				case 0:
					System.out.println(1);
					break;
				case 1:
					System.out.println(7);
					break;
				case 2:
					System.out.println(9);
					break;
				case 3:
					System.out.println(3);
					break;
				}
			}else if(d == 8) {

				switch(b%4) {
				case 0:
					System.out.println(6);
					break;
				case 1:
					System.out.println(8);
					break;
				case 2:
					System.out.println(4);
					break;
				case 3:
					System.out.println(2);
					break;
				}
			}else if(d == 4) {
				if(b%2 == 0) {
					System.out.println(6);
				}else {
					System.out.println(4);
				}
			}else if(d == 9) {
				if(b%2 == 0) {
					System.out.println(1);
				}else {
					System.out.println(9);
				}
			}
			
		}

		br.close();
	}
}
