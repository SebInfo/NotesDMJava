import java.util.ArrayList;

/**
 * Classe qui représente un élève ou un étudiant 
 * 
 * @author Sébastien Inion
 *
 */
public class Eleve {
	
	private String nom;
	private String prenom;
	private String classe;
	private ArrayList<Double> notes;// Pour stocker les notes

	
	/**
	 * Constructeur de la classe
	 * 
	 * @param nom : nom de l'étudiant
	 * @param prenom : prénom de l'étudiant
	 * @param classe : sa classe
	 */
	public Eleve(String prenom, String nom, String classe) {
		this.notes = new ArrayList<Double>();
		setNom(nom);
		setPrenom(prenom);
		setClasse(classe);
	}

	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", classe=" + classe + "]";
	}

	/**
	 * Getter sur le nom de l'élève
	 * @return retourne le nom de l'étudiant
	*/
	
	public String getNom() {
		return this.nom;
	}

	/**
	 * Getter sur le nombre de note d'un étudiant
	 * @return retourne le nombre de note de l'élève
	 */
	public int getNbrNotes() {
		return this.notes.size();
	}
	
	/**
	 * Setter sur le nom de l'élève
	 * Cette méthode met en majuscule le premier caractère et en minuscule le reste.
	 * @param nom de type chaine de caractères
	 */
	public void setNom(String nom) {
		this.nom = (nom.substring(0, 1).toUpperCase()+nom.substring(1).toLowerCase());
	}

	/**
	 * @return Retourner le prénom de l'élève
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param Setter pour le prénom avec la première lettre en majusculte
	 */
	public void setPrenom(String prenom) {
		this.prenom = (prenom.substring(0, 1).toUpperCase()+prenom.substring(1).toLowerCase());
	}

	/**
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}

	/**
	 * Permet de retourner les notes d'un élève 
	 * Cela ..
	 * @return de type String
	 */
	public String getNotes() {
		String chaine="" ;
		String notesch = "";
		for (int i=0; i<this.notes.size(); i++)
		{
			notesch += System.getProperty("line.separator") + this.notes.get(i) ;
		}
		chaine = this.getNom()+" "+this.getPrenom()+" "+this.getClasse()+ notesch;
		return chaine;
	}
	
	/**
	 * 
	 * @return nombre de note au dessus de la moyenne de l'élève
	 */
	public int nbrAuDessusMoyenne()
	{
		int noteBonne = 0;
		
		for (int i=0; i<this.notes.size(); i++)
		{
			if (this.notes.get(i)>this.getMoyenne())
				noteBonne++;
		}
		
		return noteBonne;
	}
	
	public Double getMoyenne() {
		double total=0;
		for (int i=0; i<this.getNbrNotes(); i++)
		{
			total += this.notes.get(i) ;
		}
		return total/this.getNbrNotes();
	}

	/**
	 * @param notes the notes to set
	 */
	public boolean ajouterNote(Double note) {
		if ( note >= 0 && note <= 20)
		{
			this.notes.add(note);
			return true;
		}
		else
		{
			return false;
		}
	}
}










