/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
  
    public static String getObject(){
        int computerChoice = (int) (Math.random()*3);
        if(computerChoice==0){
            return "Rock";
        }
        else if(computerChoice==1){
            return "Paper";
        }
        else{
            return "Scissors";
        }
    }


    public static int compare2(String choice, String computer){
        if(choice.equalsIgnoreCase(computer)){
            return 0;
        }
        else if((choice.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("scissors")) ||
            (choice.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock")) ||
            (choice.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper"))){
                return 1;
        }
        else{
            return 2;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play the computer? (yes/no/done)");
        String answer = sc.nextLine();

        while(!answer.equalsIgnoreCase("done")){
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("------------------------------");
            System.out.println("Please enter rock/paper/scissors:");
            
            String choice = sc.nextLine();
            
            while(!choice.equalsIgnoreCase("rock") && !choice.equalsIgnoreCase("paper") && !choice.equalsIgnoreCase("scissors")){
                System.out.println("Invalid. Please try again.");
                choice = sc.nextLine();
            }

            String computer = getObject();
            int winner = compare2(choice, computer);

            if(winner == 0){
                System.out.println("Its a tie!");
            }
            else if(winner == 1){
                System.out.println("You won! :)");
            }
            else{
                System.out.println("You lost! lol");
            }
           
        }
        
        else if(answer.equalsIgnoreCase("no")){
            System.out.println("------------------------------");
            System.out.println("How many times would you like the computer to play itself?");
            int games = sc.nextInt();
            sc.nextLine();
            int count = 0;
            int player1Wins = 0;
            int player2Wins = 0;
            int ties = 0;

            while(count<games){
                String player1 = getObject();
                String player2 = getObject();
                int winner = compare2(player1, player2);

                if(winner == 0){
                    ties++;
                }
                else if(winner == 1){
                    player1Wins++;                    
                }
                else{
                    player2Wins++;
                }
                
                count++;
            }

            System.out.println("Player 1 Wins: " + player1Wins);
            System.out.println("Player 2 Wins: " + player2Wins);
            System.out.println("Ties: " + ties);

        }
      
        else{
            System.out.println("------------------------------");
            System.out.println("You typed an invalid input!");
        }

        System.out.println(" ");
        System.out.println("------------------------------------------------------");
        System.out.println("Would you like to play the computer (yes/no/done): ");
        answer = sc.nextLine();

        }
       
   
   System.out.println("-------------------------------");
   System.out.println("Thanks for playing!");

    }
}
