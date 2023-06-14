package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import ardoise.*;
import formes.*;

public class TriangleTest 
{
	@Test
	public void testMontagne() 
	{
		Ardoise ardoise = new Ardoise();
		
	    PointPlan m1 = new PointPlan(3,14);
	    PointPlan m2 = new PointPlan(43,3);
	    PointPlan m3 = new PointPlan(112, 14);
	    
	    Forme montagne1 = new Triangle();
	    Forme montagne2 = new Triangle("montagne1", m1,m2,m3);
	    Forme montagne3 = new Triangle(m1, m2, m3);
	    
	    Triangle t = (Triangle) montagne3;
	    Forme montagne4 = new Triangle(t);

	    ardoise.ajouterForme(montagne1);
	    ardoise.ajouterForme(montagne2);
	    ardoise.ajouterForme(montagne3);
	    ardoise.ajouterForme(montagne4);
	    
	    montagne1.dessiner();
	    montagne2.dessiner();
	    montagne3.dessiner();
	    montagne4.dessiner();
	    montagne2.deplacer(5, 1);
	    
	    assertEquals("T", montagne2.typeForme());
	    assertEquals(montagne2.dessiner().get(0).getPointDepart(), m1);
	    assertNotEquals(montagne2, montagne3);
	    
	    try 
		{
			montagne3.deplacer(2010, 10);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("Le point " + montagne3 + " n'a pas pu être déplacé.");
		}
	}
}
