package Basic;
import java.util.*;

public class p2476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] roll = new int[n][3];
		int[] prize = new int[n];
		
		int max = 0; 
		
		for(int i=0; i<n;i++) {
			roll[i][0] = sc.nextInt();
			roll[i][1] = sc.nextInt();
			roll[i][2] = sc.nextInt();
			
			if(roll[i][0]== roll[i][1] && roll[i][1]==roll[i][2]) {
				prize[i] = 10000 + roll[i][0]*1000;
			}else if(roll[i][0] == roll[i][1] || roll[i][0] == roll[i][2]) {
				prize[i] = 1000 + roll[i][0]*100;
			}else if(roll[i][1] == roll[i][2]) {
				prize[i] = 1000 + roll[i][1]*100;
			}else {
				if(roll[i][0] > roll[i][1] && roll[i][0] > roll[i][2]) {
					prize[i] =  roll[i][0]*100;
				}else if(roll[i][1] > roll[i][2] && roll[i][1] > roll[i][0]){
					prize[i] =  roll[i][1]*100;
				}else {
					prize[i] =  roll[i][2]*100;
				}
			}
			
			if(max < prize[i]) {
				max = prize[i];
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
