import java.util.*;

public class p2942 {
	
	static long r, g;
	
	public static long gcd(long a, long b) {
		if(a%b==0)
			return b;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextLong();
		g = sc.nextLong();
		
		long gcdnum = gcd(r,g);
		
		for(long i=1; i<= gcdnum; i++) {
			if(r%i ==0 && g%i==0) {
				long rapple = r/i;
				long gapple = g/i;
				System.out.println(i + " " + rapple +" "+ gapple);
			}
		}
		
		sc.close();
	}
}
