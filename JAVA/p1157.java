import java.util.*;

public class p1157 {
	
	static class Word{
		private int count;
		private String alphabet;
		
		Word(int c, String a){
			this.setCount(c);
			this.alphabet = a;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
		public String getA() {
			return alphabet;
		}
		
		public void setA(String a) {
			this.alphabet = a;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		String word = scan1.nextLine();
		word = word.toUpperCase();
		
		ArrayList<Word> words = new ArrayList<Word>();
		String a = word.substring(0,1);
		Word w = new Word(1,a);
		words.add(w);
		

		for(int i=2; i<=word.length(); i++) {
			String temp = word.substring(i-1,i);
			int check = 0;
			for(int j=0; j < words.size(); j++) {
				String comp = words.get(j).getA();
				if(temp.equals(comp)) {
					int c = words.get(j).getCount();
					c++;
					words.get(j).setCount(c);
					check = 0;
					break;
					
				}else {
					check = -1;
				} 
			}
			if(check < 0) {
				Word temp2 = new Word(1,word.substring(i-1,i));
				words.add(temp2);	
			}
			check = 0;
		}
		
//		System.out.println("----------");
//		for(int i=0; i<words.size();i++) {
//			System.out.println(words.get(i).getA());
//			System.out.println(words.get(i).getCount());
//		}
//		System.out.println("----------");
		
		int max = 0;
		String max_a = "";
		for(int i=0; i<words.size();i++) {
			if(max < words.get(i).getCount()) {
				max = words.get(i).getCount();
				max_a = words.get(i).getA();
			}
		}
		
		int other_max = 0;
		for(int i=0; i<words.size();i++) {
			if(max == words.get(i).getCount() && !max_a.equals(words.get(i).getA())) {
				other_max = -1;
			}
		}
		
		if(other_max < 0) {
			System.out.println("?");
		}else {
			System.out.println(max_a);
		}
	
	}
	
}


