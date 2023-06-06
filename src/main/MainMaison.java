package main;
import ardoise.*;
import formes.Maison;


public class MainMaison {

	public static void main(String[] args) {
		Ardoise ardoise = new Ardoise();
		ardoise.dessinerGraphique();
		
		PointPlan cm1 = new PointPlan(80, 140);
		PointPlan cm3 = new PointPlan(180, 198);
		
		Forme maison = new Maison(cm1, cm3);
		maison.dessiner();
		ardoise.ajouterForme(maison);
		
		
		Maison maison_c = (Maison) maison;
		Forme maison2 = new Maison(maison_c);
		maison2.dessiner();
		ardoise.ajouterForme(maison2);
		maison2.deplacer(-70, -90);
		
	}
	
}
