package practice;

public class Sort {

	public static void main(String[] args) {
		
		int []arr = {7,3,12,88,3,66,49,100,20,16,49,86,12345};
		sort(arr);

	}

	private static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
