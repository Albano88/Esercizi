import java.util.Random;
import java.util.Scanner;

public class OrdinaArrayObject {

	/**
	 * metodo di ordinamento BubbleSort per Stringhe
	 * @param A sringa in ingresso
	 * @return (facoltativo per questo caso.)
	 */
	static int bubblesort(String A[]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[j].compareTo(A[i]) > 0) {
					String temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		return 0;

	}
	/**
	 * metodo di stampa Stringhe
	 * @param A strnga in ingresso da stampare
	 */
	static void stampaArray(String A) {

		System.out.println("array:  " + A);
	}

	
	
	/**
	 * metodo di generazione stringhe random.
	 * @param length lungheza della stringa da generare
	 * @return stringa
	 */
	public String randomString(int length) {
		String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
		char[] src = ssource.toCharArray();
		char[] buf = new char[length];
		for (int i = 0; i < length; i++)
			buf[i] = src[new Random().nextInt(src.length)];
		return new String(buf);
	}

	
/**
 * metodo di ordinamento BubbleSort per array di oggetti
 * @param A array di oggetti da ordinare
 */
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
/**
 * metodo di stampa array di oggetti
 * @param A array da stampare
 */
	static void stampaArray(Studente A[]) {
		for (Studente studente : A) {
			System.out.println(studente);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * main per oggetti
		 */
		Studente[] S = new Studente[10];
		for (int i = 0; i < S.length; i++) {

			S[i] = new Studente();
		}

		OrdinaArrayObject.bubblesort(S);
		OrdinaArrayObject.stampaArray(S);

		
		/**
		 * main per stringhe;
		 */
		// OrdinaArrayObject O = new OrdinaArrayObject();
		// Scanner in = new Scanner(System.in);
		// System.out.println("inserire lunghezza stringa :");
		// int length = in.nextInt();
		// String array= O.randomString(length);
		// stampaArray(array);
		// in.close();

	}

}
