import java.util.*;

public class p2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		
		for(int i=0; i<n; i++) {
			System.out.println(arr.get(i));
		}
		sc.close();
	}
}
