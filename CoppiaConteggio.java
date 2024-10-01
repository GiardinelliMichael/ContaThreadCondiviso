package condiviso;

public class CoppiaConteggio {
	
	private int contatore = 1; // contatore condiviso all'interno della coppia
    
	private final int max;

    public CoppiaConteggio(int max) {
     
    	this.max = max;
   
    }

   
    public synchronized int Contatore() {
     
    	if (contatore > max) {
    
        	return -1; 
       
    	}
       
    	return contatore++;
    
    }
    
}
