package Biblio;


public class Livrotheque {
	
	  public int Capacite;
	    public static int Nb=0;
	    public Livre[] livre;
	    public Livrotheque(int Capacite) {
	        this.Capacite = Capacite;
	        livre=new Livre[5];
	        Bibliotheque.Nb=0;
	    }
}
