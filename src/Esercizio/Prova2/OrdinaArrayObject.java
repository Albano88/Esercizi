package Esercizio.Prova2;
import java.util.Random;

public class OrdinaArrayObject {

	public static void bubblesort(Persona A[]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[j].compareTo(A[i]) > 0){
					//Swap(i, j);
					Persona temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
	}

	static void stampaArray(Persona A[]) {
		for (Persona persona : A) {
			System.out.println(persona);
		}

	}

	public String randomString(int length) {
		String ssource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
		char[] src = ssource.toCharArray();
		char[] buf = new char[length];
		for (int i = 0; i < length; i++)
			buf[i] = src[new Random().nextInt(src.length)];
		return new String(buf);
	}

	private static void Swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public static void main(String[] args) {
		Persona[] P = new Persona[10];
		for (int i = 0; i < P.length; i++) {
			P [i]= new Persona();
		}
		OrdinaArrayObject.stampaArray(P);
		OrdinaArrayObject.bubblesort(P);

	}

}
