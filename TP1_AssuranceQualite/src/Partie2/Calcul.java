package Partie2;

public class Calcul {
	
	public String[] clients = {"Roger","Céline","Steeve"};
	private String[][] plats = {{"Poutine","10.5"},{"Frites","2.5"},{"Repas_Poulet","15.75"}};
	private String[][] commandes = {{"Roger","Poutine","1"},{"Céline","Frites","2"},{"Céline","Repas_Poulet","1"}};;
	
	public double[] prix;
	
	public Calcul() {
		prix = new double[clients.length];
		
		faireCalcul();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calcul();
	}
	
	private void faireCalcul() {
		double resultatPrix = 0;
		
		for(int i = 0; i < clients.length; i++) {
			String client = clients[i];
			
			for(int j = 0; j < commandes.length; j++) {
				if(client.equals(commandes[j][0])) {
					String plat = commandes[j][1];
					
					for(int k = 0; k < plats.length; k++) {
						if(plat.equals(plats[k][0])) {
							try {
								double nb = Double.parseDouble(commandes[j][2]);
								double prixUnit = Double.parseDouble(plats[k][1]);
								resultatPrix = nb * prixUnit;
							}catch(NumberFormatException e) {
								System.out.print("Erreur calcul");
							}				
						}
					}
				}
				prix[i] += resultatPrix;
				resultatPrix = 0;
			}			
		}
		
		new Facture(clients, prix);
	}
}
