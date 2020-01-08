import java.util.*;

public class p6588 {

	static int[] prime;

	public static void isprime() {
		for (int i = 2; i * i < 1000001; i++) {
			for (int j = i * i; j < 1000001; j += i) {
				prime[j] = -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String wrong = "Goldbach's conjecture is wrong.";
		prime = new int[1000001];
		isprime();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			boolean chk = false;
			for (int i = 3; i <= n; i++) {
				int j = n-i;
				if (prime[i] == 0 && prime[j] == 0) {
					chk = true;
					System.out.println(n + " = " + i + " + " + j);
					break;
				}

				if (chk) {
					break;
				}
			}
			if (!chk) {
				System.out.println(wrong);
			}

		}

		sc.close();
	}
}
