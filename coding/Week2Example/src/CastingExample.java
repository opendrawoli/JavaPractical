import java.util.Scanner;

public class CastingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display title
        System.out.println("Lifeboat Calculator");

        // Ask user for input
        System.out.print("Enter the name of the ship: ");
        String shipName = scanner.nextLine();
        
        System.out.print("Enter the number of people on board the ship: ");
        int totalPeople = scanner.nextInt();
        
        System.out.print("Enter the maximum number of people that can be carried by one lifeboat: ");
        int maxCapacityPerLifeboat = scanner.nextInt();
        
        System.out.print("Enter the actual number of lifeboats available on board the ship: ");
        int numberOfLifeboats = scanner.nextInt();

        // Calculate results
        int minLifeboatsRequired = (int) Math.ceil((double) totalPeople / maxCapacityPerLifeboat);
        int peopleRescued = Math.min(totalPeople, numberOfLifeboats * maxCapacityPerLifeboat);
        int peopleDrowned = totalPeople - peopleRescued;
        double rescuePercentage = ((double) peopleRescued / totalPeople) * 100;
        double drownPercentage = ((double) peopleDrowned / totalPeople) * 100;
        int additionalPeopleSaved = Math.max(0, (numberOfLifeboats * maxCapacityPerLifeboat) - totalPeople);

        // Display results
        System.out.println("\nResults for " + shipName + ":");
        System.out.println("Minimum number of lifeboats required: " + minLifeboatsRequired);
        System.out.println("People rescued: " + peopleRescued + " (" + rescuePercentage + "% of all people on board)");
        System.out.println("People drowned: " + peopleDrowned + " (" + drownPercentage + "% of all people on board)");
        
        
        if (peopleDrowned == 0) {
            System.out.println("Additional people that could be carried by lifeboats if filled to capacity: " + additionalPeopleSaved);
        }

        scanner.close();
    }
}
