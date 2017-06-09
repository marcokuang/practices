package marco.topics;

public class Sorts {
	public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		int arr2[] = {64, 34, 25, 12, 22, 11, 90};
		int arr3[] = {10, 80, 30, 90, 40, 50, 70};
		BubbleSort bSort = new BubbleSort(arr);
		bSort.sort();
		
		QuickSort qSort = new QuickSort(arr2);
		qSort.sort();
		
		QuickSort qSort2 = new QuickSort(arr3);
		qSort2.sort();
	}
	
	public interface Sort{
		public int compare(int first, int second);
		public int compare(double first, double second);
	}
	
	public static class QuickSort implements Sort{
		private int[] intArray;
		public QuickSort(int[] array){
			this.intArray = array;
		}
		
		public void sort(){
			quickSort(this.intArray, 0, this.intArray.length-1);
			printIntArray();
		}

		private void quickSort(int[] arr, int low, int high) {
			// TODO Auto-generated method stub
			if (low < high) {
				
				int index = partition(arr, low, high);
				quickSort(arr, low, index-1);
				quickSort(arr, index+1, high);
			}
			
		}
//int arr[] = {64, 34, 25, 12, 22, 11, 90};
		private int partition(int[] arr, int low, int high) {
			// TODO Auto-generated method stub
			int pivot = arr[high];
			int pointer = low;
			int smallPointer = low;
			while(pointer < high){
				if(arr[pointer] <= pivot){
					swap(arr, smallPointer, pointer);
					smallPointer++;
				}
				pointer++;
			}
			swap(arr, smallPointer, high);
			return smallPointer;
		}

		private void swap(int[]arr, int first, int second) {
	// TODO Auto-generated method stub
			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
		
		private void printIntArray() {
			// TODO Auto-generated method stub
			for(int i=0; i<intArray.length; i++){
				System.out.print(intArray[i] + " ");
			}
			System.out.println();
			
		}

		@Override
		public int compare(int first, int second) {
			// TODO Auto-generated method stub
			if (first < second) {
				return -1;
			}
			else if(first == second){
				return 0;
			}
			else{
				return 1;
			}
		}

		@Override
		public int compare(double first, double second) {
			// TODO Auto-generated method stub
			if (first < second) {
				return -1;
			}
			else if(first == second){
				return 0;
			}
			else{
				return 1;
			}
		}
		
	}
	
	public static class BubbleSort implements Sort{
		private int[] intArray;
		private double[] doubleArray;
		private boolean isIntArray;
		public BubbleSort(int[] array) {
			// TODO Auto-generated constructor stub
			this.isIntArray = true;
			this.intArray = array;
		}
		
		public void sort(){
			if (isIntArray) {
				
				for(int i = 0; i < intArray.length; i++){
					for (int j = 0; j < intArray.length-1-i; j++) {
						if (compare(intArray[j], intArray[j+1]) == 1) {
							int temp = intArray[j];
							intArray[j] = intArray[j+1];
							intArray[j+1] = temp;
						}
					}
				}
				printIntArray();
			}
		}

		private void printIntArray() {
			// TODO Auto-generated method stub
			for(int i=0; i<intArray.length; i++){
				System.out.print(intArray[i] + " ");
			}
			System.out.println();
			
		}

		@Override
		public int compare(int first, int second) {
			if (first < second) {
				return -1;
			}
			else if(first == second){
				return 0;
			}
			else{
				return 1;
			}
		}

		@Override
		public int compare(double first, double second) {
			if (first < second) {
				return -1;
			}
			else if(first == second){
				return 0;
			}
			else{
				return 1;
			}
		}
		
	}
}
