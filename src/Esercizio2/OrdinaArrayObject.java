package Esercizio2;

public class OrdinaArrayObject extends ArrayAbstract {

	public static void BubbleSort(Comparable[] A) {
		for (int j = 0; j < A.length; j++) {
			for (int i = 0; i < A.length; i++) {
				if (A[i].compareTo(A[j]) > 0) {
					
					Comparable temp;
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		Studente[] S = new Studente[10];

		for (int i = 0; i < S.length; i++) {

			S[i] = new Studente();
		}

		
		OrdinaArrayObject.BubbleSort(S);
		
		System.out.println("Stampa array classe Ordinamento:");
		

	}

}
