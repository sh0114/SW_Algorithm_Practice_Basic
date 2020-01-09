import java.util.*;

public class p2331 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long p = sc.nextInt();
		
		ArrayList<Long> darr = new ArrayList<>();
		darr.add(a);
		int n = 1;
		
		long flag = 0;
		while(true) {
			String nums = darr.get(n-1).toString();
			int len = nums.length();
			long sum = 0;
			for(int i=0; i<len; i++) {
				long e = Long.parseLong(nums.substring(i,i+1));
				sum += Math.pow(e, p);
			}
			boolean chk = false;
			for(int i=0; i<n; i++) {
				if(darr.get(i) == sum) {
					chk = true;
					flag = darr.get(i);
					break;
				}
			}
			if(!chk) {
				darr.add(sum);
				n++;
			}else {
				break;
			}
		}
		
		int l = darr.size();
		int answer = 0;
		for(int i=0; i<l; i++) {
			if(flag == darr.get(i)) {
				break;
			}else {
				answer++;
			}
		}
		
		System.out.println(answer);
		sc.close();
	}
}
