package Biblio;


public class LivreImpl implements ILivre {
	
	  public int Capacite;
	    public static int Nb=0;
	    public Livre[] livre;
	    public LivreImpl(int Capacite) {
	        super();
	        livre=new Livre[5];
	        Nb=0;
	    }

	    @Override
		public void afficherDoc() {
			// TODO Auto-generated method stub
			
			  for(Documents L:livre)                                                    
		            System.out.println(L);

		}

		@Override
		public Documents document(int i) {
			// TODO Auto-generated method stub
			
			return (livre[i]) ;
		}

		@Override
		public boolean ajouter(Livre Liv) {
			// TODO Auto-generated method stub
			
			if(Nb<livre.length)
		           this.livre[Nb++]=Liv;
		        return true;
		}

		@Override
		public boolean supprimer(Livre Liv) {
			// TODO Auto-generated method stub
			
			  for(int i=0;i<livre.length;i++){
		            if(livre[i].NumEnreg==(Liv.NumEnreg))
		              
		                    livre[i]=livre[i+1];
		        }
		        Nb--;
		            return true; 
		}

		@Override
		public void afficherAuteur() {
			// TODO Auto-generated method stub
			
			for(int i=0;i<livre.length;i++){
	            if(livre[i] instanceof Livre)
	                System.out.println((Livre) livre[i]) ;
		}

	}

}
