package Biblio;

public class Revue extends Documents{
	  private int mois;
	    private int annee;
	 public Revue(int mois, int annee, int NumEnreg, String titre) {
	        super(NumEnreg, titre);
	        this.mois = mois;
	        this.annee = annee;
	    }
	   public String toString() {
	        return super.toString()+"Revue{" + "mois=" + mois + ", annee=" + annee + '}';
	   }   

}
