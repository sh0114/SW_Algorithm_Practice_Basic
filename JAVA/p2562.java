import java.util.*;

public class p2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		int max = 0;
		int mp = 0;
		for(int i=1; i<=9; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				mp = i;
			}
		}
		System.out.println(max);
		System.out.println(mp);
	}
}
