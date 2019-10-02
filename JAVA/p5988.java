package basic;
import java.util.*;

public class p5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			String k = sc.next();
			String w = k.substring(k.length()-1, k.length());
			//System.out.println(w);
			if(Integer.parseInt(w) %2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
		sc.close();
	}
}
