package main;
import ardoise.*;
import formes.*;


public class MainMaison {

	public static void main(String[] args) {
		Ardoise ardoise = new Ardoise();
		ardoise.dessinerGraphique();
		
		PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);
		
		Forme maison = new Maison(cm1, cm3);
		maison.dessiner();
		ardoise.ajouterForme(maison);
		
		
		PointPlan e1 = new PointPlan(173, 45);
		PointPlan e2 = new PointPlan(184, 57);
		PointPlan e3 = new PointPlan(174, 66);
		PointPlan e4 = new PointPlan(164, 57);
		
		Etoile etoile = new Etoile("Etoile", e1, e2, e3, e4);
		etoile.dessiner();
		ardoise.ajouterForme(etoile);
		
		Etoile et = new Etoile(etoile);
		et.dessiner();
		ardoise.ajouterForme(et);
		
		et.deplacer(-20, -20);
		
	}
	
}
