import java.io.*;
import java.util.*;
import java.awt.*;

public class p1931 {
	
	static class Meeting implements Comparable<Meeting>{
		int start;
		int end;
		
		public Meeting(int s, int e) {
			this.start = s;
			this.end = e;
		}
		
		@Override
		public int compareTo(Meeting m) {
			if(this.end > m.end) {
				return 2;
			}else if(this.end < m.end){
				return -2;
			}else {
				if(this.start>m.start) {
					return 1;
				}else if(this.start<m.start) {
					return -1;
				}else {
					return 0;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Meeting> marr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			marr.add(new Meeting(start, end));
		}
		
		Collections.sort(marr);
		
//		for(int i=0; i<marr.size(); i++) {
//			System.out.println(marr.get(i).start + " " + marr.get(i).end);
//		}
//		System.out.println();
		int answer = 1;
		int curend = marr.get(0).end;
		for(int i=1; i<n; i++) {
			if(marr.get(i).start >= curend) {
				answer++;
				curend = marr.get(i).end;
			}
		}
		
		System.out.println(answer);
		
		br.close();
	}
}

