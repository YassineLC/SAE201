package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import ardoise.*;
import formes.*;

public class ChapeauTest 
{
	@Test
	public void testOiseau() 
	{
		Ardoise ardoise = new Ardoise();
       
		PointPlan po1 = new PointPlan(118, 13);
        PointPlan po2 = new PointPlan(123, 20);
        PointPlan po3 = new PointPlan(128, 13);
        
        Forme oiseau1 = new Chapeau();
        Forme oiseau2 = new Chapeau("Oiseau1", po1, po2, po3);
        Forme oiseau3 = new Chapeau(po1, po2, po3);
   
        Chapeau c = (Chapeau) oiseau3;
        Forme oiseau4 = new Chapeau(c);
        
        ardoise.ajouterForme(oiseau1);
        ardoise.ajouterForme(oiseau2);
        ardoise.ajouterForme(oiseau3);
        ardoise.ajouterForme(oiseau4);
        
        oiseau2.deplacer(5, 5);
        oiseau1.dessiner();
        oiseau2.dessiner();
        
        assertEquals("C", oiseau1.typeForme());
        assertEquals(oiseau2.dessiner().get(0).getPointDepart(), po1);
        assertNotEquals(oiseau2, oiseau3);
	}
}