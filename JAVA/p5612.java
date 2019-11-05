package basic;
import java.util.*;

public class p5612 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int temp = m;
		int result = m;

		boolean flag = true;
		for(int i=0; i<n; i++) {
			int in = sc.nextInt();
			int out = sc.nextInt();
			
			temp += (in - out);
			if(temp < 0) {
				flag = false;
				System.out.println(0);
				break;
			}
			
			result = Math.max(result, temp);
		}
		
		if(flag)
			System.out.println(result);
		
		sc.close();
	}
}
