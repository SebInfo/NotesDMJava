
public class TestEleves {
	
	/**
	 * Classe de test pour les classes Groupe et Eleve
	 * @param args
	 */

	public static void main(String[] args) {
		Eleve e1 = new Eleve("SOPHIE", "PAMIER", "5ème C");
		e1.ajouterNote(8.);
		System.out.println(e1.getPrenom());
		System.out.println("Test---"+e1.getMoyenne());
		e1.ajouterNote(21.0);
		e1.ajouterNote(8.0);
		e1.ajouterNote(11.0);
		e1.ajouterNote(15.0);
		System.out.println("Nbr de notes au dessus de la moyenne "+e1.nbrAuDessusMoyenne());
		Eleve e2 = new Eleve("Bob", "NotDead", "5ème C");
		e2.ajouterNote(18.0);
		e2.ajouterNote(18.0);
		e2.ajouterNote(18.0);
		Eleve e3 = new Eleve("Dupont", "Eric", "6ème A");
		e3.ajouterNote(13.0);
		//System.out.println(e.getNotes());
		//System.out.println(e.getMoyenne());
		//System.out.println(e.nbrAuDessusMoyenne());
		
		Groupe classeA = new Groupe();
		classeA.ajouterEleve(e1);
		classeA.ajouterEleve(e2);
		classeA.ajouterEleve(e3);
		//System.out.println(classeA.nombreEleve());
		if (classeA.eleveExiste("Pamier"))
		{
			System.out.println("Oui sophie est présente");
		}
		else
		{
			System.out.println("Non sophie n'est pas une élève");
		}
		classeA.listeEleves();
		//System.out.println(classeA.moyenneEleves());
		System.out.println(e1.getNotes());
	}

}
