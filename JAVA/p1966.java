import java.util.*;

public class p1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<tc; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			q.clear();
			
			for(int j=0; j<n; j++) {
				q.add(sc.nextInt());
			}
			
			int count = 0;
			while(!q.isEmpty()) {
				boolean isMaxPriority = true;
				for(int j=1; j<q.size(); j++) {
					if(q.peek() < q.get(j)) {
						isMaxPriority = false;
						break;
					}
				}
				
				if(isMaxPriority) {
					count++;
					q.poll();
					if(m == 0) {
						break;
					}else {
						m--;
					}
				}else {
					int temp = q.poll();
					q.add(temp);
					if(m==0)
						m = q.size()-1;
					else
						m--;
				}

			}
			System.out.println(count);

		}
		
		sc.close();
	}
}
