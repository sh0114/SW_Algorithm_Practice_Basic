package basic;
import java.util.*;
public class p1655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Integer> minheap = new PriorityQueue<>(Comparator.naturalOrder());
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
	    // 최대힙의 크기는 최소힙의 크기와 같거나 1개더 크다.
	    // 최대힙의 최대원소는 최소힙의 최소 원소보다 작거나 같다.
		
		int input1 = sc.nextInt();
		maxheap.add(input1);
		System.out.println(input1);
		
		for(int i=1; i<n;i++) {
			int input = sc.nextInt();
			
			if(maxheap.size() == minheap.size())
				maxheap.add(input);
			else
				minheap.add(input);
			
			if(maxheap.peek() > minheap.peek()) {
				int temp_max = maxheap.peek();
				int temp_min = minheap.peek();
				maxheap.poll();
				minheap.poll();
				maxheap.add(temp_min);
				minheap.add(temp_max);
			}
			
			System.out.println(maxheap.peek());
			
		}
		sc.close();
	}
}
