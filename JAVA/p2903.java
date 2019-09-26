import java.util.*;

public class p2903 {
	public static double func(double n) {
		if (n == 0) {
			return 2;
		} else {
			return func(n-1)+ Math.pow(2, n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();

		int result = (int) Math.pow(func(n),2);
		System.out.println(result);
		sc.close();
	}
}
