package Biblio;

public class BibliothequeImpl extends Bibliotheque implements Ibibliotheque {
	
	  public int Capacite;
	    public static int Nb=0;
	    public Documents[] doc;
	    public BibliothequeImpl(int Capacite) {
	        super(Capacite);
	        doc=new Documents[5];
	        Nb=0;
	    }

	@Override
	public void afficherDoc() {
		// TODO Auto-generated method stub
		
		  for(Documents D:doc)                                                    
	            System.out.println(D);

	}

	@Override
	public Documents document(int i) {
		// TODO Auto-generated method stub
		
		return (doc[i]) ;
	}

	@Override
	public boolean ajouter(Documents Doc) {
		// TODO Auto-generated method stub
		
		if(Nb<doc.length)
	           this.doc[Nb++]=Doc;
	        return true;
	}

	@Override
	public boolean supprimer(Documents Doc) {
		// TODO Auto-generated method stub
		
		  for(int i=0;i<doc.length;i++){
	            if(doc[i].NumEnreg==(Doc.NumEnreg))
	              
	                    doc[i]=doc[i+1];
	        }
	        Nb--;
	            return true; 
	}

	@Override
	public void afficherAuteur() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<doc.length;i++){
            if(doc[i] instanceof Livre)
                System.out.println((Livre) doc[i]) ;
	}

}
	}
