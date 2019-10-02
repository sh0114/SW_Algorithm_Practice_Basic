package Basic;
import java.util.*;
public class p1735 {
	public static int gcd(int a, int b) {
		int g = 1;
		int min = 0;
		if(a>b)
			min = b;
		else
			min = a;
		
		for(int i=1; i<=min; i++) {
			if(a%i==0 && b%i ==0)
				g = i;
		}
	
		
		return g;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int ra = b2*a1 + b1*a2;
		int rb = b1*b2;
		
		int g = gcd(ra,rb);
		
		ra = ra/g; 
		rb = rb/g;
		
		System.out.println(ra + " " + rb);
		
		
		sc.close();
	}
}
