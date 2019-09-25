import java.util.*;

public class p9095 {
	
	static public int func(int n) {
		if(n == 1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else if(n==3) {
			return 4;
		}else {
			int res = 0;
			res = func(n-1)+ func(n-2)+func(n-3);
			return res;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		for(int i=0; i<tc; i++) {
			int n = s.nextInt();
			int result = func(n);
			System.out.println(result);
		}
		s.close();
	}
}
