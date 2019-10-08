import java.io.*;
import java.util.*;
public class p2493 {
	
	static class tower{
        long height;
        int position;
        public tower(long height, int position){
            this.height = height;
            this.position = position;
        }
    }
	
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int n = Integer.parseInt(br.readLine());
		Stack<tower> s = new Stack<tower>();
        StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 1; i<=n;i++) {
			long a = Long.parseLong(st.nextToken());
			while(!s.empty()) {
				if(s.peek().height > a) {
					System.out.print(s.peek().position);
					System.out.print(" ");
					break;
				}
				s.pop();
			}
			if(s.empty()) {
				System.out.print(0);
				System.out.print(" ");
			}
			
			s.push(new tower(a,i)); // 거리우선 이므로
			
		}
	
		System.out.println();
		
		br.close();
	}
}
