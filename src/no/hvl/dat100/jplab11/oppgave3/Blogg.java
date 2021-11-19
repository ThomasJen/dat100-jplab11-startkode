package no.hvl.dat100.jplab11.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggstabell;
	private int nesteledige;
	private int antall;
	
	
	
	public Blogg() {
		
		innleggstabell = new Innlegg[20];
		nesteledige = 0;
		
	}

	public Blogg(int lengde) {
		
		innleggstabell = new Innlegg[lengde];
		nesteledige = 0;
		
	}

	public int getAntall() {
		
		return antall;
		
	}
	
	public Innlegg[] getSamling() {
		
		return innleggstabell;
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while(pos<nesteledige && !funnet) {
			if (innleggstabell[pos].getId() == innlegg.getId()) {
				funnet = true;
			}else {
				pos++;
			}
		}
			if (funnet) {
				return pos;
			}else {
				return -1;
			}	
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) 
			return true;
		else
			return false;		
	}

	public boolean ledigPlass() {
	
			return nesteledige < innleggstabell.length;
		
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean leggtil = finnes(innlegg);
		if (leggtil && nesteledige < innleggstabell.length ) {
			innleggstabell[nesteledige] = innlegg;
			nesteledige++;
			return true;
		}else {
			
		return false;
		
		}
	}
	
	@Override
	public String toString() {
		
		return "Blogg [innleggstabell=" + Arrays.toString(innleggstabell) + ", nesteledige=" + nesteledige + ", antall=" + antall + "]";
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}