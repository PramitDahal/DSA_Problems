package Graph;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Course_Problems {
	
	public static int courseSelect(int[][] courses) {
		
		Arrays.sort(courses,(a,b)-> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]);
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b)->b-a);
		int deadline=0;
		
		for(int [] course: courses) {
			
			if (course[0]+deadline<=course[1]) {
				pQueue.offer(course[0]);
				deadline+=course[0];
			}else {
				if(pQueue.peek()>course[0]) {
					deadline-=pQueue.poll();
					deadline+=course[0];
					pQueue.offer(course[0]);

				}
			}
			
		}
		
		return pQueue.size();
	}
	public static void main(String[] args) {
		int courses[][] = {{9,10},{3,12},{5,15},{4,18},{5,20},{10,20},{10,19}};
		System.out.println("The possible courses = "+courseSelect(courses));
	}

}