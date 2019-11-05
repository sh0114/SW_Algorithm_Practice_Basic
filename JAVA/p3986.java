package basic;

import java.util.*;

public class p3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		Stack<String> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			String w = sc.next();
			for (int j = 0; j < w.length(); j++) {
				if (!s.isEmpty()) {
					if (s.peek().equals(w.substring(j, j + 1))) {
						s.pop();
					} else {
						s.push(w.substring(j, j + 1));
					}
				} else {
					s.push(w.substring(j, j + 1));
				}
			}

			if (s.isEmpty()) {
				count++;
			}
			s.clear();
		}

		System.out.println(count);
		sc.close();
	}
}
