package no.hvl.dat100;


import static javax.swing.JOptionPane.*;

public class HelltallFakultet {
	
	public static void main (String [] args) {
		    
		
			String tallTxt = showInputDialog("Fakultet av heltall. Skriv inn tall større enn 0");
			int n = Integer.parseInt(tallTxt);
	        int result = factorial(n);
	        String melding = "Fakultet av " + n + " er " + result;
	        showMessageDialog(null,melding);
	}
	  public static int factorial(int n) {
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       return result;
	   }

}
