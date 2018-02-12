
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private String attente;
	private String[] competence;
	
	private int exp;
	
	public CV (String nom, String prenom, String formation, int exp, String[] competence, String attente) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.exp = exp;
		this.competence = competence;
		this.attente = attente;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] competenceCharles = {"Patient", "Logique"};
		String[] competencePhilippe = {"debrouillard", "adapte facilement", "apprend facilement"};
		CV charles = new CV("Langevin","Charles","Informatique",0,competenceCharles,"Le passer");
		CV philippe = new CV("chevry","philippe","informatique",0,competencePhilippe,"apprendre de nouvelle chose");
		
		System.out.println("Bienvenue chez Barrette!");
		
		charles.afficher();
		philippe.afficher();
	}
	
	public void afficher() {
		System.out.println("Nom: " + this.nom + "\n");
		System.out.println("Prénom: " + this.prenom + "\n");
		System.out.println("Formation: " + this.formation + "\n");
		System.out.println("Expériences de travail: " + this.exp + "\n");
		
		System.out.println("Compétences:"  );
		for(int i = 0; i < competence.length; i++){
			System.out.println(this.competence[i]);
		}
		
		System.out.println("\nAttentes vis à vis le cours 4B4: " + this.attente + "\n");
	}

}
