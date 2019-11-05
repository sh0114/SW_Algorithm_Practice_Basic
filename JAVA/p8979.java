package basic;
import java.util.*;

public class p8979{
	public static class country implements Comparable<country>{
		int num;
		int gold;
		int silver;
		int bronze;
		int rank;
		
		public country(int n, int g, int s, int b) {
			this.num = n;
			this.gold = g;
			this.silver = s;
			this.bronze = b;
			this.rank = 1;
		}

		@Override
		public int compareTo(country o) {
			if(this.gold > o.gold) {
				return -1;
			}else if(this.gold == o.gold) {
				if(this.silver > o.silver) {
					return -1;
				}else if(this.silver == o.silver) {
					if(this.bronze > o.bronze) {
						return -1;
					}else if(this.bronze == o.bronze) {
						return 0;
					}
				}
				
			}
			return 1;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		country[] c = new country[n];
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			int g = sc.nextInt();
			int s = sc.nextInt();
			int b = sc.nextInt();
			
			c[i] = new country(num, g,s,b);
		}
		
		Arrays.sort(c);
		
        for(int i = 1; i < n; i++) {
            if(c[i].gold == c[i-1].gold
                && c[i].silver == c[i-1].silver
                && c[i].bronze == c[i-1].bronze) {
               c[i].rank = c[i-1].rank;
            } else {
                c[i].rank = i+1;
            }
        } // 1위부터 rank 지정
        
        for(int i = 0; i<n;i++) {
        	if(c[i].num == k) {
        		System.out.println(c[i].rank);
        		break;
        	}
        }
		
		sc.close();
	}
	
}