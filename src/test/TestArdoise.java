package test;

import ardoise.*;
import formes.*;

public class TestArdoise {

	public static void main(String[] args) 
	{
		
		Ardoise ardoise = new Ardoise();
		
		PointPlan p1 = new PointPlan(3,14);
		PointPlan p2 = new PointPlan(43,3);
		PointPlan p3 = new PointPlan(112, 14);
		
		Forme montagne1 = new Triangle(p1,p2,p3);
		
		System.out.println(montagne1.dessiner());
		
		
		
		
		
		ardoise.ajouterForme(montagne1);
		ardoise.dessinerGraphique();
		
	}

}
