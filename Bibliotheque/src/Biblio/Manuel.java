package Biblio;

public class Manuel extends Livre{
	 private String neveau;
	 public String getNeveau() {
	        return neveau;
	    }
	  public void setNeveau(String neveau) {
	        this.neveau = neveau;
	    }
	  public String toString() {
	        return super.toString()+"Manuel{" + "neveau=" + neveau + '}';
	    }
	    public Manuel(String neveau, int Num, String T, String Auteur, int NbrPages) {
	        super(Num, T, Auteur, NbrPages);
	        this.neveau = neveau;
	    }

}
