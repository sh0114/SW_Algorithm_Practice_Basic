package basic;
import java.util.*;
public class p1769 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int len = x.length();
		sc.close();
		
		int count = 0;
		int sum = 0;
		if(len == 1) {
			sum = Integer.parseInt(x);
		}
		while(len >1){
			sum = 0;
			for(int i=0; i<len; i++) {
				sum += Integer.parseInt(x.substring(i,i+1));
			}
			x = Integer.toString(sum);
			len = x.length();
			count++;

		}
		
		System.out.println(count);
		if(sum == 3 || sum==6 || sum ==9) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}
