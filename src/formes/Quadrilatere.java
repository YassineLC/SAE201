package formes;
import java.util.ArrayList;
import ardoise.*;

public class Quadrilatere extends Forme 
{
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private PointPlan p4;

	public Quadrilatere()
	{
	}
	
	public Quadrilatere(PointPlan unP1, PointPlan unP3) 
	{
		this.p1 = unP1;
		this.p2 = new PointPlan(unP3.getAbscisse(), unP1.getOrdonnee());
		this.p3 = unP3;
		this.p4 = new PointPlan(unP1.getAbscisse(), unP3.getOrdonnee());
	}
	
	public Quadrilatere(String unNom, PointPlan unP1, PointPlan unP3)
	{
		super(unNom);
		this.p1 = unP1;
		this.p2 = new PointPlan(unP3.getAbscisse(), unP1.getOrdonnee());
		this.p3 = unP3;
		this.p4 = new PointPlan(unP1.getAbscisse(), unP3.getOrdonnee());
	}
	
	public Quadrilatere(Quadrilatere q)
	{
		super(q.getNomForme()) ;
		this.p1 = new PointPlan(q.p1.getAbscisse(), q.p1.getOrdonnee()) ;
		this.p2 = new PointPlan(q.p2.getAbscisse(), q.p2.getOrdonnee()) ;
		this.p3 = new PointPlan(q.p3.getAbscisse(), q.p3.getOrdonnee()) ;
		this.p4 = new PointPlan(q.p4.getAbscisse(), q.p4.getOrdonnee()) ;
	}
	
	public void deplacer(int arg0, int arg1) 
	{
		if (arg0 > Ardoise.MAX_X || arg1 > Ardoise.MAX_Y || arg0 < Ardoise.MIN_X || arg1 < Ardoise.MIN_Y) 
		{
			throw new IllegalArgumentException();
		}
		
		PointPlan[] lPoints = new PointPlan[4];
		
		lPoints[0] = p1 ;
		lPoints[1] = p2 ;
		lPoints[2] = p3 ;
		lPoints[3] = p4 ;
		
		for (int i=0 ; i<lPoints.length; i++) 
		{
				lPoints[i].deplacer(arg0, arg1);
		}
	}

	@Override
	public ArrayList<Segment> dessiner() 
	{
		Segment s1 = new Segment(this.p1, this.p2);
		Segment s2 = new Segment(this.p2, this.p3);
		Segment s3 = new Segment(this.p3, this.p4);
		Segment s4 = new Segment(this.p4, this.p1);
		
		
		ArrayList<Segment> Seg = new ArrayList<Segment>();
		
		Seg.add(s1);
		Seg.add(s2);
		Seg.add(s3);
		Seg.add(s4);
		
		return Seg;
	}

	public String typeForme() 
	{
		return "Q";
	}

}
