package Esercizio.Prova1;
import java.util.Random;

public class OrdinaArrayObject {

	// ordinamento interi
	static int bubblesort(Integer A[]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		return 0;
	}

	// ordinamento stringhe
	static int bubblesort(String A[]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i].compareTo(A[j]) > 0) {
					String temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}

			}
		}
		return 0;
	}

	static void stampaArray(String A[]) {
		System.out.println("String: " + A);
	}

	public String randomString(int length) {
		String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
		char[] src = ssource.toCharArray();
		char[] buf = new char[length];
		for (int i = 0; i < length; i++)
			buf[i] = src[new Random().nextInt(src.length)];
		return new String(buf);
	}

	// ordinamento array di aoggetti
	static void bubblesort(Studente[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[j].compareTo(A[i]) > 0) {
					Studente temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}

	}

	static void stampaArray(Studente A[]) {
		for (Studente studente : A) {

			System.out.println(studente);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente[] S = new Studente[10];
		S[0] = new Studente(0, 1, 0, 0);
		S[1] = new Studente(0, 2, 0, 0);
		S[2] = new Studente(0, 3, 0, 0);
		S[3] = new Studente(0, 4, 0, 0);
		S[4] = new Studente(0, 5, 0, 0);
		S[5] = new Studente(0, 6, 0, 0);
		S[6] = new Studente(0, 7, 0, 0);
		S[7] = new Studente(0, 8, 0, 0);
		S[8] = new Studente(0, 9, 0, 0);
		S[9] = new Studente(0, 10, 0, 0);
		// // creo i 10 array di tipo studente
		// for (int i = 0; i < S.length; i++) {
		//
		// S[i] = new Studente();
		// }

		OrdinaArrayObject.bubblesort(S);
		OrdinaArrayObject.stampaArray(S);

	}

}
