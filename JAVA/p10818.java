import java.util.*;

public class p10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr= new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		
		System.out.println(arr.get(0) + " " + arr.get(n-1));
		sc.close();
	}
}
