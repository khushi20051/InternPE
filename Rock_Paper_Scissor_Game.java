package Internship_Project;

import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
	public static void main (String[] args) {
		
		// Get the user input 
		Scanner in = new Scanner (System.in);
		
		//Create score variables
		int wins =0;
		int losses =0;
		
		//Loop through and keep asking the user to enter a move
		while (true) {
			System.out.println("Enter your move. Type in rock, paper,or scissors, If you want to exit the gane, Type in quit.");
			String myMove = in.nextLine();
			
			//Checked if the user entered quit 
			if(myMove.equals("quit")) {
				break;
			}
			
			//Verify that myMove is valid 
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
				System.out.println("Your move is not valid");
			}else {
			
			//Randomly generate the opponents move 
			int rand =(int)(Math.random() *3);
			String opponentMove = "";
			if (rand ==0) {
				opponentMove = "rock";
			} else if (rand ==1) {
				opponentMove= "paper";
			}else {
				opponentMove = "scissors";
			}
			System.out.println("Opponent move: "+opponentMove);
			
			//Calculate if the user won , lost , or tied
			if (myMove.equals(opponentMove)) {
				System.out.println("You tied!");
			} else if ((myMove.equals("rock") && opponentMove.equals("scissors"))|| (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
				System.out.println("You won!");
				wins++;
			} else {
				System.out.println("You lost!");
				losses++;
			}
		 }
			//Print wins and losses
			System.out.println("You have won" +wins+ "games!");	 
			System.out.println("You have lost" +losses+ "games!");	
		}
		//Check to see if the user has won more games than the user lost, or lost more game than the user won, or if they were equals
		if(wins > losses) {
			System.out.println("You won more games than you lost! :)");
		} else if (wins < losses) {
			System.out.println("You lost more games than you won! :(");
		} else {
			System.out.println("You won and lost an equal number for games! :|");
		}
		System.out.println("Thanks for playing! :)");
   }
}