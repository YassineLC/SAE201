package formes;

import java.util.ArrayList;
import ardoise.*;

public class Maison extends Forme {
	
	private PointPlan p1;
	private PointPlan p3;
	private Chapeau toit ;
	private Quadrilatere corps ;
	private Quadrilatere porte ;
	
	
	public Maison() 
	{
	}
	
	public Maison(PointPlan p1_corps, PointPlan p3_corps) {
		this.p1 = p1_corps;
		PointPlan p2_corps = new PointPlan(p3_corps.getAbscisse(), p1_corps.getOrdonnee());
		this.p3 = p3_corps;
		this.corps = new Quadrilatere(this.p1, this.p3);
		
		PointPlan p1_toit = new PointPlan(p1_corps.getAbscisse(), p1_corps.getOrdonnee());
		PointPlan p3_toit = new PointPlan(p2_corps.getAbscisse(), p2_corps.getOrdonnee());
		PointPlan p2_toit = new PointPlan((p1_toit.getAbscisse() + p3_toit.getAbscisse())/2, p1_corps.getOrdonnee()-40);
		this.toit = new Chapeau(p1_toit, p2_toit, p3_toit);
		
		PointPlan p1_porte = new PointPlan(p1_corps.getAbscisse()+40, p1_corps.getOrdonnee()+30);
		PointPlan p2_porte = new PointPlan(p3_corps.getAbscisse()-40, p3_corps.getOrdonnee());
		this.porte = new Quadrilatere(p1_porte, p2_porte);
		
	}
	
	public Maison(String unNom, PointPlan p1_corps, PointPlan p3_corps) {
		super(unNom);
		this.p1 = p1_corps;
		PointPlan p2_corps = new PointPlan(p3_corps.getAbscisse(), p1_corps.getOrdonnee());
		this.p3 = p3_corps;
		this.corps = new Quadrilatere(this.p1, this.p3);
		
		PointPlan p1_toit = new PointPlan(p1_corps.getAbscisse(), p1_corps.getOrdonnee());
		PointPlan p3_toit = new PointPlan(p2_corps.getAbscisse(), p2_corps.getOrdonnee());
		PointPlan p2_toit = new PointPlan((p1_toit.getAbscisse() + p3_toit.getAbscisse())/2, p1_corps.getOrdonnee()-40);
		this.toit = new Chapeau(p1_toit, p2_toit, p3_toit);
		
		PointPlan p1_porte = new PointPlan(p1_corps.getAbscisse()+40, p1_corps.getOrdonnee()+30);
		PointPlan p2_porte = new PointPlan(p3_corps.getAbscisse()-40, p3_corps.getOrdonnee());
		this.porte = new Quadrilatere(p1_porte, p2_porte);
	}
	
	public Maison(Maison m)
	{
		super(m.getNomForme());
		this.corps = new Quadrilatere(m.corps);
		this.porte = new Quadrilatere(m.porte);
		this.toit = new Chapeau(m.toit);
	}

	public void deplacer(int arg0, int arg1) {
		toit.deplacer(arg0, arg1);
		corps.deplacer(arg0, arg1);
		porte.deplacer(arg0, arg1);
	}

	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> Seg = new ArrayList<Segment>();
		
		for(int i=0; i<this.corps.dessiner().size(); i++) {
			Seg.add(this.corps.dessiner().get(i));
		}
		
		for(int i=0; i<this.toit.dessiner().size(); i++) {
			Seg.add(this.toit.dessiner().get(i));
		}
		
		for(int i=0; i<this.porte.dessiner().size(); i++) {
			Seg.add(this.porte.dessiner().get(i));
		}
		
		return Seg;
	}

	public String typeForme() {
		return "GF";
	}

}
