import java.util.*;

public class p1373 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int len = n.length();
		Stack<Integer> stack = new Stack<>();
		int a = 0;
		int cnt = 0;
		int temp = 0;
		for (int i = n.length(); i > 0; i--) {
			if(cnt == 3) {
				stack.push(temp);
				temp = 0;
				cnt = 0;
				a++;
			}

			if (n.substring(i - 1, i).equals("1")) {
				temp += (int) Math.pow(2, cnt);
			}
			cnt++;
			
			if(i == 1) {
				stack.push(temp);
			}
		}
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		System.out.println();
		sc.close();
	}
}
