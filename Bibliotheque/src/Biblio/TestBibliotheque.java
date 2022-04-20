package Biblio;

public class TestBibliotheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Bibliotheque bib=new Bibliotheque(10);
		     Documents d1=new Documents(12,"Base_de_donnee");
		     bib.ajouter(d1);
		     Documents d2=new Documents(1,"JAVA");
		     bib.ajouter(d2);
		      bib.ajouter(new Documents(1,"MATHS"));
		      bib.ajouter(new Documents(2,"FRANCAIS"));
		      bib.ajouter(new Documents(62,"ENGLISH"));
		      bib.ajouter(new Documents(22,"ARABE"));
		      bib.afficherDoc();
		      System.out.println("hf");
		      System.out.println(bib.document(2));
		      System.out.println(bib.supprimer(d2));
		      System.out.println();
		      bib.afficherDoc();
		  }  
	}


