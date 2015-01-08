package bubbleSort;

public class BubbleSort {
	public static void main(String[] args){
		int[] array = {3, 14, 7, 22, 45, 12, 19, 6};
		printArray(array);
		bubbleSort(array);
		System.out.println();
		printArray(array);
	}
	
	public static void bubbleSort(int[] array){
		int swap = 0;
		for (int c=0; c < array.length; c++){
			for(int d = 0; d < array.length - c - 1; d++){
				if(array[d] > array[d+1]){
					swap = array[d];
					array[d] = array[d+1];
					array[d+1]=swap;
				}
			}
		}
	}
	
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
