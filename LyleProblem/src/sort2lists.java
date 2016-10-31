import java.util.Scanner; 
public class sort2lists {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		System.out.println("You will enter two lists of numbers. I will sort all of your numbers. The lists must have 10 numbers.");
		System.out.println("Enter list 1:");
		for (int i = 0; i < numbers.length; i++) {
			numbers [i] = input.nextInt();
		}
		
		int[] numbers2 = new int[10];
		System.out.println("Enter list 2:");
		for (int i = 0; i < numbers2.length; i++) {
			numbers2 [i] = input.nextInt();
		}
		
		
	}
	
		
		public static int[] merge(int[] a, int[] b) {
		    int[] result = new int[a.length + b.length];
		    int aIndex = 0, bIndex = 0;

		    for (int i = 0; i < result.length; i++) {
		        if (aIndex < a.length && bIndex < b.length) {
		            if (a[aIndex] < b[bIndex]) {
		                result[i] = a[aIndex];
		                aIndex++;
		            } else {
		                result[i] = b[bIndex];
		                bIndex++;
		            }
		        } else if (aIndex < a.length) {
		            result[i] = a[aIndex];
		            aIndex++;
		        } else {
		            result[i] = b[bIndex];
		            bIndex++;
		        }
		    }

		    return result;
		
		
	
	

		}
}

