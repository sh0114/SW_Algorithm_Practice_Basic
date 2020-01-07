import java.util.*;

public class p10872 {
	
	static int n;
	
	public static int fac(int i) {
		
		if(i == 1) {
			return 1;
		}
		
		int ans = i * fac(i-1);
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 0) {
			System.out.println(1);
		}else {
			int a = fac(n);
			System.out.println(a);
		}
		sc.close();
	}
}
