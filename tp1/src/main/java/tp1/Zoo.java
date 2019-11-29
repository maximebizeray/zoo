package tp1;

import java.util.ArrayList;

public class Zoo extends Secteur {

	private static String typeAnimauxDansSecteur;
	int limiteVisiteur=15;
	int Visiteurs=0;	
	int nbAnimaux=0;
	ArrayList<Secteur> secteurAnimaux = new ArrayList<Secteur>();
	
	public Zoo() {
		super(typeAnimauxDansSecteur);
	}
	
	public void ajouterSecteur(String secteur) {
		Secteur sct = new Secteur(secteur);
		secteurAnimaux.add(sct);
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		if(this.Visiteurs<getLimiteVisiteur())
			this.Visiteurs +=1;
		else {
			new LimiteVisiteurException();
		}
	}
	
	public void ajouterSecteur(Secteur secteur) {
		secteurAnimaux.add(secteur);
	}
	
	public int getLimiteVisiteur() {
		return this.limiteVisiteur;
	}
	
	public void nouvelAnimal(Animal a) {
		if (a.getTypeAnimal().equals(typeAnimauxDansSecteur)) {
			animauxDansSecteur.add(a);
		}
	}
	
	public int nombreAnimaux() {
		return this.nbAnimaux;
	}
}
