import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String[] inventory = new String[5];

    public static void main(String[] args) {

        //define char
        String charName = "";

        //define rooms
        ArrayList<String>  rooms = new ArrayList<String>();
        rooms.add("Room 1");
        rooms.add("Room 2");
        rooms.add("Room 3");
        //test - System.out.println(rooms);


        welcomeScreen();

        
    }

    public static void welcomeScreen(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String charName = scanner.nextLine();
        System.out.println("So your name is, " + charName + ".\n");
        System.out.println("You are lost in a dark forest and need to find your way out before nightfall. " +
                "You must navigate through the forest, overcome obstacles, and make strategic decisions to reach safety.");


    }

    public static String[] getInventory(){
        return inventory;
    }
}
