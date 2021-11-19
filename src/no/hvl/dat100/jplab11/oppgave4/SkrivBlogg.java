package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) throws FileNotFoundException {
		
		
		File fil = new File(mappe+filnavn);
		
		
		
		try {
			PrintWriter skriver = new PrintWriter(fil);
			skriver.print(samling.toString());
			skriver.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Fil finnes ikke");
			return false;
			
		}
		return true;
		
	}
}
