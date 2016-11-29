package Esercizio1;

public class Studente implements Comparable {
	int matricola;
	float mediaVoti;
	int nroEsamiSostenuti;
	int nroLodi;

	public Studente(int matricola, float mediaVoti, int nroEsamiSostenuti, int nroLodi) {
		super();
		this.matricola = matricola;
		this.mediaVoti = mediaVoti;
		this.nroEsamiSostenuti = nroEsamiSostenuti;
		this.nroLodi = nroLodi;
	}

	private float getMediaVoti() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (((Studente) o).getMediaVoti() < this.mediaVoti)
			return +1;
		else if (((Studente) o).getMediaVoti() > this.mediaVoti)
			return -1;
		return 0;
	}

	public String Tostring() {
		String array = ("Matricola: " + matricola + " MediaVoti: " + mediaVoti + " nroEsamiSostenuti: "
				+ nroEsamiSostenuti + " nroLodi: " + nroLodi);
		return array;
	}

	public static void main(String rgs[]) {
		Studente s[] = new Studente[4];
		//OrdinaArrayObject O = new OrdinaArrayObject();
		s[0] = new Studente(4, (float) 28.5, 10, 3);
		s[1] = new Studente(6, (float) 24.5, 12, 5);
		s[2] = new Studente(8, (float) 26.5, 15, 1);
		s[3] = new Studente(10, (float) 22.5, 14, 4);
		
		int tempI = 0; // cerca minimo
		for (int i = 1; i < s.length; i++) {
			if (s[i].compareTo(s[tempI]) < 0)
				tempI = i;
		}
		//O.bubblesort(s[tempI]);
		System.out.println(s[tempI].Tostring());
	}

}
