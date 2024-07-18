package Arrays;

public class Search_rotated {
	// searching in sorted rotated array
	// array -> {50,100,10,20,30,35,40}  target = 20
	
	// brute method O(n)
	// optimal method ->
	
	// end 6
	// mid 3
	public static int search(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(target == numbers[mid]) {
				return mid;
			}
			
			if(numbers[start] <= numbers[mid]) {
				
				if(numbers[start] <= target && numbers[mid] >= target) {
					end = mid - 1;
				}
				
			}else {
				
				if(numbers[end] >= target && numbers[mid] <= target) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
				
			}

		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] num = {50,100,10,20,30,35,40};
		int target = 40;
		
		System.out.println("The index position of the target value is "+search(num,target));
	}

}
