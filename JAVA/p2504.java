package basic;

import java.util.*;

public class p2504 {
	
	static String string;
	static int len;
	
	public static boolean check() {
		boolean c = true;
		Stack<String> s = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			String w = string.substring(i, i + 1);
			if(w.equals("[") || w.equals("(")) {
				s.push(w);
			}else {
				if(s.isEmpty()) {
					c = false;
					break;
				}
				if(w.equals("]") && s.peek().equals("[")) {
					s.pop();
				}else if(w.equals(")") && s.peek().equals("(")) {
					s.pop();
				}
			}
		
		}
		
		if(!s.isEmpty()) {
			c = false;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		string = sc.next();
		len = string.length();
		
		boolean chk = check();
		if(!chk) {
			System.out.println(0);
		}else {
			Stack<String> stack = new Stack<>();

			for (int i = 0; i < len; i++) {
				String w = string.substring(i, i + 1);
				if(w.equals("[") || w.equals("(")) {
					stack.push(w);
				}else if(w.equals("]")){
					if(stack.peek().equals("[")) {
						stack.pop();
						stack.push("3");
					}else {
						int temp = 0;
						while(true) {
							if(stack.peek().equals("[")) {
								break;
							}
							temp += Integer.parseInt(stack.pop());
						}
						temp *= 3;
						stack.pop();
						stack.push(Integer.toString(temp));
					}
				}else if(w.equals(")")){
					if(stack.peek().equals("(")) {
						stack.pop();
						stack.push("2");
					}else {
						int temp = 0;
						while(true) {
							if(stack.peek().equals("(")) {
								break;
							}
							temp += Integer.parseInt(stack.pop());
						}
						temp *= 2;
						stack.pop();
						stack.push(Integer.toString(temp));
					}
				}
			
			}
			
			int answer = 0;
			for(int i=0; i<stack.size(); i++) {
				answer += Integer.parseInt(stack.get(i));
			}
			System.out.println(answer);
		}		

		sc.close();
	}
}
