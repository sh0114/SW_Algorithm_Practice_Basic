
import java.util.*;

public class p2436 {

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long ab = b / a;

		long n1 = 0, n2 = 0;
		long d1 = 0, d2 = 0;

		for (long i = 1; i * i <= ab; i++) {
			if (ab % i == 0 && gcd(i, ab/i) == 1) {
				d1 = i;
				d2 = ab/d1;
			}
		}
		
		if(d1 > d2) {
			long tmp = d1;
			d1 = d2;
			d2 = tmp;
		}

		n1 = d1 * a;
		n2 = d2 * a;
		
		System.out.println(n1 + " " + n2);

		sc.close();
	}
}
