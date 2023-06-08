package main;

import ardoise.*;
import formes.*;

public class MainArdoise 
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
		
		
		PointPlan pmaison1 = new PointPlan(80, 140);
		PointPlan pmaison3 = new PointPlan(180, 198);
		
		Forme maison = new Maison(pmaison1, pmaison3);
		maison.dessiner();
		ardoise.ajouterForme(maison);
		
		
		PointPlan e1 = new PointPlan(173, 45);
		PointPlan e2 = new PointPlan(184, 57);
		PointPlan e3 = new PointPlan(174, 66);
		PointPlan e4 = new PointPlan(164, 57);
		
		Forme etoile = new Etoile("Etoile",e1,e2,e3,e4);
		etoile.dessiner();
		ardoise.ajouterForme(etoile);
		System.out.println("aaaaa");
		System.out.println(etoile.dessiner().get(0));
		System.out.println("aaaaa");
		etoile.deplacer(-50,  10);
	}
}