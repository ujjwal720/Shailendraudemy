package shailendrajava;

public class erw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * binary search algorithim
		 * 
		 * no it is not binary search
		 */

		int arr[] = { 2, 3, 4, 10, 40, 67, 89 };

		int target = 67;

		int low = 0;
		int mid = arr.length / 2;
		int high = arr.length - 1;

		if (target < arr[mid]) {

			for (int i = 0; i <= mid; i++) {

				if (arr[i] == target) {
					
					System.out.println("element is available");
					break;

				}

			}
			
			

		}
		
		else {
			
			for (int i = mid; i <= high-1; i++) {
				
				if (arr[i] == target) {
					
					
					System.out.println("element is avilable");
					break;

				}
				
			}
			
		}

	}

}
