package basic;
import java.util.*;
public class p2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] sum = new int[10];
		
		sum[0] = sc.nextInt();
		for(int i=1; i<10; i++) {
			sum[i] = sum[i-1] + sc.nextInt();
		}
		
		int min = 100;
		int index = 0;
		for(int i=0; i<10; i++) {
			if(min >= Math.abs(sum[i] - 100)) {
				min = Math.abs(sum[i] - 100);
				index = i;
			}
		}
		
		System.out.println(sum[index]);
		
		sc.close();
	}
}
