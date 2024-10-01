package condiviso;

import java.util.Scanner;

public static void main(String[] args) {
       
	   Scanner scanner = new Scanner(System.in);
        
       System.out.print("Inserisci il numero di thread (Il numero di thread deve essere pari per creare coppie!): ");
       
       while(T % 2 != 0) {
       
    	   int T = scanner.nextInt();
       
       }
       
       System.out.print("Inserisci il valore massimo da contare (N): ");
       
       int N = scanner.nextInt();

       scanner.close();
        
       int numCoppie = T / 2;
        
        for (int i = 0; i < numCoppie; i++) {
           
        	CoppiaConteggio coppia = new CoppiaConteggio(N); 
            
            new Thread(new ConteggioRunnable(coppia), "Thread " + (i * 2 + 1)).start();
            
            new Thread(new ConteggioRunnable(coppia), "Thread " + (i * 2 + 2)).start();
        }
    }