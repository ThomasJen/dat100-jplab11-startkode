package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariabler
	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private int likes;
	
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst= tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		this.id = id;
		this.likes = likes;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst= tekst;
		
		
	}
	
	public String getTekst() {
		
		return tekst;
		
	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
	}

	@Override
	public String toString() {
		
		return id+" "+bruker+" "+dato+" "+tekst+" "+likes;
		

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
