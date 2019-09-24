import java.util.*;

public class p5532 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vacation = new int[5];
		
		for(int i=0; i< 5; i++) {
			vacation[i] = scan.nextInt();
		}
		
		int s_math = vacation[1] / vacation[3];
		int s_korean = vacation[2] / vacation[4];
		
		int d_math = vacation[1] % vacation[3];
		int d_korean = vacation[2] % vacation[4];
		
		int m_math = 0;
		int m_korean = 0;
		
		if(d_math == 0) {
			m_math = s_math;
		}else {
			m_math = s_math +1;
		}
		
		if(d_korean == 0) {
			m_korean = s_korean;
		}else {
			m_korean = s_korean +1;
		}
		
		
		if(m_math < m_korean) {
			System.out.println(vacation[0]-m_korean);
		}else {
			System.out.println(vacation[0]-m_math);
		}
		
		scan.close();
	}
}
