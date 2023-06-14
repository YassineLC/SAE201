package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import ardoise.*;
import formes.*;

public class MaisonTest
{
	@Test
    public void testMaison() 
    {
    	Ardoise ardoise = new Ardoise();
		
		PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);
	
		Forme maison1 = new Maison();
		Forme maison2 = new Maison("Maison", cm1, cm3);
		Forme maison3 = new Maison(cm1, cm3);
		
		Maison m = (Maison) maison3;
	    Forme maison4 = new Maison(m);
		
		ardoise.ajouterForme(maison1);
		ardoise.ajouterForme(maison2);
		ardoise.ajouterForme(maison3);
		ardoise.ajouterForme(maison4);
		
		maison2.dessiner();
		maison2.deplacer(5, 1);
		
		assertEquals("GF", maison1.typeForme());
		assertEquals(maison2.dessiner().get(0).getPointDepart(), cm1);
		assertNotEquals(maison2, maison3);
		try 
		{
			maison2.deplacer(2010, 10);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("Le point " + maison2 + " n'a pas pu être déplacé.");
		}
    }
}