import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] inventory = new String[5];
    public static String[] starterWeapon = new String[3];
    public static String[] rooms = new String[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //rooms
        rooms[0] = "Room 1";
        rooms[1] = "Room 2";
        rooms[2] = "Room 3";

        //Starter weapons
        starterWeapon[0] = "Rusty Sword";
        starterWeapon[1] = "Wooden Staff";
        starterWeapon[2] = "Bronze Bow";


        // main game code starts here
        welcomeScreen();
        System.out.println("Choose your starter weapon");
        System.out.println("\nType 1 for melee, 2 for mage & 3 for ranged");
        String starterWepChoice = scanner.nextLine();

        //puts weapon in inventory depending on choice
        while (true) {
            if (starterWepChoice.equals("1")) {
                System.out.println("You chose a " + starterWeapon[0]);
                addInventory(starterWeapon[0]);
                getInventory();
                break;
            }
            else if (starterWepChoice.)


        }

        addInventory("Sword");


    }

    public static void welcomeScreen() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("What is your name? ");
        String charName = scanner.nextLine();
        System.out.println("So your name is, " + charName + "...\n");
        timer(1000);
        System.out.println(charName + ", you are lost in a dark forest and need to find your way out before nightfall. " + "You must navigate through the forest, overcome obstacles, and make strategic decisions to reach safety.");


    }

    public static void getInventory() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null || inventory[i].equals("")) {
                inventory[i] = i + 1 + ". Empty]";
            }
        }
        System.out.println(Arrays.toString(inventory));
    }

    public static void addInventory(String item) {

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = i + 1 + ". " + item;
                break;
            }
        }
    }

    public static void timer(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
        }
    }
}
