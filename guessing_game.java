import java.util.Scanner;

public class guessing_game {
    
    public static void main(String[]args){
        
        int rand = ((int)(Math.random()*100));
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        
        do{
            System.out.println("Enter your guess number :");
            guess = sc.nextInt();
            if(guess == rand){
                System.out.println("Great your guess was correct!!!");
                break;
            }
            else if (guess >= rand){
                System.out.println("Your guess was too high");
            }
            else{
                System.out.println("Your guess was too low");
            }
        }while (guess >= 0);
            
        System.out.print("The number was :");
        System.out.println(rand);
        
    }
}