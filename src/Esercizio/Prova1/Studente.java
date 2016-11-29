package Esercizio.Prova1;

public class Studente implements Comparable<Studente> {

	int matricola;
	float mediaVoti;
	int nroEsamiSostenuti;
	int nroLodi;

	public float getMediaVoti() {
		// TODO Auto-generated method stub
		return 0;
	}

	// private static int matricolaCount = 0;

	public Studente(int matricola, float mediaVoti, int nroEsamiSostenuti, int nroLodi) {
		super();
		this.matricola = matricola;
		this.mediaVoti = mediaVoti;
		this.nroEsamiSostenuti = nroEsamiSostenuti;
		this.nroLodi = nroLodi;
	}

	/**
	 * costruttore 2
	 */
	// public Studente() {
	// matricola = matricolaCount++;
	// mediaVoti = (float) (new Random().nextDouble() * 30.0);
	// nroEsamiSostenuti = new Random().nextInt(20) + 1;
	// nroLodi = new Random().nextInt(nroEsamiSostenuti) + 1;
	// }

	// to string per far visualizzare i risultati altrimenti esce indirizzo di
	// memoria.
	public String toString() {
		String array = ("matricola: " + matricola + " mediaVoti:" + mediaVoti + " nroEsamiSostenuti: "
				+ nroEsamiSostenuti + " nroLodi: " + nroLodi);
		return array;
	}

	// per far confrontare gli studenti in base alla media voti.
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
