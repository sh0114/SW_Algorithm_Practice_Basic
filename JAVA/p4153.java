import java.util.*;

public class p4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] edges = new int[3];
		int a =0; 
		int b =0;
		int c =0;
		
		
		while(true) {

			for(int i=0; i<3; i++) {
				edges[i] = scan.nextInt();
			}
			if(edges[0] == 0 && edges[1] == 0 && edges[2]==0) {
				break;
			}
			
			a = edges[0]*edges[0];
			b = edges[1]*edges[1];
			c = edges[2]*edges[2];
			
			if(a==b+c || b==a+c || c==a+b) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
		
		scan.close();
	}
}
