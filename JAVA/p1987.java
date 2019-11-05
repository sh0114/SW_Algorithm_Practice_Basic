package basic;

import java.util.*;
import java.io.*;

public class p1987 {
	static int[][] board;
	static int r, c;
	static int maxcount;
	static int[] s;
	static boolean[][] isVisit;

	public static boolean isRange(int a, int b) {
		return (1 <= a && a <= r) && (1 <= b && b <= c);
	}

	public static boolean check(int w, int cnt) {
//		if (cnt == 1) {
//			return true;
//		}
//		System.out.println("---stack=");
//		for(int i=0; i<s.size(); i++) {
//			System.out.println(s.get(i));
//		}
		for (int i = 0; i < cnt; i++) {
			if (s[i] == w)
				return false;
		}
		return true;
	}

	public static void dfs(int a, int b, int cnt) {
//		System.out.println("--dfs--");
//		System.out.println(a+" " + b + " " + cnt);

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { 1, -1, 0, 0 };

		s[cnt-1] = board[a][b];
		isVisit[a][b] = true;
		for (int i = 0; i < 4; i++) {
			int x = a + dx[i];
			int y = b + dy[i];
			if (isRange(x, y) && !isVisit[x][y]) {
				if(check(board[x][y],cnt))
					dfs(x, y, cnt + 1);
			}
		}
		isVisit[a][b] = false;
		s[cnt-1] = '\n';
//		System.out.println("--finish--");
//		System.out.println(cnt);
		if(maxcount < cnt) {
			maxcount = cnt;
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		board = new int[r + 1][c + 1];
		isVisit = new boolean[r+1][c+1];
		
		for (int i = 1; i <= r; i++) {
			String s = br.readLine();
			for (int j = 1; j <= c; j++) {
				board[i][j] = s.charAt(j-1) -'A' +1;
			}
		}

		s = new int[r*c];
		maxcount = 1;
		dfs(1, 1, 1);
		System.out.println(maxcount);

		br.close();
	}
}
