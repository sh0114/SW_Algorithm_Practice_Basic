import java.util.*;

public class p1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		if(c <= b) {
			System.out.println(-1);
		}else {
		
			int count = 1;
			for(;; count++) {
				long spend = a + b*count;
				long income = c * count;
				
				if(spend<income) {
					break;
				}
			}
			
			System.out.println(count);
		}

		sc.close();
	}
}
