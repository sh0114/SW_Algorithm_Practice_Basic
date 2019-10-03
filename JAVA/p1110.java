package basic;
import java.util.*;
public class p1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int num = Integer.parseInt(n);
		sc.close();
		
		int count = 0;
		int sum = -1;
		while(sum != num) {
			if(n.length() == 1) {
				n = "0"+n;
			}
			
			int t = Integer.parseInt(n.substring(0,1)) + Integer.parseInt(n.substring(1,2));
			String temp = Integer.toString(t);
			if(temp.length() == 1) {
				temp = "0"+temp;
			}
			
			n = n.substring(1,2) + temp.substring(1,2);
			sum = Integer.parseInt(n);
			count++;
			
		}
		
		System.out.println(count);

	}
}
