import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your character name");
        String charName = scan.nextLine();
        //System.out.println(charName);
        System.out.println("Choose your class.\n1. Warrior \n2. Wizard \n3.Cleric \n4.Rogue");
        int classIndex = scan.nextInt();
        String characterClass = "";
        switch (classIndex) {
            case 1:
                characterClass = "Warrior";
                break;
            case 2:
                characterClass = "Wizard";
                break;
            case 3:
                characterClass = "Cleric";
                break;
            case 4:
                characterClass = "Rogue";
                break;
            default:
                characterClass = "Invalid Class";
                break;
        }
        System.out.println(charName + " - " + characterClass);
        scan.close();
    }
}
