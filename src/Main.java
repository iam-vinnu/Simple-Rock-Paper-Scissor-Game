import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true){
            Scanner input = new Scanner(System.in);
            String [] availChoose ={"rock","paper","scissor"};
            String computerChoose = availChoose[new Random().nextInt(availChoose.length)];

            System.out.println("Computer has choosen its move");
            System.out.println();
            System.out.println("Now its your turn to choose");
            System.out.println();
            String userChoose;
            while (true){
                System.out.println("Choose Between rock paper scissor");
                 userChoose = input.nextLine();
                if(userChoose.equals("rock") || userChoose.equals("paper") || userChoose.equals("scissor")){
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("Invalid Input");
                System.out.println();
                System.out.println("Choose the right input");
            }

            System.out.println("Computer Choose: "+computerChoose);

            if(userChoose.equals(computerChoose)){
                System.out.println("The Game Is Draw");
            } else if (userChoose.equals("rock")) {
                   if (computerChoose.equals("paper")){
                    System.out.println("Yours bad Computer Wins");
                    System.out.println("Better luck for next time");
                   } else if (computerChoose.equals("scissor")) {
                       System.out.println("Hurray You Won Buddy 😌😌😌");
                       System.out.println("Congratulations");
                   }

            } else if (userChoose.equals("paper")) {
                      if (computerChoose.equals("scissor")){
                          System.out.println("Yours bad Computer Wins");
                          System.out.println("Better luck for next time");
                      } else if (computerChoose.equals("rock")) {
                          System.out.println("Hurray You Won Buddy 😌😌😌");
                          System.out.println("Congratulations");
                      }
             } else {
                     if (computerChoose.equals("rock")){
                         System.out.println("Yours bad Computer Wins");
                         System.out.println("Better luck for next time");
                     } else if (computerChoose.equals("paper")) {
                         System.out.println("Hurray You Won Buddy 😌😌😌");
                         System.out.println("Congratulations");
                     }
            }

            System.out.println();
            String playAgain;
            System.out.println("Do you Want to play again");

            while (true){
                System.out.println("Type yes or no");
                playAgain = input.nextLine();

                if (playAgain.equals("yes") || playAgain.equals("Yes") ||playAgain.equals("no") ||playAgain.equals("No")){
                    System.out.println();
                    System.out.println("*******************************************************************************");
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("invalid Input");
                System.out.println();
            }

          if(playAgain.equals("no") || playAgain.equals("No")){
              break;
          }
        }



    }
}