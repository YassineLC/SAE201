package test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ardoise.*;
import formes.*;

public class MainArdoiseTest 
{
    @Test
    public void testMontagne1() 
    {
        Ardoise ardoise = new Ardoise();
        PointPlan m1 = new PointPlan(3,14);
        PointPlan m2 = new PointPlan(43,3);
        PointPlan m3 = new PointPlan(112, 14);
        Forme montagne1 = new Triangle("montagne1", m1,m2,m3);

        ardoise.ajouterForme(montagne1);
        
        assert montagne1 != null;
        assertEquals("T", montagne1.typeForme());
        
        montagne1.deplacer(5, -3);
    }

    @Test
    public void testCorpsMaison1() 
    {
        Ardoise ardoise = new Ardoise();
        PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);
        Forme corpsMaison1 = new Quadrilatere("Corps Maison 1", cm1, cm3);
        
        ardoise.ajouterForme(corpsMaison1);

        assert corpsMaison1 != null;
        assert corpsMaison1.dessiner() != null;
        assertEquals("Q", corpsMaison1.typeForme());
    }

    @Test
    public void testOiseau1() 
    {
        Ardoise ardoise = new Ardoise();
        PointPlan po1 = new PointPlan(118, 13);
        PointPlan po2 = new PointPlan(123, 20);
        PointPlan po3 = new PointPlan(128, 13);
        Forme oiseau1 = new Chapeau("Oiseau1", po1, po2, po3);

        ardoise.ajouterForme(oiseau1);
        
        assert oiseau1 != null;
        assert oiseau1.dessiner() != null;
        assertEquals("C", oiseau1.typeForme());
       
    }
    
    @Test
    public void testGetTypeMaison() 
    {
    	Ardoise ardoise = new Ardoise();
		
		PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);
		
		Forme maison = new Maison(cm1, cm3);
		maison.dessiner();
		ardoise.ajouterForme(maison);

		assert maison.dessiner() != null;
		assertEquals("GF", maison.typeForme());
    }
    
    @Test
    public void testEtoile()
    {
    	Ardoise ardoise = new Ardoise();
    	
    	PointPlan e1 = new PointPlan(173, 45);
    	PointPlan e2 = new PointPlan(184, 57);
    	PointPlan e3 = new PointPlan(174, 66);
    	PointPlan e4 = new PointPlan(164, 57);
	
    	Forme etoile = new Etoile("Etoile",e1,e2,e3,e4);
    	etoile.dessiner();
    	ardoise.ajouterForme(etoile);
    	
    }
}