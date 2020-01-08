import java.util.*;

public class p10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a <x) {
				arr.add(a);
			}
		}
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		
		sc.close();
	}
}
