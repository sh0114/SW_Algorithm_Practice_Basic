import java.util.*;

public class p3052 {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		boolean[] check = new boolean[42];
		
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		for(int i=0; i < 10; i++) {
			int c = scan.nextInt();
			c = c%42;
			if(!check[c]) {
				check[c] = true;
				count++;
			}
		}
		
		
		System.out.println(count);
		
		scan.close();
	}
}
