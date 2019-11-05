package basic;
import java.util.*;
public class p2491 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxlen = 0;
		
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] <= arr[i+1]) {
				count++;
			}
			if(arr[i] > arr[i+1] && count > 0) {
				count++;
				if(maxlen < count) {
					maxlen = count;
				}
				count = 0;
			}
		}
		
		if(maxlen < count) {
			maxlen = count;
		}
		count = 0;
		
		for(int i=0; i<n;i++) {
			if(arr[i] >= arr[i+1]) {
				count++;
			}
			if(arr[i] < arr[i+1] && count > 0) {
				count++;
				if(maxlen < count) {
					maxlen = count;
				}
				count = 0;
			}
		}
		if(maxlen < count) {
			maxlen = count;
		}
		System.out.println(maxlen);
		sc.close();
	}
}
