package basic;

import java.util.*;

public class p1913 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int flag = sc.nextInt();
		int[][] snail = new int[n][n];

		int num = n * n;
		int first = 0;
		int last = n;
		int temp = n;
		

		while (n>0) {
			for (int i = first; i <last; i++) {
				snail[i][first] = num;
				num--;
			}
			for (int i = first+1; i <last; i++) {
				snail[last - 1][i] = num;
				num--;
			}
			for (int i = last - 2; i >= first; i--) {
				snail[i][last - 1] = num;
				num--;
			}
			for (int i = last - 2; i >= first+1; i--) {
				snail[first][i] = num;
				num--;
			} 
			n = n-2;
			num = n*n;
			first++;
			last = n+first;
		}

		n = temp;

		 for(int i=0; i<n; i++) {
	            for(int j=0; j<n; j++) {
	                System.out.print(snail[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        for(int i=0; i<n; i++) {
	            for(int j=0; j<n; j++) {
	                if(snail[i][j] == flag){
	                    System.out.println((i+1) + " " + (j+1));
	                }
	            }
	        }

		sc.close();
	}
}
