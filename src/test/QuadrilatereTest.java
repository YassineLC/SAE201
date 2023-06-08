package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import ardoise.*;
import formes.*;

public class QuadrilatereTest 
{
	@Test
	public void testTour() 
	{
		Ardoise ardoise = new Ardoise();
		ardoise.dessinerGraphique();
		
		PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);

		Forme corpsMaison1 = new Quadrilatere();
		Forme corpsMaison2 = new Quadrilatere("Corps Maison 1", cm1, cm3);
		Forme corpsMaison3 = new Quadrilatere(cm1, cm3);
		
		Quadrilatere q = (Quadrilatere) corpsMaison2;
	    Forme corpsMaison4 = new Quadrilatere(q);
        
		ardoise.ajouterForme(corpsMaison1);
        ardoise.ajouterForme(corpsMaison2);
        ardoise.ajouterForme(corpsMaison3);
        ardoise.ajouterForme(corpsMaison4);
        
        corpsMaison1.dessiner();
        corpsMaison2.dessiner();
        corpsMaison2.deplacer(5, 1);
        
        assertEquals("Q", corpsMaison1.typeForme());
        assertEquals(corpsMaison2.dessiner().get(0).getPointDepart(), cm1);
        assertNotEquals(corpsMaison2, corpsMaison3);
	}
}