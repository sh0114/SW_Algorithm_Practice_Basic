import java.util.*;

public class p5533 {
	
	static class player{
		
		private int num;
		private int[] card = new int[3];
		private int[] score = new int[3];

		player(int n, int[] s) {
			this.num = n;
			this.card = s;
		}
		
		public void setNum(int n) {
			this.num = n;
		}
		
		public int getNum() {
			return this.num;
		}
		
		public void setScore(int index, int s) {
			this.score[index] = s;
		}
		
		public int[] getScore() {
			return this.score;
		}
		public void setCard(int[] s) {
			this.card = s;
		}
		
		public int[] getCard() {
			return this.card;
		}
		
		public int getSum() {
			int sum = this.score[0] + this.score[1] + this.score[2];
			return sum;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		ArrayList<player> players = new ArrayList<player>();
		
		
		for(int i=0; i<n; i++) {
			int num = i;
			int[] s = new int[3];
			
			for(int j=0; j<3; j++) {
				s[j] = scan.nextInt();
			}
			
			player e = new player(num, s);
			players.add(e);
		}
		
		int check = 0;
		for(int k=0; k<3; k++) {
			for(int i=0; i < n; i++) {
				for(int j=0; j<n; j++) {
					if(i!=j && players.get(i).getCard()[k] == players.get(j).getCard()[k]) {
						players.get(j).setScore(k, 0);
						check = -1;
						break;
					}
				}
				if(check == 0) {
					players.get(i).setScore(k,players.get(i).getCard()[k]);
				}
				check = 0;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			System.out.println(players.get(i).getSum());
		}
		
		scan.close();
	}
}
