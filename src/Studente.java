

import java.util.Random;

public class Studente implements Comparable<Studente> {

	int matricola;
	float mediaVoti;
	int nroEsamiSostenuti;
	int nroLodi;
	private static int matricolaCount = 0;
	
	
	/**
	 * constructor
	 */
	public Studente() {
		matricola = matricolaCount++;
		mediaVoti = (float) (new Random().nextDouble() * 30.0);
		nroEsamiSostenuti = new Random().nextInt(20) + 1;
		nroLodi = new Random().nextInt(nroEsamiSostenuti) + 1;
	}

	/**
	 * metodo get media voti.
	 * @return media voti
	 */
	public float getMediaVoti() {
		return mediaVoti;
	}

	/**
	 * metodo toString inserire in una stringa il risultato cosi da non ottenere l'indirizzo di memoria.
	 * @return stinga array
	 */
	public String toString() {
		String Array = ("Matricola:" + matricola + " mediaVoti: " + mediaVoti + " nroEsamiSostenuti: " + nroEsamiSostenuti
				+ " nroLodi: " + nroLodi);
		return Array;
	}
	
/**
 * metodo compareTo cosa deve confrontare nel bubble.
 */
	@Override
	public int compareTo(Studente o) {
		if (o.getMediaVoti() < this.mediaVoti) {
			return +1;
		} else if (o.getMediaVoti() > this.mediaVoti) {
			return -1;
		}
		return 0;
	}

}
