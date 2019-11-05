package basic;
import java.util.*;
public class p4673 {
	public static int dn(int n) {
		int sum = n;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = new int[10001];
		for(int i=1; i <= 10000; i++) {
			int a = dn(i);
			if(a <=10000)
				arr[a] = 1;
		}
		
		for(int i=1; i<=10000; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
		
	}
}
