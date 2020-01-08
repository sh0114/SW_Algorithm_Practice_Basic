import java.util.*;

public class p2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] answer = new String[3];
		int a=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				int p = sc.nextInt();
				if(p==1) {
					a++;
				}
			}
			switch(a) {
			case 0:
				answer[i] = "D";
				break;
			case 1:
				answer[i] = "C";
				break;
			case 2:
				answer[i] = "B";
				break;
			case 3:
				answer[i] = "A";
				break;
			case 4:
				answer[i] = "E";
				break;
			}
			a=0;
			
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(answer[i]);
		}
		
		sc.close();
	}
}
