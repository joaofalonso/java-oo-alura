import java.util.Scanner;

public class Chalenge {


    /*Dados
    Operações
        1 - ?
        2 - ?
        3 - ?
        4 - ?
        **Use for and while in the code
        **
           Text Block Example """
            Some parameter: %s
            """.formatted("data");
    */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String menu = """
                Select a option:
                    1. View Account Data
                    2. Deposit
                    3. Withdraw
                    4. Exit Appliction
                """;
        String clientName = "";
        double balance = 0.0;
        boolean run = true;
        System.out.println("Please insert the name of the account owner:");
        clientName = scanner.nextLine();
        System.out.println("Insert the start amount:");
        balance = scanner.nextDouble();
        String accountData = """
                Account Owner : %S
                Balance : R$ %S
                """.formatted(clientName, balance);
        System.out.println(accountData);
        while(run){
            System.out.println(menu);
            int option = scanner.nextInt();
            switch (option){
                case 4:
                    System.out.println("Closing the application");
                    run = false;
                    break;
            }
        }
        scanner.close();

    }
}

