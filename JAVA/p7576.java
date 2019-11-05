package basic;

import java.util.*;
import java.io.*;
import java.awt.*;

public class p7576 {
	static int m, n;
	static int[][] tomato;
	static boolean[][] isvisit;
	static Queue<Point> q;
	static int day;

	public static boolean isRange(int a, int b) {
		return (0<=a&&a<n) && (0<=b && b<m);
	}
	
	public static void bfs() {
		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { 1, -1, 0, 0 };
		int nexttomato = 0;
		int currenttomato = q.size();
		int cnt = 0;
		while (!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.poll().y;

			if(cnt == currenttomato) {
				cnt = 0;
				currenttomato = nexttomato;
				nexttomato = 0;
				day++;
			}

			
			for (int i = 0; i < 4; i++) {
				int ax = x + dx[i];
				int ay = y + dy[i];
				if(isRange(ax,ay)) {
					if(tomato[ax][ay] == -1) {
						isvisit[ax][ay] = true;
						continue;
					}
					else if(tomato[ax][ay] == 0) {
						nexttomato++;
						q.offer(new Point(ax,ay));
						tomato[ax][ay] = 1;
						isvisit[ax][ay] = true;
					}
				}
			}
			cnt++;
		}
	}
	
	public static boolean check() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(tomato[i][j] == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		m = Integer.parseInt(input[0]);
		n = Integer.parseInt(input[1]);

		q = new LinkedList<>();
		tomato = new int[n][m];
		isvisit = new boolean[n][m];
		day = 0;

		
		for(int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			for(int j=0; j<m;j++) {
				tomato[i][j] = Integer.parseInt(input[j]);
				if(tomato[i][j] == 1) {
					q.offer(new Point(i,j));
				}
			}
		}
		
		if(q.size() == n*m) {
			System.out.println(0);
		}else if(q.isEmpty()) {
			System.out.println(-1);
		}else {
			bfs();
			if(check()) {
				System.out.println(day);
			}else {
				System.out.println(-1);
			}
		}
		

		br.close();
	}
}
