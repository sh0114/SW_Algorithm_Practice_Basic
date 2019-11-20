package basic;

import java.util.*;
import java.io.*;

public class p1331 {

	static boolean visit[][] = new boolean[7][7];
	static String a,startA;
	static int x,y, px,py;
	static int input[][] = new int[37][3];
	
	static int dx[] = {1,2,2,1,-1,-2,-2,-1};
	static int dy[] = {2,1,-1,-2,-2,-1,1,2};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<36; i++) {
			String a = br.readLine();
		x = a.charAt(0)-'A';
		y = a.charAt(1)-'1';
		input[i][0]=x;
		input[i][1]=y;
		if(i>0) {
			px = input[i-1][0];
			py = input[i-1][1];
		}
			if(visit[x][y])break;
			visit[x][y]=true;
			
			boolean case3 = false;
			for(int j=0; j<8; j++) {
				int nx = px +dx[j];
				int ny = py +dy[j];
			
			if(nx<0 || nx>5 || ny<0 || ny>5)continue;
			if(nx==x && ny==y)case3=true;
			}
			if(!case3 && i!=0)break;
		}
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(!visit[i][j]) {
						bw.write(String.valueOf("Invalid"));
						bw.flush();
						System.exit(0);
					}
				}
			}
			
			boolean case4 = false;
			for(int j=0; j<8; j++) {
				int nx = input[0][0] +dx[j];
				int ny = input[0][1] +dy[j];
				if(nx<0 || nx>5 || ny<0 || ny>5)continue;
				if(nx==input[35][0] && ny == input[35][1])case4=true;
			}
			if(!case4) {
				bw.write(String.valueOf("Invalid"));
				bw.flush();
				System.exit(0);
			}
			
		bw.write(String.valueOf("Valid"));
		bw.flush();
		}
}

/*
 * 
import java.util.*;

public class Main {

	public static int alphatoindex(char a) {
		int index = -1;
		switch (a) {
		case 'A':
			index = 0;
			break;
		case 'B':
			index = 1;
			break;
		case 'C':
			index = 2;
			break;
		case 'D':
			index = 3;
			break;
		case 'E':
			index = 4;
			break;
		case 'F':
			index = 5;
			break;
		}
		return index;
	}

	public static boolean ismove(int x1, int y1, int x2, int y2) {
		int diff_x = Math.abs(x1 - x2);
		int diff_y = Math.abs(y1 - y2);
		
		boolean c1 = (diff_x == 2 && diff_y == 1);
		boolean c2 = (diff_x == 1 && diff_y == 2);

		return c1 || c2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String before = sc.next();
		String first = before;
		String current = "";

		boolean chk = true;
		boolean[][] isvisit = new boolean[6][6];


		for (int i = 1; i < 36; i++) {
			current = sc.next();
			int b_alpha = alphatoindex(before.charAt(0));
			int c_alpha = alphatoindex(current.charAt(0));
			int b_num = Integer.parseInt(before.substring(1, 2)) - 1;
			int c_num = Integer.parseInt(current.substring(1, 2)) - 1;

			before = current;
			isvisit[b_num][b_alpha] = true;

			if (ismove(b_num, b_alpha, c_num, c_alpha)) {
				if(isvisit[c_num][c_alpha]) {
					chk = false;
				}
					
			}else {
				chk = false;
			}
		}

		String result = "";

		int f_alpha = alphatoindex(first.charAt(0));
		int f_num = Integer.parseInt(first.substring(1, 2)) - 1;
		int c_alpha = alphatoindex(current.charAt(0));
		int c_num = Integer.parseInt(current.substring(1, 2)) - 1;

		
		if (chk) {
			if(ismove(f_num, f_alpha, c_num, c_alpha)) {
				result = "Valid";
			}else {
				result = "Invaild";
			}
		} else {
			result = "Invaild";
		}

		System.out.println(result);
		sc.close();
	}
}

 * */
