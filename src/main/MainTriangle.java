package main;

import ardoise.*;
import formes.Triangle;

public class MainTriangle {
	public static void main(String[] args)
	{
		Ardoise ardoise = new Ardoise();
		ardoise.dessinerGraphique();
		
		PointPlan p1 = new PointPlan(3,14);
		PointPlan p2 = new PointPlan(43,3);
		PointPlan p3 = new PointPlan(112, 14);
		
		Triangle montagne1 = new Triangle("montagne1", p1,p2,p3);
		montagne1.dessiner();
		
		ardoise.ajouterForme(montagne1);
	}
}