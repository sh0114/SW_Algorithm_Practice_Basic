package basic;

import java.util.*;
import java.io.*;
import java.awt.*;

public class p4963 {

	static int w, h;
	static int[][] map;
	static boolean[][] isvisit;

	public static boolean isRange(int x, int y) {
		return (0 <= x && x < h) && (0 <= y && y < w);
	}

	public static void bfs(int a, int b) {
		int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
		int[] dy = { 0, 0, -1, 1, 1, -1, 1, -1 };

		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(a, b));
		isvisit[a][b] = true;

		while (!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.poll().y;
			for (int i = 0; i < 8; i++) {
				int ax = x + dx[i];
				int ay = y + dy[i];
				
				if(isRange(ax,ay)) {
					if(map[ax][ay] == 1 && !isvisit[ax][ay]) {
		
						isvisit[ax][ay] = true;
						q.offer(new Point(ax,ay));
					}
				}

			}
		}
	}
	
	public static void mapprint() {
		System.out.println("map=====");
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.print(isvisit[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0) {
				break;
			}

			map = new int[h][w];
			isvisit = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] == 1 && !isvisit[i][j]) {
						bfs(i,j);
						count++;
					}
				}
			}
			
			System.out.println(count);

		}

		br.close();
	}
}
