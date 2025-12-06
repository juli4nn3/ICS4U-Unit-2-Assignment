/*
 * This program uses different fables to create a new story.
 * Each character is instantiated as their own object to their own  
 * subclass,
 * revolving around the same abstract superclass.
 * 
 * @author  Julianne Leblanc-Peltier
 * @version 1.0
 * @since   December 2, 2025
 */
public final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     * @throws IllegalStateException if this is ever called
     */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // variables
        final String statusString = "Status:";
        final String newSpeedString = "New speed: ";
        final int threeConst = 3;
        final int sixtyConst = 60;
        final int sixSevenConst = 67;
        final int oneConst = 1;
        final int fiveConst = 5;
        final int tenConst = 10;
        final int twoConst = 2;

        // Tortoise Object
        System.out.println("\nTortoise has entered the ring!");
        Tortoise tortoise = new Tortoise("Gojo Satoru", "tortoise", "blue",
        "Domain Expansion", threeConst);

        System.out.print(statusString);
        tortoise.status();

        System.out.println("\nTest acceleration of 10 for 1 second");
        tortoise.accelerate(tenConst, oneConst);
        System.out.println("Speed: " + tortoise.getSpeed());

        System.out.println("\nTest brake of 1 for 2 second");
        tortoise.brake(threeConst, twoConst);
        System.out.println("Speed: " + tortoise.getSpeed());

        System.out.println("\nTesting Special Ability...");
        tortoise.specialAbility();

        // Hare Object
        System.out.println("\nHare has entered the ring!");
        Hare hare = new Hare("Usagi", "hare", "yellow",
        "Sailor Moon", sixtyConst);

        System.out.print(statusString);
        hare.status();

        // Fox Object
        System.out.println("\nFox has entered the ring!");
        Fox fox = new Fox("Arachnes", "fox", "red", "Hubris", sixSevenConst);

        System.out.print(statusString);
        fox.status();

        // Scorpion Object
        System.out.println("\nScorpion has entered the ring!");
        Scorpion scorpion = new Scorpion("Icarus", "scorpion", "brown",
        "Sting!", oneConst);

        System.out.print(statusString);
        scorpion.status();

        System.out.println("\nTesting Special Ability...");
        scorpion.specialAbility();

        System.out.println("\nDone! :)");
    }
}
