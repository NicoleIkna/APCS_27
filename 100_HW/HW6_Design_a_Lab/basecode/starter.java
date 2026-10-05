/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Lets get started! Round one.");
        System.out.print("Please enter your choice (rock, paper, or scissors): ");
        String UserChoiceOne = sc.nextLine();
        int ComputerchoiceOne = (int)(Math.random() * 3 + 1);
        if(ComputerchoiceOne == 1){
            System.out.println("The computer chose rock.");
        } 
        else if(ComputerchoiceOne == 2){
            System.out.println("The computer chose paper.");
        } 
        else if(ComputerchoiceOne == 3){
            System.out.println("The computer chose scissors.");
        }
        if(UserChoiceOne.equalsIgnoreCase("rock") && ComputerchoiceOne == 1){
            System.out.println("It's a tie!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("rock") && ComputerchoiceOne == 2){
            System.out.println("You lose!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("rock") && ComputerchoiceOne == 3){
            System.out.println("You win!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("paper") && ComputerchoiceOne == 1){
            System.out.println("You win!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("paper") && ComputerchoiceOne == 2){
            System.out.println("It's a tie!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("paper") && ComputerchoiceOne == 3){
            System.out.println("You lose!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("scissors") && ComputerchoiceOne == 1){
            System.out.println("You lose!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("scissors") && ComputerchoiceOne == 2){
            System.out.println("You win!");
        } 
        else if(UserChoiceOne.equalsIgnoreCase("scissors") && ComputerchoiceOne == 3){
            System.out.println("It's a tie!");
        }
        else{
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
        }

        System.out.println(" ");




        System.out.println("Round two.");
        System.out.print("Please enter your choice (rock, paper, or scissors): ");
        String UserChoiceTwo = sc.nextLine();
        int ComputerchoiceTwo = (int)(Math.random() * 3 + 1);
        if(ComputerchoiceTwo == 1){
            System.out.println("The computer chose rock.");
        } 
        else if(ComputerchoiceTwo == 2){
            System.out.println("The computer chose paper.");
        } 
        else if(ComputerchoiceTwo == 3){
            System.out.println("The computer chose scissors.");
        }
        if(UserChoiceTwo.equalsIgnoreCase("rock") && ComputerchoiceTwo == 1){
            System.out.println("It's a tie!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("rock") && ComputerchoiceTwo == 2){
            System.out.println("You lose!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("rock") && ComputerchoiceTwo == 3){
            System.out.println("You win!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("paper") && ComputerchoiceTwo == 1){
            System.out.println("You win!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("paper") && ComputerchoiceTwo == 2){
            System.out.println("It's a tie!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("paper") && ComputerchoiceTwo == 3){
            System.out.println("You lose!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("scissors") && ComputerchoiceTwo == 1){
            System.out.println("You lose!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("scissors") && ComputerchoiceTwo == 2){
            System.out.println("You win!");
        } 
        else if(UserChoiceTwo.equalsIgnoreCase("scissors") && ComputerchoiceTwo == 3){
            System.out.println("It's a tie!");
        }
        else{
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
        }




        System.out.println("Round three.");
        System.out.print("Please enter your choice (rock, paper, or scissors): ");
        String UserChoiceThree = sc.nextLine();
        int ComputerchoiceThree = (int)(Math.random() * 3 + 1);
        if(ComputerchoiceThree == 1){
            System.out.println("The computer chose rock.");
        } 
        else if(ComputerchoiceThree == 2){
            System.out.println("The computer chose paper.");
        } 
        else if(ComputerchoiceThree == 3){
            System.out.println("The computer chose scissors.");
        }
        if(UserChoiceThree.equalsIgnoreCase("rock") && ComputerchoiceThree == 1){
            System.out.println("It's a tie!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("rock") && ComputerchoiceThree == 2){
            System.out.println("You lose!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("rock") && ComputerchoiceThree == 3){
            System.out.println("You win!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("paper") && ComputerchoiceThree == 1){
            System.out.println("You win!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("paper") && ComputerchoiceThree == 2){
            System.out.println("It's a tie!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("paper") && ComputerchoiceThree == 3){
            System.out.println("You lose!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("scissors") && ComputerchoiceThree == 1){
            System.out.println("You lose!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("scissors") && ComputerchoiceThree == 2){
            System.out.println("You win!");
        } 
        else if(UserChoiceThree.equalsIgnoreCase("scissors") && ComputerchoiceThree == 3){
            System.out.println("It's a tie!");
        }
        else{
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
        }

        System.out.println("Thanks for playing!");
     

    }
}
