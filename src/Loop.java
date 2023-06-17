import java.util.Scanner;

public class Loop
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade; //Dont need to be initialized because the first use set a value - line 12
        double mean = 0; //Need to be initialized due to the first is a incremental
        for (int i = 0; i < 3; i++) {
            System.out.println("Input your grade");
            grade = scan.nextInt();
            mean += grade;
        }
        System.out.println(mean/3);
    }
}
