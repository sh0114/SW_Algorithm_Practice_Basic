import java.util.*;

public class p2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean chk = true;
		int diff = 0;
		for(int i=1; i<8;i++) {
			diff = arr[i]-arr[i-1];
			if(diff == 1) {
				continue;
			}else if(diff == -1){
				continue;
			}else {
				chk = false;
				break;
			}
		}
		
		if(chk) {
			if(diff == 1) {
				System.out.println("ascending");
			}else {
				System.out.println("descending");
			}
		}else {
			System.out.println("mixed");
		}
		sc.close();
	}
}
