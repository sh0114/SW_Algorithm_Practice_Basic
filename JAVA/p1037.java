import java.util.*;
public class p1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums = sc.nextInt();
		int[] arr = new int[nums];
		for(int i=0; i<nums; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		String result = Integer.toString(arr[0] * arr[nums-1]);
		int res = Integer.parseUnsignedInt(result);
		System.out.println(res);
		
		sc.close();
	}
}
