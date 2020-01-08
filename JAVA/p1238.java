import java.io.*;
import java.util.*;

public class p1238 {

	static int[][] city;
	static int n, m, x, max;

	public static void floyd() {
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					city[i][j] = Math.min(city[i][k] + city[k][j], city[i][j]);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (max < city[i][x] + city[x][i]) {
				max = city[i][x] + city[x][i];
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		city = new int[n + 1][n + 1];
		max = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j)
					continue;
				else
					city[i][j] = 100001;
			}
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());

			city[s][e] = t;
		}

		floyd();
		System.out.println(max);

		br.close();
	}
}
