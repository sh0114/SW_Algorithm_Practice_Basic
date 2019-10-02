package Basic;
import java.util.*;
public class p3062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int a = sc.nextInt();
			String s = Integer.toString(a);
			String r = "";
			for(int i=s.length(); i>0;i--) {
				r = r + s.substring(i-1,i);
			}
			int n = a + Integer.parseInt(r);
			
			String sn = Integer.toString(n);
			
			int l = sn.length();
			String chk = "";
			for(int i=1, j=l; i<=l/2; i++, j--) {
				if(sn.substring(i-1,i).equals(sn.substring(j-1,j))) {
					chk = "YES";
				}else {
					chk = "NO";
				}
			}
			System.out.println(chk);
		}
		
		sc.close();
	}
}
