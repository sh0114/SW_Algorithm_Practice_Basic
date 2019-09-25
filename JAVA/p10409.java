import java.util.*;

public class p10409 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int t = s.nextInt();
		
		int sum = 0;
		int i;
		for(i=0; i< n ;i++) {
			int work = s.nextInt();
			sum = sum+work;
			if(sum > t) {
				break;
			}
		}
		
		System.out.println(i);
		
		s.close();
	}
}
