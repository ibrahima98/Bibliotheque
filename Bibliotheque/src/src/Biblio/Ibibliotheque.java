package Biblio;

public interface Ibibliotheque {
	
	   void afficherDoc();
	   Documents document(int i);
	   boolean ajouter(Documents Doc);
	   boolean supprimer(Documents Doc);
	   void afficherAuteur();
}
