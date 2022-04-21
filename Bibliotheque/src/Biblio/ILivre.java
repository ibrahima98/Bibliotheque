package Biblio;

public interface ILivre {
	
	void afficherDoc();
    Documents document(int i);

   boolean ajouter(Livre Liv);
    boolean supprimer(Livre Liv);
    
    void afficherAuteur();

}
