package formes;

import java.util.ArrayList;
import ardoise.*;

public class Triangle extends Forme 
{
	private PointPlan p1 ;
	private PointPlan p2 ;
	private PointPlan p3 ;
	
	public Triangle()
	{
	}
	
	public Triangle(PointPlan unP1, PointPlan unP2, PointPlan unP3) 
	{
		this.p1 = unP1 ;
		this.p2 = unP2 ;
		this.p3 = unP3 ;
	}
	
	public Triangle(String unNom, PointPlan unP1, PointPlan unP2, PointPlan unP3)
	{
		super(unNom);
		this.p1 = unP1 ;
		this.p2 = unP2 ;
		this.p3 = unP3 ;
		
	}
	
	public Triangle(Triangle t)
	{
		super(t.getNomForme()) ;
		this.p1 = new PointPlan(t.p1.getAbscisse(), t.p1.getOrdonnee()) ;
		this.p2 = new PointPlan(t.p2.getAbscisse(), t.p2.getOrdonnee()) ;
		this.p3 = new PointPlan(t.p3.getAbscisse(), t.p3.getOrdonnee()) ;
	}
	
	public void deplacer(int arg0, int arg1)
	{
		PointPlan[] lPoints = new PointPlan[3];
		
		lPoints[0] = this.p1 ;
		lPoints[1] = this.p2 ;
		lPoints[2] = this.p3 ;
		
		for (int i=0 ; i<lPoints.length; i++) 
		{
			lPoints[i].deplacer(arg0, arg1);
		}
	}

	@Override
	public ArrayList<Segment> dessiner()
	{
		Segment s1 = new Segment(p1, p2);
		Segment s2 = new Segment(p1, p3);
		Segment s3 = new Segment(p2, p3);
		
		ArrayList<Segment> lSeg = new ArrayList<Segment>();
		
		lSeg.add(s1);
		lSeg.add(s2);
		lSeg.add(s3);
		
		return lSeg;
	}

	@Override
	public String typeForme()
	{
		return "T" ;
	}

}
