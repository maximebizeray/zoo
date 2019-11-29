package tp1;

import java.util.ArrayList;

public class Secteur {

		ArrayList<Animal> animauxDansSecteur = new ArrayList<Animal>();
		String typeAnimauxDansSecteur;
		
		public Secteur(String typeAnimauxSecteur) {
			this.typeAnimauxDansSecteur = typeAnimauxSecteur;
		}
		
		public void ajouterAnimal(Animal a) {
			animauxDansSecteur.add(a);
			
		}
		
		public int getNombreAnimaux() {
			return animauxDansSecteur.size();
		}
		
		public String getType() {
			return typeAnimauxDansSecteur;
		}
}
