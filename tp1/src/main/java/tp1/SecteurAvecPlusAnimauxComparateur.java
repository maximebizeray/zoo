package tp1;

import java.util.Comparator;

public class SecteurAvecPlusAnimauxComparateur implements Comparator<Secteur>{

	
	public int compare(Secteur s1, Secteur s2) {
		
		Integer nbAnimauxS1 = s1.getNombreAnimaux();
		Integer nbANimauxS2 = s2.getNombreAnimaux();
		Integer nbAnimauxSecteurCompare = nbAnimauxS1.compareTo(nbANimauxS2);
		
		return nbAnimauxSecteurCompare;
		
	}

}
