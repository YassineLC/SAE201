package formes;
import java.util.ArrayList;
import ardoise.*;

public class Quadrilatere extends Forme 
{
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private PointPlan p4;
	private PointPlan[] Points;

	public Quadrilatere(String unNom, PointPlan unP1, PointPlan unP3)
	{
		super(unNom);
		this.p1 = unP1;
		this.p2 = new PointPlan(unP3.getAbscisse(), unP1.getOrdonnee());
		this.p3 = unP3;
		this.p4 = new PointPlan(unP1.getAbscisse(), unP3.getOrdonnee());
	}
	@Override
	public void deplacer(int arg0, int arg1) 
	{
		// TODO Auto-generated method stub
		
		this.Points = new PointPlan[4];
		
		this.Points[0] = this.p1 ;
		this.Points[1] = this.p2 ;
		this.Points[2] = this.p3 ;
		this.Points[3] = this.p4 ;
		
		for (int i=0 ; i<this.Points.length; i++) {
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
		
		
		ArrayList<Segment> Seg = new ArrayList<Segment>();
		
		Seg.add(s1);
		Seg.add(s2);
		Seg.add(s3);
		Seg.add(s4);
		
		return Seg;
	}

	@Override
	public String typeForme() 
	{
		return "Q";
	}

}
