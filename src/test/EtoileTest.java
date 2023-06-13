package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import ardoise.*;
import formes.*;

public class EtoileTest 
{
	@Test
    public void testEtoile()
    {
    	Ardoise ardoise = new Ardoise();
    	
    	PointPlan e1 = new PointPlan(173, 45);
    	PointPlan e2 = new PointPlan(184, 57);
    	PointPlan e3 = new PointPlan(174, 66);
    	PointPlan e4 = new PointPlan(164, 57);
    	
    	Forme etoile1 = new Etoile();
    	Forme etoile2 = new Etoile("Etoile",e1,e2,e3,e4);
    	Forme etoile3 = new Etoile(e1,e2,e3,e4);
    	
    	Etoile e_cast = (Etoile) etoile3;
    	Forme etoile4 = new Etoile(e_cast);
    	
    	ardoise.ajouterForme(etoile1);
        ardoise.ajouterForme(etoile2);
        ardoise.ajouterForme(etoile3);
        
        etoile2.dessiner();
        etoile2.deplacer(5, 1);
        
        assertEquals("GF", etoile2.typeForme());
        assertNotEquals(etoile2, etoile3);
        PointPlan e5 = new PointPlan(175,53);
        PointPlan e6 = new PointPlan(178,46);
        Segment seg = new Segment(e5,e6);
        assertNotEquals(etoile2.dessiner().get(0), seg);
    }
}