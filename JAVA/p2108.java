package basic;

import java.util.*;

public class p2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double a = 0;
		int b = 0, c = 0, d = 0;
		
		int[] arr = new int[n];
		Stack<Integer> s = new Stack<>();
		
		double sum = 0;
		for(int i=0 ; i<n;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		a = sum/n;
		
		Arrays.sort(arr);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(arr[0], 1);
		int max = 1;
		for(int i=1; i<n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				int cnt = map.get(arr[i]);
				cnt++;
				map.replace(arr[i], cnt);
				if(max < cnt) {
					max = cnt;
				}
			}
		}
		
		if(map.size() == 1) {
			c = arr[0];
		}else {
			if(max == map.get(arr[0])) {
				s.push(arr[0]);
			}
			for(int i=1; i<n; i++) {
				if(max == map.get(arr[i]) && arr[i-1] != arr[i]) {
					s.push(arr[i]);
				}
			}
			if(s.size() == 1) {
				c= s.get(0);
			}else{
				c = s.get(1);
			}
		}
		
		
	
		
		b = arr[n/2];
		d = Math.abs(arr[n-1] - arr[0]);
		
		System.out.println(Math.round(a));
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
	}
}
