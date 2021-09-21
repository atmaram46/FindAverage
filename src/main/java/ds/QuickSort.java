package ds;

import java.util.LinkedList;
import java.util.List;

public class QuickSort {
	
	
	
	

	public static void main(String [] args) {
		QuickSort qs = new QuickSort();
		qs.sort("1 7 10 3 18 9 -11 33");
	}

	private void sort(String string) {
		String[] str = string.split(" ");
		int [] arr = new int[string.length()];
		for(int i = 0;
				i < str.length;
				i++) {
			
			arr[i] = Integer.parseInt(str[i]);
		}
		
		qsort(arr,0,arr.length);
	}

	private void qsort(int[] arr, int low, int high) {
		
		int pivot = partition(arr, low, high);
		qsort(arr, low, pivot-1);
		qsort(arr, pivot + 1, high);
		
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int small = low-1;
		for(int i = low; i < high; i++) {
			if(arr[i] < pivot) {
				small++;
				swap(arr,small,i);
			}
		}
		return pivot;
	}

	private void swap(int[] arr, int small, int i) {
		
		int temp = arr[i];
		arr[i] = arr[small];
		arr[small] = temp;
		
	}

}
