import java.util.*;

public class p1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];

		double max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			if (max < arr[i])
				max = arr[i];
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}

		double answer = sum / (double) n;
		System.out.println(answer);
		sc.close();
	}
}
