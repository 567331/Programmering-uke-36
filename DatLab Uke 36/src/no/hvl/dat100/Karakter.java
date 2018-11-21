package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Karakter {
	
	public static void main(String[] args){
		
		int studenter = 10;
		int i = 1;
		
		while(i <= studenter) {
		String melding = "";
		String tallTxt = showInputDialog("Oppgi en poengsum mellom 0-100");
		int tall = parseInt(tallTxt);
		if (tall < 0) {
			melding = "Ugyldig poengsum";
			i -= 1;
		} else if (tall <= 39) {
			melding = "Karakter F";
		} else if (tall <= 49) {
			melding = "Karakter E";
		} else if (tall <= 59) {
			melding = "Karakter D";
		} else if (tall <= 79) {
			melding = "Karakter C";
		} else if (tall <= 89) {
			melding = "Karakter B";
		} else if (tall <= 100) {
			melding = "Karakter A";
		} else {
			melding = "Ugyldig poensum";
			i -= 1;
		}
		
        showMessageDialog(null,melding);
	
	} i++;
	}
	
}


