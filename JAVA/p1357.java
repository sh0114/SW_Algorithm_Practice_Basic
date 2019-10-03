package basic;
import java.util.*;
public class p1357 {
	
	static int rev(String a) {
		String res = "";
		for(int i=a.length(); i>0; i--) {
			res = res + a.substring(i-1,i);
		}
		
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sx = sc.next();
		String sy = sc.next();
		
		int rx = rev(sx);
		int ry = rev(sy);
		
		int sum = rx + ry;
		
		System.out.println(rev(Integer.toString(sum)));
		sc.close();
	}
}
