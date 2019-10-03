package basic;
import java.util.*;
public class p1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] words = s.split("\\s");
		
		words = s.split(" ");
		
		int count = 0;
		for(String word : words) {
			if(word.length() > 0) {
				count++;
			}
			//System.out.println(word);
		}
		System.out.println(count);
		sc.close();
	}
}
