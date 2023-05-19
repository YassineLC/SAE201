package formes;

import java.util.ArrayList;
import ardoise.*;

public class Triangle extends Forme {

	private PointPlan p1 ;
	private PointPlan p2 ;
	private PointPlan p3 ;
	private PointPlan[] lPoints ;
	
	public Triangle(PointPlan unP1, PointPlan unP2, PointPlan unP3) {
		
		this.p1 = unP1 ;
		this.p2 = unP2 ;
		this.p3 = unP3 ;
		
		this.lPoints = new PointPlan[3];
		
		this.lPoints[0] = this.p1 ;
		this.lPoints[1] = this.p2 ;
		this.lPoints[2] = this.p3 ;
		
		
	}
	
	@Override
	public void deplacer(int arg0, int arg1) {
		
		for (int i=0 ; i<this.lPoints.length; i++) {
			this.lPoints[i].setAbscisse(this.lPoints[i].getAbscisse() + arg0);
			this.lPoints[i].setOrdonnee(this.lPoints[i].getOrdonnee() + arg1);
		}
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
