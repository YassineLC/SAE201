package formes;
import java.util.ArrayList;

import ardoise.*;

public class Triangle extends Forme {

	private PointPlan p1 ;
	private PointPlan p2 ;
	private PointPlan p3 ;
	
	public Triangle(PointPlan unP1, PointPlan unP2, PointPlan unP3) {
		p1 = unP1 ;
		p2 = unP2 ;
		p3 = unP3 ;
	}
	
	@Override
	public void deplacer(int arg0, int arg1) {
		p1.setAbscisse(p1.getAbscisse() + arg0);
		p1.setOrdonnee(p1.getOrdonnee() + arg1);
		
		p2.setAbscisse(p2.getAbscisse() + arg0);
		p2.setOrdonnee(p2.getOrdonnee() + arg1);
		
		p3.setAbscisse(p3.getAbscisse() + arg0);
		p3.setOrdonnee(p3.getOrdonnee() + arg1);
	}

	@Override
	public ArrayList<Segment> dessiner() {
		
		Segment s1 = new Segment(this.p1, this.p2);
		Segment s2 = new Segment(this.p1, this.p3);
		Segment s3 = new Segment(this.p2, this.p3);
		
		ArrayList<Segment> lSeg = new ArrayList<Segment>();
		
		lSeg.add(s1);
		lSeg.add(s2);
		lSeg.add(s3);
		
		return lSeg;
	}

	@Override
	public String typeForme() {
		return "T" ;
	}

}
