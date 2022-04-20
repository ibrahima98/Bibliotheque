package Biblio;

public class Livre extends Documents{
	 protected String Auteur;
	   protected int NbrPages;
	    public String getAuteur() {
	        return Auteur;
	    }
	    public void setAuteur(String Auteur) {
	        this.Auteur = Auteur;
	    }
	    public int getNbrPages() {
	        return NbrPages;
	    }
	    public void setNbrPages(int NbrPages) {
	        this.NbrPages = NbrPages;
	    }

	    public Livre(int Num,String T,String Auteur, int NbrPages) {
	        super(Num,T);
	        this.Auteur = Auteur;
	        this.NbrPages = NbrPages;
	    }
	    public String toString() {
	        return super.toString()+"Livre{" + "Auteur=" + Auteur + ", NbrPages=" + NbrPages + '}';
	    }   

}
