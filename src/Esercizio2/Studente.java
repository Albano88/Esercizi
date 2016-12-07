package Esercizio2;

import java.util.Random;


public class Studente implements Comparator<Studente>, Comparable{

	private float mediaVoti;
	private int nroLodi;
	private int matricola;
	private int nroEsamiSostenuti;

	private static int matricolaCount = 0;

	/**
	 * costructor.
	 */
	 Studente() {
		matricola = matricolaCount++;
		mediaVoti = (float) (new Random().nextDouble() * 30.0);
		nroEsamiSostenuti = new Random().nextInt(20) + 1;
		nroLodi = new Random().nextInt(nroEsamiSostenuti) + 1;
	}
	 
	 Studente(int matricola) {
		this.matricola = matricola;
		mediaVoti = (float) (new Random().nextDouble() * 30.0);
		nroEsamiSostenuti = new Random().nextInt(20) + 1;
		nroLodi = new Random().nextInt(nroEsamiSostenuti) + 1;
	}

	 /**
	  * metodo getNrolodi
	  * @return nrolodi
	  */
	public int getNroLodi() {
		return nroLodi;
	}


	public int getMatricola() {
		return matricola;
	}



	/**
	 * metodo di cofronto dei valori dell'oggetto
	 * @param o array di oggetti da confrontare
	 * @return +1,-1,0
	 */
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (( (Studente) o).getNroLodi() < this.nroLodi)
			return +1;
		else if (((Studente) o).getNroLodi() > this.nroLodi)
			return -1;
		return 0;
	}
	
	
	
	@Override
	public int compare(Studente a) {
		// TODO Auto-generated method stub
		if(a.getMatricola()< this.getMatricola()) return -1;
		if(a.getMatricola()== this.getMatricola()) return 0;
		return 1;
	}

	@Override
	public String toString() {
		return "Studente [mediaVoti=" + mediaVoti + ", nroLodi=" + nroLodi + ", matricola=" + matricola
				+ ", nroEsamiSostenuti=" + nroEsamiSostenuti + "]";
	}


	
	
}
