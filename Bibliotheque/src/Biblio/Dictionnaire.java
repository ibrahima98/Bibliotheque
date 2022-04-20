package Biblio;


public class Dictionnaire extends Documents{
	 private String Langue;
	    public Dictionnaire(String Langue, int NumEnreg, String titre) {
	        super(NumEnreg, titre);
	        this.Langue = Langue;
	    }
	   public String getLangue() {
	        return Langue;
	    }
	    public void setLangue(String Langue) {
	        this.Langue = Langue;
	    }
	    public String toString() {
	        return super.toString()+"Dictionnaire{" + "Langue=" + Langue + '}';
	    }   
}
