import java.util.*;
public class p1408 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String current = s.nextLine();
		
		String start = s.nextLine();
		
		int ch =Integer.parseInt(current.split(":")[0]);
		int cm = Integer.parseInt(current.split(":")[1]);
		int cs = Integer.parseInt(current.split(":")[2]);
		
		int ct = ch*3600+cm*60+cs;
		
		int sh = Integer.parseInt(start.split(":")[0]);
		int sm = Integer.parseInt(start.split(":")[1]);
		int ss = Integer.parseInt(start.split(":")[2]);
		
		int st = sh*3600+sm*60+ss;
		
		if(ct>st) {
			st += 24*3600;
		}
		
		String result="";
		int r = st-ct;
		

		int rh = r/3600;
		r = r%3600;
		result = result + String.format("%02d", rh) +":";
		
		int rm = r/60;
		r = r%60;
		result = result + String.format("%02d", rm) + ":";
		int rs = r;
		result = result + String.format("%02d", rs);
		
		System.out.println(result);
		
		
		s.close();
	}
}
