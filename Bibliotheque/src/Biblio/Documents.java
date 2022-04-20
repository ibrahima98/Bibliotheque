package Biblio;

public class Documents {
	 protected int NumEnreg;
     protected String titre;
    public Documents(int NumEnreg, String titre) {
        this.NumEnreg = NumEnreg;
        this.titre = titre;
    }
    public String toString() {
        return "Document{" + "NumEnreg=" + NumEnreg + ", titre=" + titre + '}';
    }

}
