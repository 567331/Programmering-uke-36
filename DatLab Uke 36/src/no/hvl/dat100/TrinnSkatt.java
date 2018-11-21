package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TrinnSkatt {

	public static void main(String[] args) {
		String melding ="";
		String tallTxt = showInputDialog("Utregning av trinnskatt. Skriv inn bruttoinntekt:");
		double belop = parseDouble(tallTxt);
		
		if(belop <= 164100) {
			melding = "Ingen sats";
		} else if  (belop <= 230950) {
			melding = "Trinnskatten er: " + belop * 0.0093;
		} else if  (belop <= 580650) {
			melding = "Trinnskatten er: " + belop * 0.0241;
		} else if  (belop <= 934050) {
			melding = "Trinnskatten er: " + belop * 0.1152;
		} else {
			melding = "Trinnskatten er: " + belop * 0.1452;
		}
		
		showMessageDialog(null,melding);
	}
		
}
