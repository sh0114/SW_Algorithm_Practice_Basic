package basic;

import java.util.*;
import java.io.*;


public class p1389 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] map = new int[n + 1][n + 1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i!=j)
					map[i][j] = 9999999;
			}
		}
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print(map[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}

		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(map[i][j] > map[i][k]+map[k][j]) {
						map[i][j] = map[i][k]+map[k][j];
					}
				}
			}
		} // 최단경로를 만들어줌
		
//		System.out.println("========");
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print(map[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		int cnt[] = new int[n+1];
		int min = Integer.MAX_VALUE;
		
		for(int i=1; i<=n;i++) {
			int sum = 0;
			for(int j=1; j<=n; j++) {
				sum += map[i][j];
			}
			cnt[i] = sum;
			if(sum < min) {
				min = sum;
			}
		}
		
        for(int i = 1 ; i<= n ; i++){
            if(cnt[i]==min){
                System.out.println(i);
                break;
            }
        } // 번호가 가장 작은사람 출력
		

		br.close();
	}
}
