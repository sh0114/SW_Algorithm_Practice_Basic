import java.util.*;

public class p2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long answer = a*b*c;
		String ans = Long.toString(answer);
		int n = ans.length();
		
		int[] arr = new int[10];
		
		for(int i = 0; i<n; i++) {
			String w = ans.substring(i,i+1);
			switch(w) {
			case "0":
				arr[0] = arr[0]+1;
				break;
			case "1":
				arr[1] = arr[1]+1;
				break;
			case "2":
				arr[2] = arr[2]+1;
				break;
			case "3":
				arr[3] = arr[3]+1;
				break;
			case "4":
				arr[4] = arr[4]+1;
				break;
			case "5":
				arr[5] = arr[5]+1;
				break;
			case "6":
				arr[6] = arr[6]+1;
				break;
			case "7":
				arr[7] = arr[7]+1;
				break;
			case "8":
				arr[8] = arr[8]+1;
				break;
			case "9":
				arr[9] = arr[9]+1;
				break;
				
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
