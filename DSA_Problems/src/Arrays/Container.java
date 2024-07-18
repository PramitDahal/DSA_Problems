package Arrays;

public class Container {
	
	// given -> height of the container {1,5,6,3,4,2}
	
	// optimal solution
	
	public static int maxArea(int[] height) {
		
		int max = 0;
		int left = 0;
		int right = height.length - 1;
		
		while(left < right) {
			int leftValue = height[left];
			int rightValue = height[right];
			
			int min = Math.min(leftValue, rightValue);
			
			int length = right - left;
			int area = min * length;
			
			max = Math.max(max,area);
			
			if(leftValue < rightValue) {
				left++;
			}else {
				right--;
			}
			
			
		}
	
		return max;
	}
	
	public static void main(String[] args) {
		int h[] = {1,5,6,3,4,2};
		System.out.println("The maximum amount of water contained is: "+maxArea(h));
	}

}
