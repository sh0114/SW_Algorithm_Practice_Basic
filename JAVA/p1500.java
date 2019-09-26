import java.util.*;

public class p1500 {

	static public long func(long s, long k) {

		long mul_num = s/k;
		long count = s-(mul_num*k);
		long result = 1;
		
		for (int i = 0; i < k-count; i++) {
			result *= mul_num;
		}
		
		for (int i = 0; i < count; i++) {
			result *= (mul_num+1);
		}
	
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		long s = sc.nextInt();
		long k = sc.nextInt();

		System.out.println(func(s, k));

		sc.close();
	}
}
