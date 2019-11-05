package basic;

import java.util.*;
import java.io.*;
import java.awt.*;

public class p2667 {
	static int n;
	static int[][] apart;
	static Stack<Integer> stack;
	static int apartnum;

	public static boolean isRange(int x, int y) {
		return (0 <= x && x < n) && (0 <= y && y < n);
	}

	public static void bfs(int a, int b) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(a, b));
		
		if(apart[a][b] == 1) {
			apartnum++;
			apart[a][b] = 0;
		}

		int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };
		while (!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.poll().y;
			for (int i = 0; i < 4; i++) {
				int ax = x + dx[i];
				int ay = y + dy[i];
				if(isRange(ax,ay) && apart[ax][ay] != 0) {
					q.offer(new Point(ax,ay));
					apartnum++;
					apart[ax][ay] = 0;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		apart = new int[n][n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				int a = Integer.parseInt(s.substring(j, j + 1));
				apart[i][j] = a;
			}
		}

		stack = new Stack<>();
		apartnum = 0;
		int danzi = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(apart[i][j] != 0) {
					bfs(i,j);
					stack.push(apartnum);
					danzi++;
					apartnum = 0;
				}
			}
		}
		
		int[] result = new int[stack.size()];
		for(int i=0; i<result.length; i++) {
			result[i] = stack.pop();
		}
		Arrays.sort(result);
		
		System.out.println(danzi);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}

		br.close();
	}
}
