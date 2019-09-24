import java.util.*;

public class p5597 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean[] checks = new boolean[31];
		
		for(int i = 0; i < 28; i++) {
			int s = scan.nextInt();
			checks[s] = true;
		}
		
		int[] result = new int[2];
		int count = 0;
		for(int i=1; i<=30; i++) {
			if(!checks[i]) {
				result[count] = i;
				count++;
			}
		}
		
		if(result[0]<result[1]) {
			System.out.println(result[0]);
			System.out.println(result[1]);
		}else {
			System.out.println(result[1]);
			System.out.println(result[0]);
		}
		
		scan.close();
	}
}
