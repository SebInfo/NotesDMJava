import java.util.ArrayList;
/**
 * Classe qui représente un groupe d'élève donc une classe ou un groupe scolaire
 * @author sebastien
 *
 */

public class Groupe {

	
	private ArrayList<Eleve> eleves;

	public Groupe() {
		this.eleves = new ArrayList<Eleve>();
	}
	
	public void ajouterEleve(Eleve unEleve)
	{
		eleves.add(unEleve);
	}
	
	public int nombreEleve()
	{
		return this.eleves.size();
	}
	
	public boolean eleveExiste(String nom)
	{
		for(int i = 0 ; i < this.nombreEleve(); i++)
		{
			//System.out.println(this.eleves.get(i).getNom());
			if ( this.eleves.get(i).getNom().equals(nom))
			{
			   return true; 
			}
		}
		return false;	
	}
	
	public void listeEleves()
	{
		for (Eleve e : this.eleves)
		{
			System.out.println(e);
		}
	}
	
	public void listeEleves(String nomClasse)
	{
		for (Eleve e : this.eleves)
		{
			if (e.getClasse().equals(nomClasse))
			{
				System.out.println(e);
			}
		}
	}
	
	public float moyenneEleves()
	{
		float totalMoyenne = 0;
		for (Eleve e : this.eleves)
		{
			if (e.getMoyenne()>=0)
			{
				totalMoyenne += e.getMoyenne();
			}
			System.out.println(totalMoyenne);
		}
		//System.out.println(this.nombreEleve());
		return totalMoyenne/this.nombreEleve();
	}

}
