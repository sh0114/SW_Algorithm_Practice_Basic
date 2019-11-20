package basic;

import java.util.*;
import java.io.*;

public class p1759 {

	static int l, c;
	static int consonant, vowel;
	static char[] words;
	static Stack<Character> stack;

	public static boolean isvowel(char a) {
		return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u');
	}

	public static void func() {
		if(stack.size() == l) {
			if(consonant >=2 && vowel >= 1) {
				for(int i=0; i<l; i++) {
					System.out.print(stack.get(i));
				}
				System.out.println(); 
			}
			return;
		}
		
		for(int i=0; i<c; i++) {
			if(stack.isEmpty()) {
				if(isvowel(words[i]))
					vowel++;
				else
					consonant++;
				stack.push(words[i]);
				func();
				if(isvowel(words[i]))
					vowel--;
				else
					consonant--;
				stack.pop();
			}else {
				if(stack.peek() < words[i]) {
					if(isvowel(words[i]))
						vowel++;
					else
						consonant++;
					stack.push(words[i]);
					func();
					if(isvowel(words[i]))
						vowel--;
					else
						consonant--;
					stack.pop();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		words = new char[c];
		stack = new Stack<>();
		consonant = 0;
		vowel = 0;

		String splits[] = br.readLine().split(" ");
		for (int i = 0; i < c; i++) {
			words[i] = splits[i].charAt(0);
		}
		
		Arrays.sort(words);

		func();
		

		br.close();
	}
}
