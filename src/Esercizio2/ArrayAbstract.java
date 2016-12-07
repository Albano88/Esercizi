package Esercizio2;

public abstract class ArrayAbstract<T> {
	

	/**
	 * metodo di stampa dell array
	 * 
	 * @param S
	 */
	public static void PrintArray(Studente[] S) {
		for (Studente stud : S) {
			System.out.println(stud);
		}
	}

	
}
