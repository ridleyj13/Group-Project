import java.util.Scanner; 

public class selectionsort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		System.out.print("Enter ten numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers [i] = input.nextInt();
		}
		System.out.print("The sorted numbers are:");
		SelectionSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	private static void SelectionSort(int[] list) {
		// Define circumstance in which to calculate 
		for (int i = list.length-1; i > 0; i--) {
			
		// Find the max number in the list
		int Max = list[i];
		int MaxIndex= i;
		
		for (int x = 0; x < i; x++) {
			if (Max < list[x]) {
				Max = list[x];
				MaxIndex = x;
			}
		}
		// swap the two lists if needed
		if (MaxIndex != i) {
			list[MaxIndex] = list[i];
			list[i] = Max;
		}
	}
}
}
