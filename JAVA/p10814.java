import java.util.*;

public class p10814 {
	
	static class person implements Comparable<person>{
		int age;
		String name;
		person(int a, String n){
			this.age = a;
			this.name = n;
		}
		
		@Override
		public int compareTo(person p) {
			// TODO Auto-generated method stub
			
			if(p.age> this.age) {
				return -1;
			}else if(p.age<this.age) {
				return 1;
			}else {
				return 0;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<person> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			arr.add(new person(age,name));
		}
		
		Collections.sort(arr);
		
		for(int i=0; i<n; i++) {
			System.out.println(arr.get(i).age + " " + arr.get(i).name);
		}
		
		sc.close();
	}
}
