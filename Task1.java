import java.util.Random;
import java.util.Scanner;
 
//                               T  A  S   K  2

// Initialized class

public class Task1
 {
     public void check(int guess,int Number)
     {
           if(guess>Number)
              {
                 System.out.println("Your Guess is too high");
                 System.out.println("Please enter the lower number");
              }

              else{
                      System.out.println("Your Guess is too low");
                 System.out.println("Please enter the higher number");
              }
     }

     public void toCorrect(int guess,int count,int number)
     {
            System.out.println("Congratulations!!  You guessed the correct number");
            System.out.println("Well done");
            System.out.println("Your score is : " + count);
        
     }
  


    public static void main(String[] args) {
        
        // create random number generator function
        Random rand = new Random();
        
        // Generating a random number beween 1 to 100
        int Number = rand.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        
        
        // Enter the number
        System.out.println("Guess the number :-");
        guess = scanner.nextInt();
        int count = 10;
        
        System.out.println("OOPS!!  You guessed the wrong number");
        
        if(guess == 0)
        {
            System.out.println("Enter the number greater than 1");
        }
        
        Task1 obj = new Task1();
        
        while(true)
        {
            
            // System.out.println("Random number is " + Number);
            System.out.println("Enter the guessing number again :");
            
            guess = scanner.nextInt();

               if(guess !=Number)
            {
                obj.check(guess,Number);
            }
            else if(guess ==  Number)
            {
                obj.toCorrect(guess,count,Number);
                  System.out.println();
                  System.out.println("Press 1 to enter the another Game");
                  System.out.println("Press 0 to exit");
                  
                  int bin = scanner.nextInt();
                   
                  if(bin ==1)
                  {
                         System.out.println("Welcome to the new game");
                  }

                   else if(bin == 0)
                {
                          System.out.println("Game End");
                          System.out.println("Your Score is : "+ count );
                          break;
                  }

                  else if(bin!=1 && bin!=0)
                  {
                       System.out.println("Invalid Number");
                       System.out.println("Please Enter either 1 or 0 to continue or exit the game");
                       bin = scanner.nextInt();

                       while(bin==1)
                       {
                             Number = rand.nextInt(100) + 1;
                       }
                    }
                }
              
                count = count +10;
        }
                scanner.close(); 
    }
 }