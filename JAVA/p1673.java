import java.util.*;

public class p1673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int count = n;
			int chicken = 0;
			int stemp = n;
			while(stemp/k >0) {
				chicken = stemp/k;
				count += chicken;
				stemp = chicken + stemp % k;
			}
			System.out.println(count);
		}
	}
}
