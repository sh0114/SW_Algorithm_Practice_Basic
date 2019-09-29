package basic;
import java.util.*;
public class p1526 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int cnt = 1;
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		while(n>=10) {
			n = n/10;
			cnt++;
		}
		n = temp;
		
		int answer = 0;
		
		arr.add(4);
		arr.add(7);
		
		int len = 2;
		for(int k = 2; k<=cnt; k++) {47
			int t = arr.size();

			for(int i =t-len; i<t ;i++) {
				String w = Integer.toString(4)+Integer.toString(arr.get(i));
				arr.add(Integer.parseInt(w));
			}
			for(int i =t-len; i<t ;i++) {
				String w = Integer.toString(7)+Integer.toString(arr.get(i));
				arr.add(Integer.parseInt(w));
			}
			len = (int)Math.pow(2,k);
		}
		
		for(int i=arr.size()-1; i>=0; i--) {
			if(arr.get(i)<=n) {
				answer = arr.get(i);
				break;
			}
		}
		System.out.println(answer);
		

	}
}
