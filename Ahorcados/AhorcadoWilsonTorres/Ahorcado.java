
import java.io.*;
import java.util.*;

public class Ahorcado {
	
public static void jugador (int longitudPalabra, int [] posicion, char letra, char [] jugador){
	int i = 0;
	while (i < longitudPalabra){
		if(posicion[i] == 1){
			jugador[i] = letra;
		}
		i++;
	}	
	
}

public static void imprimirPalabra(int longitudPalabra, int cuenta, char[]jugador){
	int j=0;
	while (j < longitudPalabra){
		System.out.print(jugador[j] + " ");
		j++;
	}		

	if(cuenta == 1){
		System.out.println("     q" );
		}
	if(cuenta == 2){
		System.out.println("     q(" );
		}
	if(cuenta == 3){
		System.out.println("     q(X" );
		}
	if(cuenta == 4){
		System.out.println("     q(X_" );
		}
	if(cuenta == 5){
		System.out.println("     q(X_X" );
		}
	if(cuenta == 6){
		System.out.println("     q(X_X)" );
		}
	if(cuenta == 7){
		System.out.println("     q(X_X)p" );
		}

}

public static void arregloNulo(int[]arreglo, int tamaño){
	int i = 0;
	while(i<tamaño){
		arreglo[i] = 0;
		i++;
	}
}
	
public static int verificaVictoria(int longitudPalabra, char [] juego){
	int j=0;
	int	gameOver = 0;
	int cuenta=0;
	while (j < longitudPalabra){
		if(juego[j] != '_'){
		cuenta++;		
		}
		j++;
	}
	
	if(cuenta<longitudPalabra){
		gameOver=0;
		}
	else{
		gameOver=1;
	}
	
	return gameOver;
}

public static void main (String[] args) throws java.io.IOException
	    {
		 	String palabra;
	        String s1;
	        String s2;
	        String [] arregloPalabras = new String [100];
	        int [] posicion;
	        int cuenta=0;
	        
	        // Cargamos el buffer con el contenido del archivo
	        BufferedReader br = new BufferedReader (new FileReader ("Palabras.txt"));
	        // Leemos la primera linea
	        s1 = br.readLine();
	        br.close();
	        int numTokens = 0;
	        StringTokenizer st = new StringTokenizer (s1);
	        // bucle por todas las palabras
	        while (st.hasMoreTokens())
	        {	        	
	            s2 = st.nextToken();
	            arregloPalabras[numTokens] = s2;
	            numTokens++;	                        
	        }
	       	        
	        int posicionAleatoria = (int) (Math.random()*(numTokens));
	        palabra = arregloPalabras[posicionAleatoria];
	        int longitudPalabra = palabra.length();
	        int i = 0;
	        char [] jugador = new char [longitudPalabra+1];
	        posicion = new int [longitudPalabra];
	        //System.out.println("la palabra es " +palabra);
	    	while (i < longitudPalabra){
	        	jugador [i] = '_';
	        	i++;
	        }     
	    	while (i < longitudPalabra){
	        	posicion [i] = 0;
	        	i++;
	        }     
	    		    	
	    	Scanner entrada = new Scanner(System.in);
	    	System.out.println("=========BIENVENIDO A AHORCADO========\n\n ");
        	System.out.print("Digite cualquier letra para continuar: ");
	    	String lecturaTeclado = entrada.next() ;
	    	System.out.print("\n");
	    	imprimirPalabra(longitudPalabra, cuenta, jugador);
	        int gameOver = 0;	        
	       while(gameOver == 0){	
	        	int j = 0;	        	
	        	System.out.print("Digite la letra que desee: ");
	        	lecturaTeclado = entrada.next();   	
	        	System.out.print("\n");
	        	char letraTeclado = lecturaTeclado.charAt(0);
	        	int error = 1;	    
	        	arregloNulo(posicion,longitudPalabra);
	        	while (j < longitudPalabra){
	        		
	        		char letra = palabra.charAt(j);	        		
	        		if(letra == letraTeclado){
	        			posicion [j] = 1;
	        			error=0;
	        		}	        		
	        	j++;
	        	}
	        	if (error == 0){
	        		jugador(longitudPalabra, posicion, letraTeclado, jugador);
	        		gameOver= verificaVictoria(longitudPalabra, jugador);
	        	}
	        		else if (cuenta < 6){
	        			cuenta++;	   
	        			gameOver= verificaVictoria(longitudPalabra, jugador);
	        		}
	        		else{
	        			cuenta++;
	        			imprimirPalabra(longitudPalabra,cuenta, jugador);       		
		        		gameOver = 1;
	        		} 
	        	imprimirPalabra(longitudPalabra,cuenta, jugador);
	        	
	        } 
	       
	       if (cuenta < 6){
	    	  System.out.println("\n=====GAME OVER=====");
	    	  System.out.println(" :D :D :D :D :D :D ");	    	  
	       }
	       else {
	    	   System.out.println("\n=====GAME OVER=====");
	    	   System.out.println("      q(X_X)p");
	       }   
	       
	    }
}	
