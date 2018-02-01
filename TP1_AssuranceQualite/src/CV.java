
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int exp;
	private String[] competence;
	private String attente;
	
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
		CV philippe = new CV("philippe","chevry","informatique",0,competencePhilippe,"apprendre de nouvelle chose");
		
		charles.afficher();
		philippe.afficher();
	}
	
	public void afficher() {
		
	}

}
