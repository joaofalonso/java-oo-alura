import java.util.Scanner;

public class Challenge {

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
        System.out.println("Please insert the name of the account owner:");
        clientName = scanner.nextLine();
        System.out.println("Insert the start amount:");
        balance = scanner.nextDouble();
        String accountData = """
                ************************************************************
                Account Owner : %S
                Balance : R$ %S
                ************************************************************
                """.formatted(clientName, balance);
        System.out.println(accountData);
        String accountStatemnts = "Bank Statement";
        int option = 0;
        while(option != 4){
            System.out.println("--------------------------------------------");
            System.out.println(menu);

            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println(accountData);
                    break;
                case 2:
                    System.out.println("Insert a description for the movement.");
                    String description = scanner.next();
                    System.out.println("Insert the amount to deposit");
                    double amount = scanner.nextDouble();

                    accountStatemnts += "\n" + description + ":" + amount;
                    System.out.println("Validating the process...");
                    balance += amount;
                    accountData = """
                                ************************************************************
                                Account Owner : %S
                                Balance : R$ %S
                                ************************************************************
                                %S
                                """.formatted(clientName, balance, accountStatemnts);
                    break;

                case 3:
                    System.out.println("Insert a description for the movement.");
                    description = scanner.next();
                    System.out.println("Insert the amount to deposit");
                    amount = scanner.nextDouble();

                    if(balance >= amount)
                    {
                        balance -= amount;
                        accountStatemnts += "\n"+ description + " : -" + amount;
                        accountData = """
                                    ************************************************************
                                    Account Owner : %S
                                    Balance : R$ %S
                                    ************************************************************
                                    %S
                                    """.formatted(clientName, balance, accountStatemnts);

                    }else{
                        System.out.println("The current value in your account is lower than the value you want to to withdraw.");
                    }
                    break;

                case 4:


                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
        System.out.println("Closing the application");
        scanner.close();

    }
}

