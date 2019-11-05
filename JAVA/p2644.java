package basic;
import java.util.*;
import java.awt.*;
public class p2644 {
	
	static int n, target1, target2;
	static int[][] chon_1;
	static int[] chon;
	static boolean[] isvisit;
	static int answer;
	
	public static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.offer(target1);
		while(!q.isEmpty()) {
			int a = q.poll();
			isvisit[a] = true;
			
			if(a == target2) {
				answer = chon[target2];
				return ;
			}
			
			for(int i=0; i<n; i++) {
				if(chon_1[i][0] == a && !isvisit[chon_1[i][1]]) {
					q.offer(chon_1[i][1]);
					chon[chon_1[i][1]] = chon[chon_1[i][0]] + 1;
				}else if(chon_1[i][1] == a && !isvisit[chon_1[i][0]]) {
					q.offer(chon_1[i][0]);
					chon[chon_1[i][0]] = chon[chon_1[i][1]] + 1;
				}
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		target1 = sc.nextInt();
		target2 = sc.nextInt();
		int m = sc.nextInt();
		
		chon_1 = new int[n+1][2];
		chon = new int[n+1];
		isvisit = new boolean[n+1];
		answer = -1;
		
		for(int i=1; i<=m;i++) {
			chon_1[i][0] = sc.nextInt();
			chon_1[i][1] = sc.nextInt();
		}
		
		bfs();
		System.out.println(answer);
		sc.close();
	}
}
