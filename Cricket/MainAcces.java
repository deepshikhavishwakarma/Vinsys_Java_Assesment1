package Cricket;

import java.util.Scanner;

public class MainAcces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[5];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("City: ");
            String city = sc.nextLine();
            System.out.print("Age: ");
            float age = sc.nextFloat();
            sc.nextLine();

            players[i] = new Player(name, city, age);
        }
        int captainIndex = RandomGenerator.getRandomNumber(players.length);
        Player captain = players[captainIndex - 1];
        
        System.out.println("----------------------------------");
        System.out.println("Captain is selected!");
        System.out.println("Captain's Details here:");
        captain.display();
 
        System.out.println("----------------------------------");
       
        int randomPlayerNumber = RandomGenerator.getRandomNumber(players.length);
        System.out.println("Selected Player's Details:");
        players[randomPlayerNumber - 1].display();

        System.out.println("All Players' Details here:");
        for (Player k : players) {
            k.display();
        }
        sc.close();
    }
}
