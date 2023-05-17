package test;

import ardoise.*;
import formes.*;

public class TestArdoise {

	public static void main(String[] args) throws InterruptedException
	{
		
		Ardoise ardoise = new Ardoise();
		ardoise.dessinerGraphique();
		
		PointPlan p1 = new PointPlan(3,14);
		PointPlan p2 = new PointPlan(43,3);
		PointPlan p3 = new PointPlan(112, 14);
		
		Forme montagne1 = new Triangle(p1,p2,p3);
		montagne1.dessiner();
		
		
		PointPlan pm1 = new PointPlan(152,7);
		PointPlan pm2 = new PointPlan(166,3);
		PointPlan pm3 = new PointPlan(172,7);
		
		Forme montagne2 = new Triangle(pm1,pm2,pm3);
		montagne2.dessiner();
		
		
		PointPlan po1 = new PointPlan(118, 13);
		PointPlan po2 = new PointPlan(123, 20);
		PointPlan po3 = new PointPlan(128, 13);
		
		Forme oiseau1 = new Chapeau(po1, po2, po3);
		oiseau1.dessiner();
		
		
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
		ardoise.ajouterForme(oiseau1);
		
		
	}

}
