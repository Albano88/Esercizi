package Esercizio1;

public class OrdinaArrayObject {

	static void bubblesort(int A[]) {
		for (int i = 1; i <= A.length - 1; i++) {
			boolean scambiAvvenuti = false;
			for (int j = 1; j <= A.length - i; j++) {
				if (A[j] < A[j - 1]) {
					int temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
					scambiAvvenuti = true;
				}
			}
			if (!scambiAvvenuti)
				break;
		}
	}
	
	
	public void printArray(String A){
		System.out.println("array: " + A);
	}
	
	
}
