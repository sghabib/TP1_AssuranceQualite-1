package Partie2;

public class Facture{
	
	java.text.DecimalFormat df = new java.text.DecimalFormat("0.00$");
	
	private String[] clients;
	
	private double[] prix;
	
	public Facture(String[] clientsM, double[] prixM){
		this.clients = clientsM;
		this.prix = prixM;	
		afficher();
	}
	
	public void afficher(){
		
		System.out.println("Bienvenue chez Barette!");
		System.out.println("Factures:");
		
		for(int i = 0; i < clients.length; i++) {
			System.out.println(clients[i] + " " + df.format(prix[i]));
		}		
	}

}
