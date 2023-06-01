package formes;

import java.util.ArrayList;
import ardoise.*;

public class Maison extends Forme
{
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private PointPlan p4;
	private PointPlan p5;
	private PointPlan p6;
	private PointPlan p7;
	private PointPlan p8;
	private PointPlan p9; 
	private PointPlan p10; 
	private PointPlan p11; 
	private PointPlan[] Points;
	
	public Maison(String unNom, PointPlan unP1, PointPlan unP3, PointPlan unP5, PointPlan unP7, PointPlan unP9, PointPlan unP10, PointPlan unP11)
	{
		super(unNom);
		this.p1 = unP1;
		this.p2 = new PointPlan(unP3.getAbscisse(), unP1.getOrdonnee());
		this.p3 = unP3;
		this.p4 = new PointPlan(unP1.getAbscisse(), unP3.getOrdonnee());
		this.p5 = unP5;
		this.p6 = new PointPlan(unP7.getAbscisse(), unP5.getOrdonnee());
		this.p7 = unP7;
		this.p8 = new PointPlan(unP9.getAbscisse(), unP7.getOrdonnee());
		this.p9 = unP9;
		this.p10 = unP10;
		this.p11 = unP11;
	}
	
	@Override
	public void deplacer(int arg0, int arg1) 
	{
		// TODO Auto-generated method stub
		this.Points = new PointPlan[11];
		
		this.Points[0] = this.p1;
		this.Points[1] = this.p2;
		this.Points[2] = this.p3;
		this.Points[3] = this.p4;
		this.Points[4] = this.p5;
		this.Points[5] = this.p6;
		this.Points[6] = this.p7;
		this.Points[7] = this.p8;
		this.Points[8] = this.p9;
		this.Points[9] = this.p10;
		this.Points[10] = this.p11;
		
		for (int i=0 ; i<this.Points.length; i++) 
		{
			this.Points[i].setAbscisse(this.Points[i].getAbscisse() + arg0);
			this.Points[i].setOrdonnee(this.Points[i].getOrdonnee() + arg1);
		}
	}

	@Override
	public ArrayList<Segment> dessiner() 
	{
		// TODO Auto-generated method stub
		Segment s1 = new Segment(this.p1, this.p2);
		Segment s2 = new Segment(this.p2, this.p3);
		Segment s3 = new Segment(this.p3, this.p4);
		Segment s4 = new Segment(this.p4, this.p1);
		Segment s5 = new Segment(this.p5, this.p6);
		Segment s6 = new Segment(this.p6, this.p7);
		Segment s7 = new Segment(this.p7, this.p8);
		Segment s8 = new Segment(this.p8, this.p6);
		Segment s9 = new Segment(this.p9, this.p10);
		Segment s10 = new Segment(this.p10, this.p11);
		
		
		ArrayList<Segment> Seg = new ArrayList<Segment>();
		
		Seg.add(s1);
		Seg.add(s2);
		Seg.add(s3);
		Seg.add(s4);
		Seg.add(s5);
		Seg.add(s6);
		Seg.add(s7);
		Seg.add(s8);
		Seg.add(s9);
		Seg.add(s10);
		
		return Seg;
	}

	@Override
	public String typeForme() 
	{
		// TODO Auto-generated method stub
		return "GF";
	}
	
}