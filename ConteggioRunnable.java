package condiviso;

class ConteggioRunnable implements Runnable {
    private CoppiaConteggio coppia;

    public ConteggioRunnable(CoppiaConteggio coppia) {
        this.coppia = coppia;
    }

    public void run() {
      
    	while (true) {
            
    		// Otteniamo il prossimo numero da contare dalla coppia
           
    		int numero = CoppiaConteggio.Contatore();
                 
            if (numero == -1) {
               
            	break; // Se il numero è -1, significa che abbiamo superato N
            
            }

            // Stampa il numero corrente
            
            System.out.println(Thread.currentThread().getName() + " conta: " + numero);
            
            
        }
    }
}