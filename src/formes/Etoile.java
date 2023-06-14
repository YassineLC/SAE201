package formes;

import java.util.ArrayList;
import ardoise.*;

public class Etoile extends Forme 
{
	
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private PointPlan p4;
	private Chapeau c1;
	private Chapeau c2;
	private Chapeau c3;
	private Chapeau c4;
	
	
	public Etoile()
	{
	}

	public Etoile(String unNom, PointPlan unP1, PointPlan unP2, PointPlan unP3, PointPlan unP4)
	{
		super(unNom);
		
		this.p1 = unP1;
		PointPlan pc1_2 = new PointPlan(this.p1.getAbscisse()-3, this.p1.getOrdonnee()+7);
		PointPlan pc1_3 = new PointPlan(this.p1.getAbscisse()+4, pc1_2.getOrdonnee());
		this.c1 = new Chapeau(pc1_2, this.p1, pc1_3);
		
		this.p2 = unP2;
		PointPlan pc2_2 = new PointPlan(this.p2.getAbscisse()-7, this.p2.getOrdonnee()-5);
		PointPlan pc2_3 = new PointPlan(pc2_2.getAbscisse(), this.p2.getOrdonnee()+3);
		this.c2 = new Chapeau(pc2_2, this.p2, pc2_3);
		
		this.p3 = unP3;
		PointPlan pc3_2 = new PointPlan(this.p3.getAbscisse()+3, this.p3.getOrdonnee()-6);
		PointPlan pc3_3 = new PointPlan(this.p3.getAbscisse()-4, pc3_2.getOrdonnee());
		this.c3 = new Chapeau(pc3_2, this.p3, pc3_3);
		
		this.p4 = unP4;
		PointPlan pc4_2 = new PointPlan(this.p4.getAbscisse()+6, this.p4.getOrdonnee()+3);
		PointPlan pc4_3 = new PointPlan(pc4_2.getAbscisse(), this.p4.getOrdonnee()-5);
		this.c4 = new Chapeau(pc4_2, this.p4, pc4_3);
	}
	
	public Etoile(PointPlan unP1, PointPlan unP2, PointPlan unP3, PointPlan unP4)
	{
		this.p1 = unP1;
		PointPlan pc1_2 = new PointPlan(this.p1.getAbscisse()-3, this.p1.getOrdonnee()+7);
		PointPlan pc1_3 = new PointPlan(this.p1.getAbscisse()+4, pc1_2.getOrdonnee());
		this.c1 = new Chapeau(pc1_2, this.p1, pc1_3);
		
		this.p2 = unP2;
		PointPlan pc2_2 = new PointPlan(this.p2.getAbscisse()-7, this.p2.getOrdonnee()-5);
		PointPlan pc2_3 = new PointPlan(pc2_2.getAbscisse(), this.p2.getOrdonnee()+3);
		this.c2 = new Chapeau(pc2_2, this.p2, pc2_3);
		
		this.p3 = unP3;
		PointPlan pc3_2 = new PointPlan(this.p3.getAbscisse()+3, this.p3.getOrdonnee()-6);
		PointPlan pc3_3 = new PointPlan(this.p3.getAbscisse()-4, pc3_2.getOrdonnee());
		this.c3 = new Chapeau(pc3_2, this.p3, pc3_3);
		
		this.p4 = unP4;
		PointPlan pc4_2 = new PointPlan(this.p4.getAbscisse()+6, this.p4.getOrdonnee()+3);
		PointPlan pc4_3 = new PointPlan(pc4_2.getAbscisse(), this.p4.getOrdonnee()-5);
		this.c4 = new Chapeau(pc4_2, this.p4, pc4_3);
	}
	
	public Etoile(Etoile e)
	{
		super(e.getNomForme());
		this.c1 = new Chapeau(e.c1);
		this.c2 = new Chapeau(e.c2);
		this.c3 = new Chapeau(e.c3);
		this.c4 = new Chapeau(e.c4);
	}
	
	
	public void deplacer(int arg0, int arg1) 
	{
		if (arg0 > Ardoise.MAX_X || arg1 > Ardoise.MAX_Y || arg0 < Ardoise.MIN_X || arg1 < Ardoise.MIN_Y) 
		{
			throw new IllegalArgumentException();
		}
		
		this.c1.deplacer(arg0, arg1);
		this.c2.deplacer(arg0, arg1);
		this.c3.deplacer(arg0, arg1);
		this.c4.deplacer(arg0, arg1);
	}

	public ArrayList<Segment> dessiner() 
	{
		ArrayList<Segment> Seg = new ArrayList<Segment>();
		Chapeau[] lChap = new Chapeau[4];
		
		lChap[0] = this.c1;
		lChap[1] = this.c2;
		lChap[2] = this.c3;
		lChap[3] = this.c4;
		
		for(int i=0; i<lChap.length; i++) {
			for(int j=0; j<lChap[i].dessiner().size(); j++) 
			{
				Seg.add(lChap[i].dessiner().get(j));
			}
		}
		return Seg;
	}

	public String typeForme() 
	{
		return "GF";
	}

}
