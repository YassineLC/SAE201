package test;

import ardoise.*;
import formes.*;

public class TestArdoise 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		Ardoise ardoise = new Ardoise();
		ardoise.dessinerGraphique();
		
		PointPlan p1 = new PointPlan(3,14);
		PointPlan p2 = new PointPlan(43,3);
		PointPlan p3 = new PointPlan(112, 14);
		
		
		Forme montagne1 = new Triangle("montagne1", p1,p2,p3);
		montagne1.dessiner();
		
		
		PointPlan pm1 = new PointPlan(152,7);
		PointPlan pm2 = new PointPlan(166,3);
		PointPlan pm3 = new PointPlan(172,7);
		
		Forme montagne2 = new Triangle("montagne2", pm1,pm2,pm3);
		montagne2.dessiner();
		
		
		PointPlan po1 = new PointPlan(118, 13);
		PointPlan po2 = new PointPlan(123, 20);
		PointPlan po3 = new PointPlan(128, 13);
		
		Forme oiseau1 = new Chapeau("Oiseau1", po1, po2, po3);
		oiseau1.dessiner();
		
		
		PointPlan Po1 = new PointPlan(133, 30);
		PointPlan Po2 = new PointPlan(136, 32);
		PointPlan Po3 = new PointPlan(138, 30);
		
		Forme oiseau2 = new Chapeau("Oiseau2", Po1, Po2, Po3);
		oiseau2.dessiner();
	
		
		PointPlan o1 = new PointPlan(142, 14);
		PointPlan o2 = new PointPlan(144, 17);
		PointPlan o3 = new PointPlan(146, 14);
		
		Forme oiseau3 = new Chapeau("Oiseau3", o1, o2, o3);
		oiseau3.dessiner();
		
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
		ardoise.ajouterForme(oiseau1);
		ardoise.ajouterForme(oiseau2);
		ardoise.ajouterForme(oiseau3);
		
		
		PointPlan t1 = new PointPlan(9, 100);
		PointPlan t3 = new PointPlan(20, 198);
		
		Forme tour1 = new Quadrilatere("Tour1", t1,t3);
		tour1.dessiner();
		ardoise.ajouterForme(tour1);
		
		PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);
			
		PointPlan Pm1 = new PointPlan(120, 170);
		PointPlan Pm3 = new PointPlan(140, 198);
		
		PointPlan tm1 = new PointPlan(80, 140);
		PointPlan tm2 = new PointPlan(130, 100);
		PointPlan tm3 = new PointPlan(180, 140);
		
		Forme Maison1 = new Maison("Maison1", cm1, cm3, Pm1, Pm3, tm1, tm2, tm3);
		Maison1.dessiner();
		ardoise.ajouterForme(Maison1);
		
		PointPlan pe1 = new PointPlan(170, 52);
		PointPlan pe2 = new PointPlan(173, 45);
		PointPlan pe3 = new PointPlan(177, 52);
		
		Forme branche1 = new Chapeau("Branche1", pe1, pe2, pe3);
		branche1.dessiner();
		
		PointPlan e1 = new PointPlan(177, 52);
		PointPlan e2 = new PointPlan(184, 57);
		PointPlan e3 = new PointPlan(177, 60);
		
		Forme branche2 = new Chapeau("Branche2", e1, e2, e3);
		branche2.dessiner();
		
		PointPlan eb1 = new PointPlan(177, 60);
		PointPlan eb2 = new PointPlan(174, 66);
		PointPlan eb3 = new PointPlan(170, 60);
		
		Forme branche3 = new Chapeau("Branceh3", eb1, eb2, eb3);
		branche3.dessiner();
		
		PointPlan b1 = new PointPlan(170, 60);
		PointPlan b2 = new PointPlan(164, 57);
		PointPlan b3 = new PointPlan(170, 52);
		
		Forme branche4 = new Chapeau("Branche4", b1, b2, b3);
		branche4.dessiner();
		
		ardoise.ajouterForme(branche1);
		ardoise.ajouterForme(branche2);
		ardoise.ajouterForme(branche3);
		ardoise.ajouterForme(branche4);
	}
}