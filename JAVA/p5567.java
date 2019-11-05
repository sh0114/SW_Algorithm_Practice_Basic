package basic;
import java.util.*;
public class p5567 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		int[][] list = new int[m][2];
		boolean[] isvisit = new boolean[n+1];
		isvisit[1] = true;
		int count = 0;
		for(int i=0; i<m; i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
			
			if(list[i][0] == 1) {
				s.push(list[i][1]);
				isvisit[list[i][1]] = true;
				count++;
			}
		}
		

		while(!s.isEmpty()) {
			int a = s.pop();
			for(int i=0; i<m; i++) {
				if(!isvisit[list[i][1]] && list[i][0] == a) {
					isvisit[list[i][1]] = true;
					count++;
				}else if(!isvisit[list[i][0]] && list[i][1] == a) {
					isvisit[list[i][0]] = true;
					count++;
				}
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
