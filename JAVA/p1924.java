package basic;
import java.util.*;

public class p1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int before_month = 0;
		for(int i=1; i<x ;i++) {
			if(i==4||i==6||i==9||i==11) {
				before_month += 30;
			}else if(i == 2) {
				before_month += 28;
			}else {
				before_month += 31;
			}
		}
		
		switch((before_month+y)%7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
		
		sc.close();
	}
}
