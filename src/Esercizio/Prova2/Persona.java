package Esercizio.Prova2;

import java.util.Random;

public class Persona implements Comparable<Persona>{

	private static int matricolaCount=0;
	
	int matricola;
	float mediaVoti;
	int nroEsamiSostenuti;
	int nroLodi;
	
	
	public Persona(){
	matricola=matricolaCount++;
	mediaVoti=(float)(new Random().nextDouble()*30.0);
	nroEsamiSostenuti=new Random().nextInt(20)+1;
	nroLodi=new Random().nextInt(nroEsamiSostenuti)+1;
	}
	
	public String Tostring(){
		String array =  ("matricola: " + matricola + " mediaVoti:" + mediaVoti + " nroEsamiSostenuti: "
				+ nroEsamiSostenuti + " nroLodi: " + nroLodi);
		return array;
	}

	private float getMediaVoti() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if(o.getMediaVoti()<this.mediaVoti) return +1;
		else
		if(o.getMediaVoti()>this.mediaVoti) return -1;
		return 0;
	}
	
	public String toString() {
		String Array = ("Matricola:" + matricola + " mediaVoti: " + mediaVoti + " nroEsamiSostenuti: " + nroEsamiSostenuti
				+ " nroLodi: " + nroLodi);
		return Array;
	}

	

	
	

	
}
