import java.util.Random;
import java.util.Scanner;

public class AnotherLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("I've picked a random number from 0 to 10, which one ?");
        int answer = new Random().nextInt(10);
        //System.out.println(answer); //to test, or cheat ¬¬

        int guess = 0;
        boolean victory = false;
        int maxTries = 3;
        int tries = 0;

        while(tries < maxTries){
            System.out.println("Input your guess");
            guess = scan.nextInt();
            tries++;
            if(guess == answer)
            {
                System.out.println("That's right, the number I've picked is " + answer);
                victory = true;
                break;
            }else{
                System.out.println("Wrong answer, try again.");
            }
        }

        if(victory){
            System.out.println("Congratulations, you could guess the right number in " + tries + "tries");
        }else{
            System.out.println("The number was " + answer);
        }

    }
}
