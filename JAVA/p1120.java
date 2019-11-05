package basic;
import java.util.*;
public class p1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int len = b.length() - a.length() + 1;
		int mindiff = 9999;
		for(int i=0; i<len; i++) {
			String t = b.substring(i, i+a.length());
			int diff = 0;
			for(int j=0; j<a.length(); j++) {
				if(!t.substring(j,j+1).equals(a.substring(j,j+1))){
					diff++;
				}
			}
			if(mindiff > diff) {
				mindiff = diff;
			}
		}
		
		System.out.println(mindiff);
		
		sc.close();
	}
}
