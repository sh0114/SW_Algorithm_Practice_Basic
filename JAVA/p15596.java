package bas;

import java.util.*;

public class p15596 {
	long sum(int[] a) {
		long answer = 0;
		for(int i=0; i<a.length; i++) {
			answer += a[i];
		}
		return answer;
	}
}
