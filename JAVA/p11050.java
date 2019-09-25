import java.util.*;

public class p11050 {
	
	static public int fac(int n) {
		int f = 1;
		for(int i=1; i<=n; i++) {
			f *= i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		int result = 0;
		
		if(0<= k && k<= n) {
			result = fac(n)/(fac(k)*fac(n-k));
			System.out.println(result);
		}else {
			System.out.println(result);
		}
		
		s.close();
	}
}
