package Esercizio2;

import java.util.Scanner;

public class RicercaArray extends ArrayAbstract {

	public static int BinaryReserch(Studente value, Studente[] A) {

		Integer result = -1;
		int low = 0;
		int high = A.length;

		Integer mid = (low + high) / 2;

		if (value.compare(A[mid])>0) {
			result = mid;
		} else if (A[mid].compare(value)<0) {
			high = mid - 1;
		} else {
			low = mid + 1;

		}

		return result;
	}

	public static int Linereserch(Studente value, Studente[] A) {
		boolean found = false;
		int result = -1;
		for (int i = 0; i < A.length && !found; i++) {
			 if (value.compare(A[i])==0) {
			found = true;
			result = i;
		}
		 }
		return result;

	}

	public static void main(String[] args) {

		Studente[] S = new Studente[10];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < S.length; i++) {

			S[i] = new Studente();
		}

		OrdinaArrayObject.BubbleSort(S);
		OrdinaArrayObject.PrintArray(S);

		System.out.println("inserire valore da cercare: 8");

		
		Studente value = new Studente(8);
		int result = RicercaArray.BinaryReserch(value, S);
		
		System.out.println("ricerca binaria: " + result);

		OrdinaArrayObject.PrintArray(S);
		
		int resultL = RicercaArray.Linereserch(value, S);
		System.out.println("ricerca sequenziale: " + resultL);

		OrdinaArrayObject.PrintArray(S);
		in.close();

	}

	
}
