package RPS;

import java.util.Random;
import java.util.Scanner;



public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
       
        
        
        		String[] computerOptions = {".", "o", "x"};
        		
        		
        		

                
                
        System.out.println("Hej. vill du spela mot Datorn eller en v�n?");
        
        
        
        	System.out.println("V�lj Dator[D] - V�n[V] - Avsluta[Q]");
        	String playerPick = sc.nextLine();
        if (playerPick.equals("D"+"d")|| playerPick.equals("V"+"v")|| playerPick.equals("Q"+"q")) {
        	 System.out.println("Du valde: ");
        	 
        } else if (playerPick.equals("D") || playerPick.equals("d")) {
        	System.out.println("Du spelar mot datorn");
        	System.out.println("V�lj Sten[.] - P�se[o] - Sax[x] Eller tryck p� Q f�r att avsluta spelet");
        	
            
        	
        	String personPlay;             // User's play 
    		String computerPlay = "";      // Computer's play 
    		int computerInt;               // Randomly generated number used to determine computer's play
    		

    		Scanner scan = new Scanner(System.in);
    		Random generator = new Random();

    		

    		System.out.println();

    		// Generate computer's play (0,1,2)
    		computerInt = generator.nextInt(3) + 1;

    		// Translate computer's randomly generated play 

    		if (computerInt == 1)
    			computerPlay = ".";
    		else if (computerInt == 2)
    			computerPlay = "o";
    		else if (computerInt == 3)
    			computerPlay = "x";
    		
    		// Get player's play from input-- this is stored as a string
    		System.out.println("G�r ditt drag: ");
    		personPlay = scan.next();

    		// Make player's play uppercase for ease of comparison
    		personPlay = personPlay.toUpperCase();

    		// Print computer's play
    		System.out.println("Datorns drag: " + computerPlay);
    		
    		// See who won.
    		
    		if (personPlay.equals(computerPlay)) {
    			   System.out.println("Lika!");
    			}else if (personPlay.equals(".")) {
    			   if (computerPlay.equals("x")) 
    			      System.out.println("Sten krossar sax. Du vann!!");
    			   else if (computerPlay.equals("o")) 
    			        System.out.println("P�se sl�r sten. Du f�rlorar!!");
    			}else if (personPlay.equals("o")) {
    			   if (computerPlay.equals("x")) 
    			       System.out.println("Sax sl�r P�se. Du f�rlorar!!"); 
    			   else if (computerPlay.equals(".")) 
    			        System.out.println("P�se sl�r Sten. Du vann!!");
    			} else if (personPlay.equals("x")) {
    			     if (computerPlay.equals("o")) 
    			         System.out.println("Sax sl�r p�se. Du vann!!"); 
    			     else if (computerPlay.equals(".")) 
    			        System.out.println("Sten sl�r Sax. Du f�rlorar!!");
    			}else System.out.println("Invalid user input.");
    		
    		scan.close();
        	
        	
        	 
        	 
        } else if (playerPick.equals("Q") || playerPick.equals("q")) {
            System.out.println("Du har valt att avsluta spelet");
           
        } else if (playerPick.equals("V") || playerPick.equals("v")) {
            System.out.println("Du har valt att spela mot en v�n");
        
          
            String Player1Play;             // player1's play 
    		String Player2Play = "";      // Player2�s  play 
    	
    		

    		Scanner scan = new Scanner(System.in);
    		
    		System.out.println
    		("V�lj Sten[.] - P�se[o] - Sax[x] ");

    		System.out.println();

    		
    		// Get player's play from input-- this is stored as a string
    		System.out.println(" Spelare 1. G�r ditt drag: ");
    		Player1Play = scan.next();

    		// Make player's play uppercase for ease of comparison
    		Player1Play = Player1Play.toUpperCase();

    		// Print Player2�s play
    		//System.out.println("Computer play is: " + Player2Play);
    		System.out.println(" Spelare 2. G�r ditt drag: ");
    		Player2Play = scan.next();
    		// See who won.
    		
    		if (Player1Play.equals(Player2Play)) {
    			   System.out.println("Lika!");
    			}else if (Player1Play.equals(".")) {
    			   if (Player2Play.equals("x")) 
    			      System.out.println("Sten krossar sax. Du vann!!");
    			   else if (Player2Play.equals("o")) 
    			        System.out.println("P�se sl�r Sten. Du f�rlorar!!");
    			}else if (Player1Play.equals("o")) {
    			   if (Player2Play.equals("x")) 
    			       System.out.println("Sax sl�r P�se. Du f�rlorar!!"); 
    			   else if (Player2Play.equals(".")) 
    			        System.out.println("P�se sl�r Sten. Du vann!!");
    			} else if (Player1Play.equals("x")) {
    			     if (Player2Play.equals("o")) 
    			         System.out.println("Sax sl�r P�se. Du vann!!"); 
    			     else if (Player2Play.equals(".")) 
    			        System.out.println("Sten sl�r Sax. Du f�rlorar!!");
    			}else System.out.println("Invalid user input.");
    		
    		scan.close();
            
            {
            
  
                
                }
                
            }

        }}
