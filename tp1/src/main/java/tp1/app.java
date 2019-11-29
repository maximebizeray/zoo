package tp1;

import java.util.ArrayList;
import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class app extends Zoo{

	public static void main(String[] args) throws LimiteVisiteurException {
		
		final Logger logger = LogManager.getLogger(app.class);
		
		
		
		Zoo zoo = new Zoo();
		Secteur s1 = new Secteur("ours");
		Secteur s2 = new Secteur("Zebres");
		Secteur s3 = new Secteur("chien");
		Animal ours = new Animal("bob","ours");
		Animal ours2 = new Animal("bobby","ours");
		Animal zebre = new Animal("marc","zebre");
		
		logger.info(" Nouvel animal de type : " +ours.getTypeAnimal().toString() +" Nom : "+ours.getNomAnimal().toString());
		logger.info(" Nouvel animal de type : " +ours2.getTypeAnimal().toString() +" Nom : "+ours2.getNomAnimal().toString());
		logger.info(" Nouvel animal de type : " +zebre.getTypeAnimal().toString() +" Nom : "+zebre.getNomAnimal().toString());
		logger.warn(" Nouvel animal de type : " +zebre.getTypeAnimal().toString() +" Nom : "+zebre.getNomAnimal().toString());
		
				
		zoo.nouveauVisiteur();
		zoo.nouveauVisiteur();
		zoo.nouveauVisiteur();
		
		s1.ajouterAnimal(ours);
		s1.ajouterAnimal(ours2);
		s2.ajouterAnimal(zebre);
		
		
		List<Secteur> l = new ArrayList<Secteur>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
	}

}
