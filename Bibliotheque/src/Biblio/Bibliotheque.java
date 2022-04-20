package Biblio;


public class Bibliotheque {
	    public int Capacité;
	    public static int Nb=0;
	    public Documents[] doc;
	    public Bibliotheque(int Capacité) {
	        this.Capacité = Capacité;
	        doc=new Documents[5];
	        Nb=0;
	    }
	    public void afficherDoc(){
	        for(Documents D:doc)                                                    
	            System.out.println(D);
	    }
	    public Documents document(int i){
	        return (doc[i]) ;
	    }

	    public boolean ajouter(Documents Doc){
	        if(Nb<doc.length)
	           this.doc[Nb++]=Doc;
	        return true;
	    }
	    public boolean supprimer(Documents Doc){
	        for(int i=0;i<doc.length;i++){
	            if(doc[i].NumEnreg==(Doc.NumEnreg))
	              
	                    doc[i]=doc[i+1];
	        }
	        Nb--;
	            return true;     }
	    public void afficherAuteur(){
	        for(int i=0;i<doc.length;i++){
	            if(doc[i] instanceof Livre)
	                System.out.println((Livre) doc[i]) ;
	    }
	    }
	

}
