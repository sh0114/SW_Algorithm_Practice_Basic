import java.util.*;

public class p2563 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] size = new int[101][101];
		
		int n = s.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					if(size[x+j][y+k] == 1) {
						continue;
					}
					size[x+j][y+k] = 1;
					result++;
				}
			}
			
		}
		System.out.println(result);
		s.close();
	}
}
