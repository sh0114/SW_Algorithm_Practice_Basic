import java.util.*;

public class p9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String answer = "";
		
		if(90<=score&&score<=100) {
			answer = "A";
		}else if(80<= score && score<=89) {
			answer = "B";
		}else if(70<=score&&score<=79) {
			answer = "C";
		}else if(60<= score&&score<=69) {
			answer = "D";
		}else {
			answer = "F";
		}
		System.out.println(answer);
		
		sc.close();
	}
}
