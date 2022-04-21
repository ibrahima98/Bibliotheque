package Biblio;

public class TestBibliotheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ibibliotheque biblioteque= new BibliothequeImpl(10);
	     Documents document1=new Documents(12,"Base_de_donnee");
	     biblioteque.ajouter(document1);
	     Documents document2=new Documents(1,"JAVA");
	     biblioteque.ajouter(document2);
	     biblioteque.ajouter(new Documents(1,"Oracle"));
	     biblioteque.ajouter(new Documents(2,"BI"));
	     biblioteque.ajouter(new Documents(62,"DevOps"));
	     biblioteque.ajouter(new Documents(22,"SysAdmin"));
	    //affiche tout les documents du bibliotheque
	     biblioteque.afficherDoc();
	     
	      System.out.println("affiche le document qui se trouve dans la 3e position du tableau");
	      System.out.println(biblioteque.document(3));
	      System.out.println("renvois true si le document2 est suprimer ");
	      System.out.println(biblioteque.supprimer(document2));
	      System.out.println("affiche maintenant tout les documents recents");
	      biblioteque.afficherDoc();
	  } 
} 


