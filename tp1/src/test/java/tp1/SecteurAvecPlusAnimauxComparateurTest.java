package tp1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class SecteurAvecPlusAnimauxComparateurTest {
	
	static Secteur s1,s2,s3;
	static Animal ours,ours2,zebre;
	static List<Secteur> l;

	@Before
	public void initTests(){
		
		Comparator<Secteur> monComparateur = new SecteurAvecPlusAnimauxComparateur();
		
		s1 = new Secteur("ours");
		s2 = new Secteur("Zebres");
		s3 = new Secteur("chien");
		ours = new Animal("bob","ours");
		ours2 = new Animal("bobby","ours");
		zebre = new Animal("marc","zebre");
		
		s1.ajouterAnimal(ours);
		s1.ajouterAnimal(ours2);
		s2.ajouterAnimal(zebre);
		
		l = new ArrayList<Secteur>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//Collections.sort(l,monComparateur);
		
	}
	
	@Test
	public void testCompare() {
		Comparator<Secteur> monComparateur = new SecteurAvecPlusAnimauxComparateur();
		
		

		Assert.assertEquals(2, l.get(0).getNombreAnimaux());
		
		Collections.sort(l,monComparateur);
		
		Assert.assertEquals(0, l.get(0).getNombreAnimaux());
		
		//fail("Not yet implemented");
	}

}
