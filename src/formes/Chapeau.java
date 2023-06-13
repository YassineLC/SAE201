package formes;

import java.util.ArrayList;
import ardoise.*;

public class Chapeau extends Forme 
{
	private PointPlan p1 ;
	private PointPlan p2 ;
	private PointPlan p3 ;
	
	
	public Chapeau()
	{
	}
	
	public Chapeau(PointPlan unP1, PointPlan unP2, PointPlan unP3) 
	{
		this.p1 = unP1 ;
		this.p2 = unP2 ;
		this.p3 = unP3 ;
	}
	
	public Chapeau(String unNom, PointPlan unP1, PointPlan unP2, PointPlan unP3) 
	{
		super(unNom);
		this.p1 = unP1 ;
		this.p2 = unP2 ;
		this.p3 = unP3 ;
	}
	
	public Chapeau(Chapeau c)
	{
		super(c.getNomForme()) ;
		this.p1 = new PointPlan(c.p1.getAbscisse(), c.p1.getOrdonnee()) ;
		this.p2 = new PointPlan(c.p2.getAbscisse(), c.p2.getOrdonnee()) ;
		this.p3 = new PointPlan(c.p3.getAbscisse(), c.p3.getOrdonnee()) ;
	}
	

	public void deplacer(int arg0, int arg1) throws IllegalArgumentException
	{
		if (arg0 > Ardoise.MAX_X || arg1 > Ardoise.MAX_Y || arg0 < Ardoise.MIN_X || arg1 < Ardoise.MIN_Y) 
		{
			throw new IllegalArgumentException("Les arguments doivent être compris entre 0 et 200.");
		}
		
		PointPlan[] lPoints = new PointPlan[3];
		
		lPoints[0] = this.p1 ;
		lPoints[1] = this.p2 ;
		lPoints[2] = this.p3 ;
		
		for (int i=0 ; i<lPoints.length; i++) 
		{
			try 
			{
				lPoints[i].deplacer(arg0, arg1);
			} 
			catch (IllegalArgumentException e) 
			{
				System.out.println("Le point " + i + " n'a pas pu être déplacé.");
			}
		}
	}

	@Override
	public ArrayList<Segment> dessiner() throws IllegalArgumentException
	{
		Segment s1 = new Segment(p1, p2);
		Segment s2 = new Segment(p2, p3);
		
		ArrayList<Segment> lSeg = new ArrayList<Segment>() ;
		
		lSeg.add(s1);
		lSeg.add(s2);
		
		return lSeg;
	}

	@Override
	public String typeForme() 
	{
		return "C";
	}

}